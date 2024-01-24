"""
17. Write a function that flattens a nested dictionary structure like one obtain from
Twitter and Facebook APIs or from some JSON file.

nested = {
    'fullname': 'Alessandra',
    'age': 41,
    'phone-numbers': ['+447421234567', '+447423456789'],
    'residence': {
        'address': {
            'first-line': 'Alexandra Rd',
            'second-line': '',
            Testing, Profiling, and Dealing with Exceptions
            [ 230 ]
        },
        'zip': 'N8 0PP',
        'city': 'London',
        'country': 'UK',
    },
}

"""

import json  # Importing the json module


def flatten_dictionary(parent, value):
    # Recursive function to flatten the nested dictionary
    if type(value) != dict:
        # If the value is not a dictionary, add it to the flattened dictionary
        flattened[parent] = value
    else:
        # If the value is a dictionary, iterate over its items
        for each_child_key, each_child_value in value.items():
            if each_child_key == "":
                # If the child key is an empty string, flatten the value using the same parent
                flatten_dictionary(parent, each_child_value)
            else:
                if parent != "":
                    # If the parent is not an empty string, use dot notation to create a new key
                    flatten_dictionary(
                        parent + "." + each_child_key, each_child_value)
                else:
                    # If the parent is an empty string, create a new key without dot notation
                    flatten_dictionary(each_child_key, each_child_value)


flattened = {}  # Create an empty dictionary to store the flattened key-value pairs

with open("json.txt", 'r') as file:
    data = json.load(file)  # Load the JSON data from the file

for key, value in data.items():
    # Flatten each key-value pair in the JSON data
    flatten_dictionary(key, value)

for key_value in flattened.items():
    print(key_value)  # Print each flattened key-value pair
