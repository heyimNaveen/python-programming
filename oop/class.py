# class Employee:

#     def __init__(self, first, last, pay):
#         self.first= first
#         self.last=last
#         self.pay=pay
#         self.email= first + '.' + last + '@gamil.com'

#     def fullname(self):
#         return '{} {}'.format(self.first, self.last)

# emp_1 = Employee('Naveen', 'Kumar', 50000)
# emp_2 = Employee('Praveen', 'Kumar', 60000)

# # print(emp_1)
# # print(emp_2)



# print(emp_1.first)
# print(emp_2.email)
# print(emp_2.fullname())

class Student:

    def __init__(self,rollno,name):
        self.name=name
        self.rollno=rollno

    def talk(self):
        print("Hello My name is:", self.name)
        print("My Rollno is:",self.rollno)

s_1 = Student(502,'Naveen')
s_2 = Student(503,'praveen')

print(s_1.name)
print(s_1.rollno)
s_1.talk()
s_2.talk()
    


