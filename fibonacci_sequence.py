""" fibonacci sequence """

first_digit = 0

next_digit = 1

print(first_digit, next_digit, end=' ')

for number in range(18):
	digit = first_digit + next_digit
	print(digit, end=' ') 
	first_digit = next_digit
	next_digit = digit 
