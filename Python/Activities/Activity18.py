import pandas

content = pandas.read_csv("UserIds.csv")

print("Print only username: ", content["Usernames"])

print("Username and Password at 2nd row: ", content["Usernames"][1], " ", content["Passwords"][1])

print("Usernames column data in ascending order:", "\n", content.sort_values('Usernames'))

print("Password column data in descending order:", "\n", content.sort_values('Passwords', ascending=False))