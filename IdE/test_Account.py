import unittest
from Account import Account

class TestAccount(unittest.TestCase):

    def setUp(self):
        self.acc = Account("Test User", 25)

    def test_deposit_valid_amount(self):
        self.acc.deposit(1000)
        self.assertEqual(self.acc.balance, 1000)

    def test_withdraw_valid_amount(self):
        self.acc.deposit(1000)
        self.acc.withdraw(400)
        self.assertEqual(self.acc.balance, 600)

    def test_deposit_negative_amount(self):
        with self.assertRaises(ValueError) as context:
            self.acc.deposit(-500)
        self.assertEqual(str(context.exception), "Deposit amount must be greater than 0")

    def test_withdraw_more_than_balance(self):
        self.acc.deposit(300)
        with self.assertRaises(ValueError) as context:
            self.acc.withdraw(500)
        self.assertEqual(str(context.exception), "Insufficient funds")

    def test_withdraw_negative_amount(self):
        with self.assertRaises(ValueError) as context:
            self.acc.withdraw(-200)
        self.assertEqual(str(context.exception), "Withdrawal amount must be greater than 0")


    def test_no_withdrawal_more_than_funds(self):
        with self.assertRaises(ValueError) as context:
            self.acc.withdraw(200)
        self.assertEqual(str(context.exception), "Insufficient funds")

    def test_deposit_invalid_amount(self):
        with self.assertRaises(ValueError) as context:
            self.acc.deposit(-100)
        self.assertEqual(str(context.exception), "Deposit amount must be greater than 0")

    def test_withdraw_more_than_funds(self ):
        with self.assertRaises(ValueError) as context:
            self.acc.withdraw(2000)
        self.assertEqual(str(context.exception), "Insufficient funds")

    def test_deposit_greater_than_funds(self):
        with self.assertRaises(ValueError) as context:
            self.acc.deposit(-1000)
        self.assertEqual(str(context.exception), "Deposit amount must be greater than 0")

    def test_withdraw_greater_than_funds(self):
        with self.assertRaises(ValueError) as context:
            self.acc.withdraw(-1000)
        self.assertEqual(str(context.exception), "Withdrawal amount must be greater than 0")

    def test_balance_is_correct_after_withdraw(self):
        self.acc.deposit(1000)
        self.acc.withdraw(400)
        self.assertEqual(self.acc.balance, 600)

    def test_balance_is_correct_after_deposit(self):
        self.acc.deposit(1000)
        self.assertEqual(self.acc.balance, 1000)

    def test_no_withdraw_above_balance(self):
        with self.assertRaises(ValueError) as context:
            self.acc.withdraw(500)
        self.assertEqual(str(context.exception), "Insufficient funds")

    def test_to_withdraw_entire_balance(self):
        self.acc.deposit(1000)
        self.acc.withdraw(1000)
        self.assertEqual(self.acc.balance, 0)

    def test_to_withdraw_balance_bit_wise(self):
        self.acc.deposit(1000)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.acc.withdraw(100)
        self.assertEqual(self.acc.balance, 0)

    def test_to_deposit_bit_wise(self):
        self.acc.deposit(1000)
        self.acc.deposit(1000)
        self.acc.deposit(100)
        self.acc.deposit(100)
        self.acc.deposit(100)
        self.acc.deposit(100)
        self.acc.deposit(100)
        self.acc.deposit(100)
        self.assertEqual(self.acc.balance, 2600)

    def test_name(self):
        self.assertEqual(self.acc.name, "Test User")




if __name__ == "__main__":
    unittest.main()
