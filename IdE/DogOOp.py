class Pet:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print(f"I am {self.name} and I am {self.age} years old")

    def speak(self):
        print("i dont know what to say")


class Cat(Pet):
    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color
    def speak(self):
        print("meow")
    def show(self):
        print(f"I am {self.name} and I am {self.age} years old and I am {self.color}")

class Dog(Pet):
    def speak(self):
        print("woof")

class Fish(Pet):
    pass

#
# p = Pet("Tim", 30)
# p.show()
# p.speak()
#
# c = Cat("Bill", 25, "Red")
# c.show()
# c.speak()
#
# d = Dog("Kim", 25)
# d.show()
# d.speak()
#
# f = Fish("John", 15)
# f.show()
# f.speak()



class Person:
    number_of_persons = 0
    def __init__(self, name):
        self.name = name
        Person.add_person()

    @classmethod
    def number_of_person_(cls):
        return cls.number_of_persons

    @classmethod
    def add_person(cls):
        cls.number_of_persons += 1
       

p1 = Person("John")
p2 = Person("Bill")
print(Person.number_of_person_())


#STATIC METHODS
class Math:

    @staticmethod
    def add(a, b):
        return a + b
    @staticmethod
    def subtract(a, b):
        return a - b
    @staticmethod
    def multiply(a, b):
        return a * b
    @staticmethod
    def divide(a, b):
        return a / b
    @staticmethod

    @staticmethod
    def power():
        print("50")

Math.power()