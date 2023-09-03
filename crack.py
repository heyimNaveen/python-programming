import string
import itertools

for passcode in itertools(string, repeat=4):
    print(*passcode)
