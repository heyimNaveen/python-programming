class student:
    cname='MRCET'
    def __init__(self,x,y):
        self.name=x
        self.rollno=y

    def display(self):
        print("Hello Myself is:",self.name)
        print("My Rollno is:",self.rollno)

    @classmethod
    def getCollegeName(cls):
        print('College Name:',cls.cname)

    @staticmethod
    def findAverage(x,y):
        print('Average:',(x+y)/2)

s1=student('Naveen',100)
s2=student('praveen',101)
s3=student('ram',103)

student.findAverage(100,200)