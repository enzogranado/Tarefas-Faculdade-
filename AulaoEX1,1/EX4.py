'''4. Encontrar o maior elemento em uma lista: Escreva um 
programa que encontre o maior elemento em uma lista de 
números.'''
c = 0
lista = []
while c <3:
    lista.append(int(input("Digite um numero a lista: ")))
    lista.sort()
    c+=1    
x = len(lista) 
y = x-1
print(f"O maior nomero de {lista} é {lista[y]} ")
#
print(f"O maior numero de {lista} é {lista[-1]} ")
   
    