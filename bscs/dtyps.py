# courses = ['history', 'science', 'maths', 'english']

# nums = [1, 5 ,8, 9, 70]
# sorted_courses = sorted(courses)

# print(sum(nums))
# # print(sorted_courses)

# import pandas as pd
# marks_data=pd.DataFrame({'ID':{0:23,1:43,2:12,3:13,4:67,5:89},'NAME':{0:'Ram',1:'Deep',2:'Yash',3:'Arjun',4:'Aditya',5:'Divya'},'Marks':{0:89,1:92,2:45,3:78,4:56,5:76},'Grade':{0:'b',1:'a',2:'f',3:'c',4:'e',5:'c'}})
# filename='C:\Users\bathu\OneDrive\Desktop Marks.xls'
# marks_data.to_excel(filename)
# print('Data frame written to Excel')

import pandas as pd
url=(r'C:\Users\bathu\OneDrive\Desktop\pythn\bscs\guns.csv')

df = pd.read_csv(url)

print(df.head) 

# c=open("C:\Users\bathu\OneDrive\Desktop\pythn\bscs\guns.csv")
# d=c.read()
# print(d)