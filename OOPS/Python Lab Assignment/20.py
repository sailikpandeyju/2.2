"""
20. Write a python program to
i. read lines from a file, break into tokens and convert the tokens to unique numerical
values using python dictionary.
ii. Convert lines of different lengths into lines of same length (maximum length). Use
padding if and when required.

"""


def convert_lines(file_path):
    # Function to convert lines of text in a file to numerical representation

    lines = []  # List to store the lines of text
    tokens = set()  # Set to store unique tokens
    with open(file_path, 'r') as file:  # Open the file in read mode
        for line in file:  # Iterate over each line in the file
            line = line.strip()  # Remove leading and trailing whitespace
            lines.append(line)  # Add the line to the list
            # Split the line into tokens and add them to the set
            tokens.update(line.split())

    token_dict = {token: i + 1 for i, token in enumerate(tokens)}
    # Create a dictionary that maps each token to a unique numerical value
    # The numerical values start from 1 and increment by 1 for each token

    max_length = max(len(line) for line in lines)
    # Find the maximum length among all the lines

    numerical_lines = []
    # List to store the numerical representation of the lines
    for line in lines:  # Iterate over each line
        numerical_line = [token_dict[token] for token in line.split()]
        # Convert each token in the line to its corresponding numerical value
        numerical_line += [0] * (max_length - len(numerical_line))
        # Pad the numerical line with zeros to match the maximum length
        # Add the numerical line to the list
        numerical_lines.append(numerical_line)

    return numerical_lines  # Return the list of numerical lines


file_path = 'input.txt'  # Path to the input file
# Call the convert_lines function with the file path
numerical_lines = convert_lines(file_path)
print(numerical_lines)  # Print the numerical representation of the lines
