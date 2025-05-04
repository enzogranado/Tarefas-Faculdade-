n = int(input("Digite um numero: "))
for x in range (2,n):
    if n%x==0:
        print(f"{n} não é primo")
        break
else:
    print("é primo")

    