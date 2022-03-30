import zeep

wsdl = 'http://localhost:8080/ws/calculator.wsdl'
client = zeep.Client(wsdl=wsdl)

while(True):
    number1 = float(input("Nhap vao so thu nhat: "))

    print("1. +")
    print("2. -")
    print("3. *")
    print("4. /")
    print("5. ^")
    operator = input("Nhap lua chon: ")

    number2 = float(input("Nhap vao so thu hai: "))

    try:
        if operator == 1:
            print(client.service.add(number1, number2))
        elif operator == 2:
            print(client.service.minus(number1, number2))
        elif operator == 3:
            print(client.service.multiple(number1, number2))
        elif operator == 4:
            print(client.service.divide(number1, number2))
        elif operator == 5:
            print(client.service.exp(number1, number2))
    except Exception as e:
        print(e)
    print("")
