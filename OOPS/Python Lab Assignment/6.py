"""

Write a simple program which loops over a list of user data (tuples containing a username,
email and age) and adds each user to a directory if the user is at least 16 years old. You do
not need to store the age. Write a simple exception hierarchy which defines a different
exception for each of these error conditions:
 the username is not unique
 the age is not a positive integer
 the user is under 16
 the email address is not valid (a simple check for a username, the @ symbol and a
domain name is sufficient)
Raise these exceptions in your program where appropriate. Whenever an exception occurs,
your program should move onto the next set of data in the list. Print a different error
message for each different kind of exception.

"""
import re

# Custom exception classes


class UserNameNotUniqueError(Exception):
    pass


class AgeNotAcceptableError(Exception):
    pass


class InvalidEmailError(Exception):
    pass

# Function to check if an email is valid


def is_valid_email(email):
    pattern = re.compile("@[a-zA-z]+\.[a-zA-Z]+$")
    return re.match(pattern, email)

# Function to add a user to the directory


def add_user_to_directory(user, directory):
    username, email, age = user

    # Check if the username is already present in the directory
    if username in directory:
        raise UserNameNotUniqueError(f"Username {username} is not unique!")

    # Check if the age is acceptable
    if age < 16:
        raise AgeNotAcceptableError(f"Age is less than 16!")

    # Check if the email is valid
    if not is_valid_email(email):
        raise InvalidEmailError(f"Email {email} is not valid!")

    # Add the user to the directory
    directory[username] = email


user_data = [
    ("sailikpandey", "pandeysailik74@gmail.com", 20),
    ("shirsendudas", "shirsendudas2003@gmail.com", 6),
    ("chandrachurmukherjee", "chandrachur67@gmail.com", 20),
    ("tanmoyroy", "roytanmoy2001@gmail.com", 21)
]

directory = {}

# Iterate over the user data and add users to the directory
for user in user_data:
    try:
        add_user_to_directory(user, directory)
    except UserNameNotUniqueError as e:
        print(str(e))
    except AgeNotAcceptableError as e:
        print(str(e))
    except InvalidEmailError as e:
        print(str(e))

print(directory)
