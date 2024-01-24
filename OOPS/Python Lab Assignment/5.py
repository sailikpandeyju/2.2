"""

Write first seven Fibinacci numbers using generator next function/ yield in python. Trace
and memorize the function. Also check whether a user given number is Fibinacci or not.

"""


def fibonacci(n):
    # Initialize the first two numbers of the Fibonacci sequence
    first = 0
    second = 1

    # Yield the first number (0)
    yield first

    # Check if n is greater than 0
    if (n > 0):
        # Yield the second number (1)
        yield second

        # Generate the remaining Fibonacci numbers
        for i in range(2, n+1):
            number = first + second
            yield number
            first = second
            second = number


print("The first 7 fibonacci numbers are: ")
# Generate the Fibonacci series and convert it to a list
series = list(fibonacci(7))
print(series)

# Get user input for a number to check if it is a Fibonacci number
n = int(input("Enter a number to check if it's a Fibonacci number or not: "))

# Generate the Fibonacci series up to the entered number and convert it to a list
checkn = list(fibonacci(n))

# Check if the entered number is in the Fibonacci series
if n in checkn:
    print("This number [ is ] a Fibonacci number")
else:
    print("This number [ is not ] a Fibonacci number")
