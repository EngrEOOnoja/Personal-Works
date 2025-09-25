import unittest
from constructors import Student   # assuming Student class is saved in constructors.py


class TestStudent(unittest.TestCase):

    def setUp(self):
        # Correct object creation (use = not :)
        self.s1 = Student(name="Abdulrahman", age=23)
        self.s2 = Student("Joy", 18)
        self.s3 = Student("Olamide")  # no age

    # 1. Test instantiation with valid details
    def test_that_student_class_can_be_instantiated_with_valid_details(self):
        self.assertEqual(self.s1.get_name(), "Abdulrahman")
        self.assertEqual(self.s1.get_age(), 23)

    # 2. Test that student age can be updated with setter
    def test_that_student_age_can_be_updated(self):
        self.s1.set_age(30)
        self.assertEqual(self.s1.get_age(), 30)

    # 3. Test that negative age raises error
    def test_that_negative_age_raises_error(self):
        with self.assertRaises(ValueError):
            self.s1.set_age(-5)

    # 4. Test student created without age has None
    def test_that_student_without_age_has_none(self):
        self.assertIsNone(self.s3.get_age())

    # 5. Test student details formatting
    def test_get_student_details_returns_correct_string(self):
        details = self.s2.get_student_details()
        expected = "Student Name: Joy\nStudent Age: 18"
        self.assertEqual(details, expected)

    # 6. Test adding contacts
    def test_that_contacts_can_be_added(self):
        self.s1.add_contact("08012345678")
        self.s1.add_contact("joy@email.com")
        self.assertIn("08012345678", self.s1.contacts)
        self.assertIn("joy@email.com", self.s1.contacts)
        self.assertEqual(len(self.s1.contacts), 2)

    # 7. Test get_name when name is None
    def test_that_get_name_returns_default_if_none(self):
        student = Student(name=None)
        self.assertEqual(student.get_name(), "No name assigned")


if __name__ == "__main__":
    unittest.main()
