fruits = {"apple": 12, "banana": 20, "orange": 40, "kiwi": 100}

fruit_needed = input("Enter the fruit you want to buy: ").lower()

if fruit_needed in fruits:
    print(fruit_needed + " is available.")
else:
    print(fruit_needed + " is not available.")