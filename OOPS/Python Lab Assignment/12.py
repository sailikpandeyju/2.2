"""
12. Create a BankAccount class. Your class should support these methods: deposit,
withdraw, get_balance, change_pin. Create one SavingsAccount class that behaves just like
a BankAccount class, but also has an interest rate and a method that increases the balance by
the appropriate amount of interest. Create another FeeSavingsAccount class that behaves
just like a SavingsAccount, but also charges a fee every time you withdraw money. The fee
should be set in the constructor and deducted before each withdrawal.

"""


class BankAccount:
    def __init__(self, balance, pin):
        # Initialize private variable __balance with the provided balance
        self.__balance = balance
        self.__pin = pin  # Initialize private variable __pin with the provided PIN

    def deposit(self, amount):
        self.__balance += amount  # Add the provided amount to the __balance

    def withdraw(self, amount):
        if amount > self.__balance:  # Check if the amount is greater than the __balance
            return f"Not have sufficient balance! Balance: {self.__balance}"
        self.__balance -= amount  # Subtract the amount from the __balance
        return f"Withdraw Successful! Available Balance: {self.__balance}"

    def get_balance(self):
        return self.__balance  # Return the current __balance

    def change_pin(self, new_pin):
        self.__pin = new_pin  # Change the __pin to the provided new PIN

    def _get_pin(self):
        return self.__pin  # Return the current __pin


class SavingsAccount(BankAccount):
    def __init__(self, balance, pin, interest_rate):
        # Initialize the parent class (BankAccount) with balance and pin
        super().__init__(balance, pin)
        # Initialize private variable __interest_rate with the provided interest rate
        self.__interest_rate = interest_rate

    def apply_interest(self):
        # Calculate the interest based on balance and interest rate
        interest = super().get_balance() * self.__interest_rate / 100
        super().deposit(interest)  # Deposit the calculated interest to the balance
        # Return a string indicating the success and the new balance
        return f"{self.__interest_rate}% applied successfully! New Balance: {super().get_balance()}"


class FeeSavingsAccount(SavingsAccount):
    def __init__(self, balance, pin, interest_rate, withdraw_fee):
        # Initialize the parent class (SavingsAccount) with balance, pin, and interest rate
        super().__init__(balance, pin, interest_rate)
        # Initialize private variable __withdraw_fee with the provided withdrawal fee
        self.__withdraw_fee = withdraw_fee

    def withdraw(self, amount, pin):
        if pin != super()._get_pin():  # Check if the provided pin matches the current pin
            return "Incorrect Pin!"
        # Calculate the total withdrawal amount by adding the amount and withdrawal fee
        total_amount = amount + self.__withdraw_fee
        # Withdraw the total amount from the balance using the parent class's (SavingsAccount) withdraw method
        return super().withdraw(total_amount)


# Creating a SavingsAccount instance
balance = float(input("Enter initial balance for Savings Account: "))
pin = int(input("Enter PIN for Savings Account: "))
interest_rate = float(input("Enter interest rate for Savings Account: "))
savings_account = SavingsAccount(balance, pin, interest_rate)

# Applying interest
print(savings_account.apply_interest())

# Creating a FeeSavingsAccount instance
balance = float(input("Enter initial balance for Fee Savings Account: "))
pin = int(input("Enter PIN for Fee Savings Account: "))
interest_rate = float(input("Enter interest rate for Fee Savings Account: "))
withdraw_fee = float(input("Enter withdraw fee for Fee Savings Account: "))
fee_savings_account = FeeSavingsAccount(
    balance, pin, interest_rate, withdraw_fee)

# Performing operations on FeeSavingsAccount
amount = float(input("Enter withdrawal amount for Fee Savings Account: "))
pin = int(input("Enter PIN for Fee Savings Account: "))
print(fee_savings_account.withdraw(amount, pin))
print(f"Current balance: {fee_savings_account.get_balance()}")

new_pin = int(input("Enter new PIN for Fee Savings Account: "))
fee_savings_account.change_pin(new_pin)
print("PIN changed successfully!")
