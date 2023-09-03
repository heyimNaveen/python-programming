import sys

names ={"Naveen", "praveen", "ram", "lakshman"}

if "ram" in names:
    print("Found")
    sys.exit(0)

print("Not Found")
sys.exit(1)