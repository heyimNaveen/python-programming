def main():
    height = h()
    for i in range(height):
        print("#")

def h():
    while True:
        try:
            n =int(input("Height: "))
            if n > 0:
                break
        except ValueError:
            print("That's not an intrger!")    
    return n  

main()  