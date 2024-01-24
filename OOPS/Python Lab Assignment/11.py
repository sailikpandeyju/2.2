"""
11. Search for palindrome and unique words in a text using class method and string
method.

"""
import string

# Custom string class (Note: It's generally recommended to use a different name to avoid conflicts)


class string:
    @classmethod
    # Method to check if a string is a palindrome
    def check_pal(self, str):
        return str == str[::-1]


# Get input from the user for a multiword sentence
text = input("Enter a multiword sentence: ")

# Convert the sentence to lowercase
text = text.lower()

# Split the sentence into individual words and create a set of unique words
words = set(text.split(" "))

# Print the unique words
print(f"Unique words: {words}")

# Print the palindrome words
print("Palindrome words:")
for word in words:
    if string.check_pal(word):
        print(word)
