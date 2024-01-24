"""
10. Write a code which yields all terms of the geometric progression a, aq, aq2, aq3, ....
When the progression produces a term that is greater than 100,000, the generator stops (with
a return statement). Compute total time and time within the loop.

"""
import time

# Function to calculate geometric progression


def geometric_progression(a, q):
    result = a
    loop_start = time.time()
    while (result <= 1000000):
        result *= q
    loop_end = time.time()
    return f"Total time taken inside loop: {(loop_end-loop_start)*1000:.2f} ms"


# Get the value of 'a' from user input
a = float(input("Enter the value of 'a': "))

# Get the value of 'q' from user input
q = float(input("Enter the value of q: "))

# Start time measurement
start = time.time()

# Call the geometric_progression function and print the result
print(geometric_progression(a, q))

# End time measurement
end = time.time()

# Calculate and print the total time spent
print(f"Total time spent: {(end-start)*1000:.2f} ms")
