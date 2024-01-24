"""
19. Use profile/cprofile to check pythogorian triples code in python. Think about time
complexity of the code.

"""
import cProfile  # Importing the cProfile module


def find_pythagorean_triples(n):
    # Function to find Pythagorean triples up to a given limit 'n'
    triples = []  # List to store the Pythagorean triples
    for a in range(1, n):  # Iterate over values of 'a' from 1 to 'n'
        for b in range(a, n):  # Iterate over values of 'b' from 'a' to 'n'
            # Calculate the value of 'c' using the Pythagorean theorem
            c = (a**2 + b**2) ** 0.5
            if c.is_integer() and c <= n:
                # Check if 'c' is an integer and within the limit 'n'
                # Add the Pythagorean triple (a, b, c) to the list
                triples.append((a, b, int(c)))
    return triples  # Return the list of Pythagorean triples


# Profile the code
cProfile.run('find_pythagorean_triples(1500)')
