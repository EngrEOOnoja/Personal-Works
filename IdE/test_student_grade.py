from unittest import TestCase
import student_grade


class TestTheStudentGradeFunctions(TestCase):
    def test_that_the_function_exist(self):
        student_grade.get_score(100)

    def test_that_the_function_get_score(self):
        result = student_grade.get_score(100)
        self.assertEqual(result, 100)
        result2 = student_grade.get_score(50)
        self.assertEqual(result2, 50)

    def test_that_the_function_return_grade(self):
        result3 = student_grade.get_calculate_grade(75)
        self.assertEqual(result3, "A")
        result4 = student_grade.get_calculate_grade(60)
        self.assertEqual(result4, "B")
        result5 = student_grade.get_calculate_grade(50)
        self.assertEqual(result5, "C")

    def test_that_the_function_return_feedback(self):
        result6 = student_grade.get_feedback("D")
        self.assertEqual(result6, "D")



