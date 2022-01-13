def sum(list_num):
    sum_of_num = 0
    for num in list_num:
        sum_of_num += int(num)
    return sum_of_num

list_of_val = list(input("Enter a list of numbers: ").split(","))
print("Sum of the values in list: ", sum(list_of_val))
