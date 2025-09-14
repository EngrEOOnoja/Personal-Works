from datetime import datetime

items = []

def main_menu():
    while True:
        new_item = input("Enter item to add: ")
        new_quantity = int(input("Enter quantity: "))
        new_unit_price = float(input("Enter Unit Price: "))
        items.append({
            'item': new_item,
            'quantity': new_quantity,
            'unit_price': new_unit_price
        })
        user_choice = input("Add More Items? (Yes/No): ").
        if user_choice.lower() != 'yes':
            break

    user_cashier = input("Cashier: ")
    user_customer = input("Customer Name: ")
    user_discount = float(input("Customer Discount (%): "))

    now = datetime.now()
    receipt_lines = []

    receipt_lines.append("SEMICOLON STORES")
    receipt_lines.append("MAIN BRANCH")
    receipt_lines.append("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.")
    receipt_lines.append("TEL: 032938343")
    receipt_lines.append("="*60)
    receipt_lines.append(now.strftime("%Y-%m-%d %H:%M:%S"))
    receipt_lines.append(f"Cashier: {user_cashier}")
    receipt_lines.append(f"Customer Name: {user_customer}")
    receipt_lines.append("-"*60)
    receipt_lines.append(f"{'ITEM':<20}{'QTY':>5}{'PRICE':>10}{'TOTAL(NGN)':>15}")
    receipt_lines.append("-"*60)

    total = 0
    for item in items:
        subtotal = item['quantity'] * item['unit_price']
        total += subtotal
        receipt_lines.append(f"{item['item']:<20}{item['quantity']:>5}{item['unit_price']:>10.2f}{subtotal:>15.2f}")

    receipt_lines.append("="*60)
    discount = total * (user_discount / 100)
    vat = total * (7.5 / 100)

    receipt_lines.append(f"{'Discount:':<35}₦{discount:>10.2f}")
    receipt_lines.append(f"{'VAT (7.5%):':<35}₦{vat:>10.2f}")
    receipt_lines.append("-"*60)

    grand_total = total + vat - discount
    receipt_lines.append(f"{'Total:':<35}₦{grand_total:>10.2f}")
    receipt_lines.append("THIS IS NOT A RECEIPT")

    # Print receipt on screen
    for line in receipt_lines:
        print(line)

    # Save receipt to file
    with open("receipt.txt", "w") as f:
        for line in receipt_lines:
            f.write(line + "\n")

    print("\nReceipt saved to 'receipt.txt'")
  
  
main_menu()

