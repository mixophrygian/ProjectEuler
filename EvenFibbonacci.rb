val = 1
prev = 1
sum = 0
while val <= 4000000
	if val % 2 == 0
		sum = sum + val
	end
	temp = prev
	prev = val
	val = val + temp
end
puts sum