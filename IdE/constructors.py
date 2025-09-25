class Student:
    STUDENT_NAME = "SEMI COLON"
    def __init__(self, name, age=None):   # constructor
        self.name = name
        self.age = None
        self.contacts = []
        if age is not None:   # only set if provided
            self.set_age(age)

    def get_age(self):
        return self.age

    def set_age(self, value):
        if value < 0:
            raise ValueError("Age must be >= 0")
        self.age = value

    def get_student_details(self):
        return f"Student Name: {self.name}\nStudent Age: {self.age}"

    def get_name(self):
        if self.name is None:
            return "No name assigned"
        return self.name

    def add_contact(self, contact):
        self.contacts.append(contact)



student1 = Student("John", 20)
student2 = Student(name="Joy", age=18)
student3 = Student("Olamide")  # no age provided

print(student1.get_student_details())
print(student2.get_student_details())
print(student3.get_student_details())  # age will be None
print(student3.get_age())  # should return None
