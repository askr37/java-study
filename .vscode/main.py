import csv

CSV_PATH = "data/kakeibo.csv"

def add_record():
    date = input("date (YYYY-MM-DD): ")
    category = input("category: ")
    amount = input("amount: ")
    memo = input("memo: ")

    with open(CSV_PATH, "a", newline="", encording="utf-8") as f:
        writer = csv.writer(f)
        writer.writerow([date, category, amount, memo])

    print("done!")

def main():
    add_record()

if __name__ == "__main__":
    main()