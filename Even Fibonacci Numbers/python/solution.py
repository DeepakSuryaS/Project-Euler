'''
Project Euler Problem 2 - Even Fibonacci Numbers
Solution in python
'''

def fib(n):
    sum = 0
    a, b = 0, 1
    while a < n:
        if a % 2 == 0:
            sum = sum + a
        a, b = b, a + b
    return sum

def main():
    x = fib(4000000)
    print(x)

if __name__ == '__main__':
    main()

