def reversed(number):
    reverse = 0
    while number > 0:
        reduced = number % 10
        reverse = (reverse * 10) + reduced
        number = number // 10
    return reverse

def isPalindrome(number):
    return bool(reversed(number) == number)

def largestPalindrome(a, b):
    result = 0
    largest = 0
    for x in range(a, 99, -1):
        for y in range(b, 99, -1):
            result = y * x
            if isPalindrome(result) is True:
                largest = max(largest, result)
    return largest

print("The largest three digit palindrome product is: {}" . format(largestPalindrome(999, 999)))
