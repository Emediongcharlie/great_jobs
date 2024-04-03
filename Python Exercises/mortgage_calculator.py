

principal_amount = int(input("Enter the amount to borrow:"))
yearly_interest_rate = int(input("Enter yearly interst rate in percentage:"))
duration = int(input("Enter the duration in years:"))

percentage_yearly_interest_rate = yearly_interest_rate / 100

percentage_monthly_rate = percentage_yearly_interest_rate / 12

number_of_months = duration * 12

numerator = (1 + percentage_monthly_rate)

numerator2  = numerator ** number_of_months

numerator3 =  numerator2 * percentage_monthly_rate

denominator = 1 + percentage_monthly_rate

denominator2  = denominator ** number_of_months

denominator3 = denominator2 - 1

next_line = numerator3 / denominator3

monthly_payment = principal_amount * next_line

rounded_monthly_payment = round(monthly_payment, 2)
   
print(rounded_monthly_payment)