from random import randint
n = int(input("Digite o tamanho da lista que será criada: "))
c = 1
lista = []
while c<=n: 
    x = randint
    lista.append(randint(0,n))
    c = c+1
print (lista)
procurador = int(input("Digite um numero e veremos se ele esta na lista: "))
flag = 0
for i in range (len(lista)): #Esse len(lista) indica a condição de parada, nesse caso é o tamanho da lista 
    if lista[i] == procurador:
        print("seu numero esta no index: " , i)
        #flag = 1
        break
    if lista[i] != procurador:
        print("Seu numero não esta no index: " , i)

        
#if not flag:
    #print("Seu numero não esta na lista")


