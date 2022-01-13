input_tuple = tuple(input("Enter a tuple of numbers: ").split(", "))

print("Numbers divisible by 5: ")
for value in input_tuple:
    if int(value) % 5 == 0:
        print(value)