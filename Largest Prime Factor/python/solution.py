'''
Project Euler Problem 3 - Largest Prime Factor
Solution in python
'''

import math

#finding all the factors
def factors(number):
  factor = set()
  sqrt = int(math.sqrt(number))
  for x in range(2, sqrt+1):
    if number % x == 0:
      factor.add(int(x))
  
  currSize = len(factor)
  for x in range(0, currSize):
    factor.add(int(number / next(iter(factor))))
  
  factor.add(number)
  return factor

def largestPrime(number):
  largest = 0
  factor = factors(number)
  for fact in factor:
    counter = 0
    for divisor in range(1, fact+1):
      if fact % divisor == 0:
        counter += 1
      if counter > 1 and divisor < fact:
        break
      if divisor == fact:
        largest = max(largest, fact)
  return largest

number = 600851475143
print(largestPrime(number))