class Teacher:
    ''' This class developed by Naveen for Demo Purpose'''



    def __init__(self,tno,tname,tsal,taddr):

       self.tno=tno
       self.tname=tname
       self.tsal=tsal
       self.taddr=taddr

    def info(self):
        print("+"*20)
        print('Teacher  Number:',self.tno)
        print('Teacher Name:',self.tname)
        print('Teacher Salary:',self.tsal)
        print('Teacher address:',self.taddr)
        print("+"*20)


t1 = Teacher(101,'Ram',20000,'Hyd')
t2 = Teacher(102,'lakshman',20000,'Chennai')

t1.info()
t2.info()
print(Teacher.__doc__)
help(Teacher)