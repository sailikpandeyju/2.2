"""
8. Create a list of all the numbers up to N=50 which are multiples of five using anonymous
function.

"""


# Function to calculate the remainder of a number divided by 5
def remainder(x):
    return x % 5


# List to store numbers divisible by 5
divisible_by_5 = []

# Get the value of N from user input
N = int(input("Enter the value of N: "))

# Counter variable
i = 0

# Iterate until the desired number of divisible_by_5 elements are found
while True:
    if (remainder(i) == 0):
        divisible_by_5.append(i)
    i += 1
    if (len(divisible_by_5) == N):
        break

# Print the list of numbers divisible by 5
print(divisible_by_5)

# Generate a new list of numbers divisible by 5 using filter and lambda function
divisible_by_5_new = list(filter(lambda x: x % 5 == 0, range(0, N+1)))

# Print the new list of numbers divisible by 5
print(divisible_by_5_new)
