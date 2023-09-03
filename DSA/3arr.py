new_list = [1,2,3]
result = new_list[0]


'''searching'''
if 1 in new_list : print(True)

for n in new_list:
    if n==1:
        print(True)

        break

"""Append"""
numbers = []
numbers.append(2)
numbers.append(200)
numbers.append(2000)


"""Extend"""
numbers.extend([56,54,58])


"""Deleting"""
numbers.remove(2)
print(numbers)