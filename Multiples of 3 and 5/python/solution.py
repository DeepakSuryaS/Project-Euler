'''
Project Euler Problem 1 - Multiples of 3 and 5
Solution in python
'''

#one liner
print(sum((x for x in range(1000) if x % 3 == 0 or x % 5 == 0)))

#classic solution
sum = 0
for i in range(1000):
    if((i % 3 == 0) or (i % 5 == 0)):
        sum = sum + i
print(sum)

