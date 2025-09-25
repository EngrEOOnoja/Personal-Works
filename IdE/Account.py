import re


class Account:
    def __init__(self, name, age=None):  # constructor
        self.name = name
        self.age = None
        self.contacts = []
        self.phone = None
        self.balance = 0

        if age is not None:
            self.set_age(age)

    def get_age(self):
        return self.age

    def set_age(self, value):
        if value < 0:
            raise ValueError("Age must be >= 0")
        self.age = value

    def get_phone(self):
        return self.phone

    def set_phone(self, value):
        # Nigerian phone validation
        pattern = re.compile(r"^(?:\+234[0-9]{10}|234[0-9]{10}|0(7|8|9)(0|1)[0-9]{8})$")

        if not pattern.match(value):
            raise ValueError("Invalid Nigerian phone number format")

        self.phone = value

    def get_account_details(self):
        return (
            f"Account Name: {self.name}\n"
            f"Age: {self.age}\n"
            f"Phone: {self.phone}\n"
            f"Balance: {self.balance}"
        )

    def get_name(self):
        if self.name is None:
            return "No name assigned"
        return self.name

    def add_contact(self, contact):
        self.contacts.append(contact)

    def deposit(self, deposit_amount):
        if deposit_amount <= 0:
            raise ValueError("Deposit amount must be greater than 0")
        self.balance += deposit_amount
        return self.balance

    def withdraw(self, withdraw_amount):
        if withdraw_amount <= 0:
            raise ValueError("Withdrawal amount must be greater than 0")
        if self.balance < withdraw_amount:
            raise ValueError("Insufficient funds")
        self.balance -= withdraw_amount
        return self.balance


# --- Testing ---
acc1 = Account("John", 20)
acc2 = Account(name="Joy", age=18)
acc3 = Account("Olamide")  # no age provided

# Setting phones
acc1.set_phone("08012345678")
acc2.set_phone("+2347012345678")

# Transactions
acc1.deposit(1000)
acc1.withdraw(200)

print(acc1.get_account_details())
print(acc2.get_account_details())
print(acc3.get_account_details())  # age will be None, phone None
print(acc3.get_age())  # should return None

