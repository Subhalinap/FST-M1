def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

num = int(input("Enter a number: "))

if num <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for value in range(num):
        print(fibonacci(value))