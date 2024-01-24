"""
15. Make a list of the largest or smallest N items in a collection.

"""

import heapq  # Import the heapq module for finding largest/smallest items

list = []  # Create an empty list to store the items

# Get the number of items to enter from the user and add them to the list
for i in range(int(input("Enter the number of items you want to enter: "))):
    list.append(input())

n = int(input("Enter N: "))  # Get the value of N from the user

# Find the N largest items in the list using heapq.nlargest and print the result
print(f"N largest items are: {heapq.nlargest(n, list)}")

# Find the N smallest items in the list using heapq.nsmallest and print the result
print(f"N smallest items are: {heapq.nsmallest(n, list)}")
