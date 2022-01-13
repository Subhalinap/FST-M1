numbers = list(input("Enter a list of values: ").split(", "))
size = len(numbers)

if numbers[0] == numbers[size-1]:
    print(True) 
else:
    print (False)