import sys

class Customer:
    '''Customer class with bank related operations'''
    bankname='NaveenBank'

    def __init__(self,name,balance=0):
        self.name = name
        self.balance = balance

    def deposit(self,amt):
        self.balance = self.balance+amt
        print('After deposit the balance:',self.balance)

    def withdraw(self,amt):
        if amt>self.balance:
            print('Insufficient Funds..cannot perform this transaction')
            sys.exit()
        self.balance = self.balance-amt
        print("After withdraw the Balance:",self.balance)


print('welcome to', Customer.bankname)
name = input('Enter Your Name:')
c = Customer(name)
while True:
    print("d-Deposit\nw-withdraw\ne-exit")
    option = input('Choose Your Option:')
    if option == 'd' or option =='D':
        amt=float(input('Enter the amount to deposit:'))
        c.deposit(amt)

    elif option == 'w' or option == 'W':
        amt = float(input('Enter amount to withdraw:'))
        c.withdraw(amt)

    elif option == 'e' or option == 'E':
        print('Thanks for Banking')
        sys.exit()

    else:
        print('Choose valid option')
