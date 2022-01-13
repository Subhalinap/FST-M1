list1 = [3, 7, 12, 44, 9, 65]
list2 = [2, 7, 43, 21, 22, 98, 1, 66]

print("List 1: ", list1)
print("List 2: ", list2)

list3 = []

for odd in list1:
    if(odd % 2 != 0):
        list3.append(odd)

for even in list2:
    if(even % 2 == 0):
        list3.append(even)

print("List 3: ", list3)