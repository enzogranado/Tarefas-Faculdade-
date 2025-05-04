n1 = int(input("Digite N1 "))
n2 = int(input("Digite n2 e faremos uma contagem de n1 até n2. "))
resp = input("n1 é maior que n2?")
if resp=="s":
    while (n1>n2):
        n2+=1 
        print(n2)
if resp == "n":
    while (n2>n1):
        n1+=1
        print("cambalhota", n1)