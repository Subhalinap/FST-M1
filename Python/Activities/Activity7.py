	
numbers = list(input("Enter a list of values: ").split(", "))
sum = 0

for num in numbers:
    sum += int(num)

print(sum)
