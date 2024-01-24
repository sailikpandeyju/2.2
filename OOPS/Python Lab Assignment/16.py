"""
16. Create a dictionary that maps stock names to prices, which will keep insertion
order.Find minimum price, maximum price and sort items according to their prices in first
dictionary. Create another second stock dictionary. Find items that are only in first dictionary
and find items whose prices do not match. Remove duplicate items from first dictionary.
Sort both dictionaries for incrementing prices. Group items in first dictionary by price in
multiple of 500. Find an item with price=800 from both dictionaries.

"""

# Importing the OrderedDict class from the collections module
from collections import OrderedDict

stocks1 = OrderedDict()  # Create an empty ordered dictionary to store stock information

# Get the number of stocks and their prices from the user and add them to stocks1
for i in range(int(input("Enter the number of stocks you want to enter for 1st dictionary: "))):
    stock_name = input("Enter stock name: ")
    stock_price = float(input("Enter the price of the stock: "))
    stocks1[stock_name] = stock_price

# Find the minimum price and the stock associated with it in stocks1
min_price = min(stocks1.values())
min_price_stock = next(
    stock for stock, price in stocks1.items() if price == min_price)
print(f"Minimum Stock Price: {min_price_stock} -> {min_price}/-")

# Find the maximum price and the stock associated with it in stocks1
max_price = max(stocks1.values())
max_price_stock = next(
    stock for stock, price in stocks1.items() if price == max_price)
print(f"Minimum Stock Price: {max_price_stock} -> {max_price}/-")

# Sort the stocks1 dictionary based on the price in ascending order
sorted_stock_info1 = dict(OrderedDict(
    sorted(stocks1.items(), key=lambda x: x[1])))
print(f"Sorted stock 1: {sorted_stock_info1}")

stocks2 = OrderedDict()  # Create an empty ordered dictionary to store stock information

# Get the number of stocks and their prices from the user and add them to stocks2
for i in range(int(input("Enter the number of stocks you want to enter for 2nd dictionary: "))):
    stock_name = input("Enter stock name: ")
    stock_price = float(input("Enter the price of the stock: "))
    stocks2[stock_name] = stock_price

# Find the stocks that are present only in stocks1 (not in stocks2)
only_in_first = {stocks: prices for stocks,
                 prices in stocks1.items() if stocks not in stocks2}
print(f"Stocks only in first: {only_in_first}")

# Find the stocks in stocks2 whose prices do not match with stocks1
price_do_not_match = {stock: price for stock, price in stocks2.items(
) if stock in stocks1 and stocks1[stock] != stocks2[stock]}
print(f"Price which doesn't match: {price_do_not_match}")

# Sort the stocks2 dictionary based on the price in ascending order
sorted_stock_info2 = dict(OrderedDict(
    sorted(stocks2.items(), key=lambda x: x[1])))
print(f"Sorted stock 2: {sorted_stock_info2}")

# Create an empty ordered dictionary to store grouped items
grouped_dic = OrderedDict()

# Group the items in stocks1 based on their price and store them in grouped_dic
for item, prices in stocks1.items():
    group = (prices // 500) * 500  # Group the prices based on multiples of 500
    if group not in grouped_dic:
        grouped_dic[group] = []
    grouped_dic[group].append({item, prices})

print(f"Grouped items: {dict(grouped_dic)}")

# Find the item in stocks1 with price=800
item_price_800_from_1st = next(
    (item for item, prices in stocks1.items() if prices == 800), None)

# Find the item in stocks2 with price=800
item_price_800_from_2nd = next(
    (item for item, prices in stocks2.items() if prices == 800), None)

print(f"Item with price=800 from 1st dictionary: {item_price_800_from_1st}")
print(f"Item with price=800 from 2nd dictionary: {item_price_800_from_2nd}")
