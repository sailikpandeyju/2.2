"""
9. Enumerate the sequence of all lowercase ASCII letters, starting from 1, using
enumerate.

"""

import string

# Get the string of lowercase letters
lowercase = string.ascii_lowercase

# Create a list of tuples containing ASCII codes and corresponding lowercase letters
# Start the enumeration from 1
ascii_codes = list(enumerate(lowercase, start=1))

# Print the list of ASCII codes and lowercase letters
print(ascii_codes)
