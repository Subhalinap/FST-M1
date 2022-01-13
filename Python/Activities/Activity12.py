def sum(number):
    if number:
        return number + sum(number-1)
    else:
        return 0

print("Sum of 0-10: ", sum(10))

