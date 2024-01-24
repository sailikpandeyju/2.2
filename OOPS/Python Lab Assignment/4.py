"""

Write a regular expression to validate a phone number.

"""

import re

# Compile the regular expression pattern for phone numbers
pattern = re.compile("^\+?(0|91)?\-?[6-9]\d{9}$")

# Get user input for a phone number
phoneNumber = input("Enter your first Number: ")

# Check if the phone number matches the pattern
if (pattern.match(phoneNumber)):
    print("This is valid")
else:
    print("This is not valid")
