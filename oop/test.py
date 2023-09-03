class Test:
    def __init__(self):
        self.a=10
        self.b=20

t1=Test()
t2=Test()
t1.a=888
t2.b=999
print(t1.a,t1.b)
print(t2.a,t2.b)