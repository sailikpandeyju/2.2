"""
13. Write an operator overloading for len which shows string length for any given string
and return only length of repetitive words with the text if the text has some repetitive parts.
Determine the most frequently occurring words using most_common.

"""

# Import the Counter class from the collections module
from collections import Counter


class string_method:
    def __init__(self, str):
        self.str = str  # Initialize the instance variable 'str' with the provided string

    def get_most_frequent_word(self):
        # Split the string into a list of words
        word_list = self.str.split(" ")
        # Count the occurrences of each word and get a list of tuples sorted by frequency
        word = Counter(word_list).most_common()
        # Create a list of tuples containing the most frequent words and their lengths
        max_frequent_words = [(x, len(x))
                              for x, count in word if count == word[0][1]]
        return max_frequent_words  # Return the list of most frequent words

    def __len__(self):
        # Return the length of the string when the len() function is called on an instance of this class
        return len(self.str)


# Create an instance of the string_method class with the input sentence
str = string_method(input("Enter a multiword sentence: "))
# Print the length of the string using the overridden __len__() method
print(f"The length of the string is: {len(str)}")
# Print the most frequent words in the string using the get_most_frequent_word() method
print(f"The most repetitive words are: {str.get_most_frequent_word()}")
