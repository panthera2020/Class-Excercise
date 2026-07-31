""" Convert the binary number to decimal """

print('Convert binary numbers to decimals')

user_binary_number = input('Enter binary number:')

individual_numbers = list(user_binary_number)

exponent = len(individual_numbers)

sum = 0

for number in individual_numbers:
	exponent -= 1 
	sum += int(number) * (2**(exponent))

	if exponent == 0: break

print()

print(sum)