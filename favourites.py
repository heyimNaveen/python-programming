import csv 

names = []

with open("favourites.csv","r") as file:
    reader = csv.DictReader(file)
    for  row in reader:
        if row["name"] in names:
            names.append(row["name"])
        