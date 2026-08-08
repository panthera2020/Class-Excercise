
import unittest

from account_function import check_balance

class AccountTest(unittest.TestCase):
    
    def test_accountBalance_isZero_duringCreation(self):
        expected_balance = 0
        
        actual_balance = check_balance()
        
        self.assertEqual(expected_balance, actual_balance)
        
        
    def test_thatAccount_canBeDepositedInto_afterCreation(self):
        
        amount = 500.0
        
        self.assertEqual(0, check_balance)
        
        deposit(amount)
        
        self.assertEqual(500.o, check_balance)

#    def test_sample(self):
#    
#        result = 15
#        
#        first_number = 10
#        
#        second_number = 5
#        
#        summation = first_number + second_number
#        
#        self.assertTrue(summation == result)
#        
#        self.assertEqual(summation, result)
#        

