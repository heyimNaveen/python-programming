import csv

name = input("Name: ")
number = input("Number: ")

with open("phbk2.csv", "a")as file:

    writer = csv.writer(file)
    writer.writerow([name, number])