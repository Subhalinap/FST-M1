import pandas

dataframe = pandas.read_excel("Employee_Details.xlsx")

print("Size of the rows and columns:", dataframe.shape)

print("Data in the emails columns only: ", "\n" ,dataframe["Email"])

print("Sort the data based on FirstName in ascending order ", "\n", dataframe.sort_values('FirstName'))