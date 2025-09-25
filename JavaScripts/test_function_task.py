from unittest import TestCase
import function_task

class TestFunctionTask(TestCase):
	def test_that_function_task_exists(self):
		result = function_task.get_temperature(100, 'c', 40)
		self.assertEqual(result, 100, 'c', 40)
	def test_that_function_task_is_valid(self):
		self.assertRaises(ValueError, function_task.get_temperature, -80, 'y', 0 )
	
	
		
	
	
	
	
	
	
	