"""
18. Use parameterized or nose_parameterized to compute power of following values:
(2, 2, 4),
(2, 3, 8),
(1, 9, 1),
(0, 9, 0). Use pytest to check errors.

"""
import pytest

from parameterized import parameterized


def compute_power(x, y, expected_result):
    result = x ** y
    assert result == expected_result, f"Expected {expected_result}, but got {result}"


@pytest.mark.parametrize("x, y, expected_result", [
    (2, 2, 4),
    (2, 3, 8),
    (1, 9, 1),
    (0, 9, 0),
])
def test_compute_power(x, y, expected_result):
    compute_power(x, y, expected_result)


if __name__ == "__main__":
    pytest.main()
