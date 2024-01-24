"""
21. Write a python program to identify and extract numerical chunks from a text file and
convert them into words; e.g.; 1992 --> “nineteen hundred and ninety two”.

"""
import re


def convert_numerical_chunks(file_path):
    # Function to convert numerical chunks in a file to words

    # Read the content of the file
    with open(file_path, 'r') as file:
        content = file.read()

    # Find all numeric chunks using regular expressions
    numerical_chunks = re.findall(r'\b\d+\b', content)
    # Uses regex to find all sequences of digits (\d+) that are surrounded by word boundaries (\b)

    converted_chunks = []
    # List to store the converted chunks
    for chunk in numerical_chunks:  # Iterate over each numeric chunk
        # Convert the chunk to words using the number_to_words function
        word = number_to_words(chunk)
        converted_chunks.append(word)  # Add the converted chunk to the list

    return converted_chunks  # Return the list of converted chunks


def number_to_words(number):
    # Function to convert a number to words

    # Define word representations for numbers
    digit_to_word = {
        '0': 'zero', '1': 'one', '2': 'two', '3': 'three', '4': 'four',
        '5': 'five', '6': 'six', '7': 'seven', '8': 'eight', '9': 'nine'
    }

    tens_to_word = {
        '10': 'ten', '11': 'eleven', '12': 'twelve', '13': 'thirteen',
        '14': 'fourteen', '15': 'fifteen', '16': 'sixteen', '17': 'seventeen',
        '18': 'eighteen', '19': 'nineteen'
    }

    tens_multiple_to_word = {
        '2': 'twenty', '3': 'thirty', '4': 'forty', '5': 'fifty',
        '6': 'sixty', '7': 'seventy', '8': 'eighty', '9': 'ninety'
    }

    # Convert number to words
    if len(number) == 1:
        return digit_to_word[number]
    elif len(number) == 2:
        if number in tens_to_word:
            return tens_to_word[number]
        else:
            return tens_multiple_to_word[number[0]] + ' ' + digit_to_word[number[1]]
    elif len(number) == 3:
        return digit_to_word[number[0]] + ' hundred ' + number_to_words(number[1:])
    elif len(number) <= 6:
        thousands = number_to_words(number[:-3])
        rest = number_to_words(number[-3:])
        if rest == 'zero':
            return thousands + ' thousand'
        else:
            return thousands + ' thousand ' + rest
    elif len(number) <= 9:
        millions = number_to_words(number[:-6])
        rest = number_to_words(number[-6:])
        if rest == 'zero':
            return millions + ' million'
        else:
            return millions + ' million ' + rest

    return number  # If the number doesn't fall into any of the above cases, return the original number


# Example usage
file_path = 'numbers.txt'  # Path to the input file
# Call the convert_numerical_chunks function
converted_chunks = convert_numerical_chunks(file_path)
print(converted_chunks)  # Print the converted chunks
