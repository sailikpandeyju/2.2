"""
14. Implement a priority queue that sorts items by a given priority and always returns the
item with the highest priority on each pop operation.

"""

import heapq  # Import the heapq module for priority queue operations


class priority_queue:
    def __init__(self):
        self.__queue = []  # Initialize an empty list to store the items in the priority queue
        self.__index = -1  # Initialize the index to -1

    def is_empty(self):
        # Check if the index is -1 to determine if the priority queue is empty
        return self.__index == -1

    def push(self, item, priority):
        self.__index += 1  # Increment the index
        # Push the item into the priority queue using heapq.heappush
        heapq.heappush(self.__queue, (priority, self.__index, item))

    def pop(self):
        # Pop the item with the highest priority from the priority queue using heapq.heappop
        a, b, c = heapq.heappop(self.__queue)
        self.__index -= 1  # Decrement the index
        return c  # Return the item


pq = priority_queue()  # Create an instance of the priority_queue class

# Get the number of items to enter from the user and add them to the priority queue
for i in range(0, int(input("Enter the number of items you want to enter: "))):
    pq.push(input("Enter item: "), int(input("Enter priority: ")))

# Print the items in the priority queue by popping them until the queue is empty
while not pq.is_empty():
    print(pq.pop())
