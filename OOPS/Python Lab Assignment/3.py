"""

Print first 10 odd and even numbers using iterators and compress. You can use duck typing.

"""

from itertools import compress

print("********ODD NUMBERS USING ITERATORS**********")
for i in range(1, 21):  # first printing first 10 odd numbers through iterator
    if (i % 2 == 1):  # check if number is odd
        print(i)

print("********EVEN NUMBERS USING ITERATORS**********")

for i in range(1, 21):  # first printing first 10 even numbers through iterator
    if (i % 2 == 0):  # check if number is even
        print(i)

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
           11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
odd = [True, False, True, False, True, False, True, False, True, False,
       True, False, True, False, True, False, True, False, True, False]

print("********ODD NUMBERS USING COMPRESS**********")
myOdds = compress(numbers, odd)  # compress function format (data, selector)
for x in myOdds:  # iterate over the compressed data
    print(x)

print("********ODD NUMBERS USING COMPRESS**********")
even = [False, True, False, True, False, True, False, True, False,
        True, False, True, False, True, False, True, False, True, False, True]
myEven = compress(numbers, even)
for x in myEven:
    print(x)
