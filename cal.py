a = int(input("Enter First Number : "))
op = input("Select Operation Addition : + ,Subtraction : - , Multiply : * , Division : / --  :")
b = int(input("Enter Second Number :"))



if op == "+":
    print(a+b)
elif op == "-":
    print(a-b)
elif op == "*":
    print(a*b)
elif op == "/":
    print(a/b)
else:
    print("Invalid Operation")

