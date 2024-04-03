number_of_years = int(input("number of years:"))
annual_rate_of_return = 0.07
principal = 1000

rate = 1 + annual_rate_of_return
plus_years = rate ** number_of_years
amount = principal * plus_years
print(amount)