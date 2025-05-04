quantidade = float(input("Digite a quantidade de numeros que quer adicionar: "))
c = 0
lista = []
while c<quantidade:
    try:
        n = int(input("Digite um numero inteiro: "))
        lista.append(n)
    except ValueError:
        print("Digite um numero INTEIRO")
    c = c + 1 
lista.sort()
maior_numero = int (quantidade - 1) #Tenho q passar para int primeiro. 
print(f"O maior numero da lista é: {lista[maior_numero]}") # arriscado pq a lista não pode estar errada, 
#nenhum numero pode faltar. 
#ou, lista[-1]
print(f"O menor valor da lista é: {lista[0]}")
for i in lista: 
    if i % 2 == 0:
        print(f"O numero: {i} é par")
    elif i % 2 != 0:
        print(f"O numero {i} é impar")
    