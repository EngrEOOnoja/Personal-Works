from unittest import TestCase
import function_snacks


class TestFunctionSnacks(TestCase):
	def test_that_function_snacks_exists(self):
		result = function_snacks.get_divide_or_square(25)
		self.assertEqual(result, 25)