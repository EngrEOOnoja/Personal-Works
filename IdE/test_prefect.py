import unittest
from prefect import are_perfect_squares


class TestPerfectSquares(unittest.TestCase):

    def test_all_perfect_squares(self):
        numbers = [1, 4, 9, 16, 25, 36, 49, 64]
        expected = [True, True, True, True, True, True, True, True]
        self.assertEqual(are_perfect_squares(numbers), expected)

    def test_no_perfect_squares(self):
        numbers = [2, 3, 5, 6, 7, 10, 12]
        expected = [False, False, False, False, False, False, False]
        self.assertEqual(are_perfect_squares(numbers), expected)

    def test_mixed_numbers(self):
        numbers = [4, 5, 9, 12, 25]
        expected = [True, False, True, False, True]
        self.assertEqual(are_perfect_squares(numbers), expected)

    def test_with_zero(self):
        numbers = [0, 1, 2]
        expected = [True, True, False]  # 0 and 1 are perfect squares
        self.assertEqual(are_perfect_squares(numbers), expected)

    def test_with_large_numbers(self):
        numbers = [10000, 12345, 144, 225]
        expected = [True, False, True, True]
        self.assertEqual(are_perfect_squares(numbers), expected)

    def test_with_empty_list(self):
        numbers = []
        expected = []
        self.assertEqual(are_perfect_squares(numbers), expected)


if __name__ == "__main__":
    unittest.main()
