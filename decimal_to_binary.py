""" Convert decimal to binary """

user_decimal_number = int(input('Enter decimal number: '))

result = ""

while True:
	if user_decimal_number % 2 == 0: result = result + "0"
	else: result = result + "1"

	digit = user_decimal_number // 2
	user_decimal_number = digit 

	if user_decimal_number == 0: break 


seperate_result = list(result)

for letter in range(len(seperate_result)-1, -1, -1):
	print(seperate_result[letter], end='')
	