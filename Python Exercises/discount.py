price = int(input("Enter price:"))
discount = int(input("Enter discount:"))
price_after_discount = (discount/100) * price

print("The price after discount is" , price - price_after_discount)