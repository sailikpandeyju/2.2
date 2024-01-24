"""

Write a prime generator program using only primes and using python loops.


"""

from math import sqrt


def isPrime(n):  # function to check if a number is prime or not
    if (n == 1):  # 1 is not a prime number so return false in case of 1
        return False
    for i in range(2, int(sqrt(n))+1):  # from 2 to square root of n
        if (n % i == 0):  # division means number is not prime
            return False
    return True


# taking lower input
n1 = int(input("Enter the lower bound of the prime numbers: "))
# taking upper bound
n2 = int(input("Enter the upper bound of the prime numbers: "))

count = 0
for i in range(n1, n2+1):  # loop from lower bound to the upper bound
    if (isPrime(i)):  # checks if the number is prime, if yes -> print it
        print(i)
        count += 1

if (count == 0):
    print("No prime numbers found")
