people = {
    "naveen" : "6300180537",
    "praveen" : "9014960573"
}

name = input("Name: ")
if name in people:
    number = people[name]
    print(f"Number: {number}")