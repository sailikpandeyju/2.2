"""
Write a function findfiles that recursively descends the directory tree for the specified
directory and generates paths of all the files in the tree.

"""
import os

# Function to find all files in a directory and its subdirectories


def find_files(directory):
    files_path = []
    # Walk through the directory tree using os.walk
    for root, directories, files in os.walk(directory):
        for file in files:
            # Get the full file path by joining the root and file name
            file_path = os.path.join(root, file)
            # Append the file path to the list
            files_path.append(file_path)

    return files_path


# Directory path
directory = "seven"

# Find all files in the directory
files = find_files(directory)

# Print the number of files found
print(len(files))

# Print the file paths
for file in files:
    print(file)
