	
import pandas
from pandas import ExcelWriter

	
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataframe = pandas.DataFrame(data)
print("Print the employee details: ", "\n", dataframe)
writer = pandas.ExcelWriter("Employee_Details.xlsx")

dataframe.to_excel(writer, "Sheet1", index=False)

writer.save()