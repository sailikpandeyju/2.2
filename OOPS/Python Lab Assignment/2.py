"""

Write a discount coupon code using dictionary in Python with different rate coupons for
each day of the week.

"""

# taking individual discount rates for each days of the week
d1 = int(input("Discount for Monday: "))
d2 = int(input("Discount for Tuesday: "))
d3 = int(input("Discount for Wednesday: "))
d4 = int(input("Discount for Thursday: "))
d5 = int(input("Discount for Friday: "))
d6 = int(input("Discount for Saturday: "))
d7 = int(input("Discount for Sunday: "))

# making a dictionary to store the key value pairs of days with discount rates
discount = {
    "Monday": "MON"+str(d1),  # appending the discount rates
    "Tuesday": "TUE"+str(d2),
    "Wednesday": "WED"+str(d3),
    "Thursday": "THUR"+str(d4),
    "Friday": "FRI"+str(d5),
    "Saturday": "SAT"+str(6),
    "Sunday": "SUN"+str(d7)
}


print("************************")
for i in discount:  # printing each discount rates
    print("The coupon for "+i+" is: "+discount[i])
print("************************")

search = input("Enter the day of the coupon you want to search: ")
if search in discount:
    print(discount[search])
else:
    print("Invalid Input")
