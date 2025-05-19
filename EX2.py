'''3. Pedir para o usuário digitar uma palavra e procurar 
ela numa lista já criada previamente. Essa busca deve ter 
um contador, caso essa palavra seja encontrada na lista 
mais de uma vez. Caso a palavra não seja encontrada, não 
esqueça de passar uma saída informando isso.'''

'''while True: 
    
    print("Digite 1 para adicionar um nome a lista: ")
    print("Digite 2 para procurar um nome da lista: ")
    print("Digite 3 pafra encerrar o prgrama: ")
    
    
    resp = int(input("Digite a opção escolhida: "))
    if resp == 1: 
        lista.append("Digite uma palavra: ")
    elif resp == 2: '''
lista = ['Cleiton', 'Neymar', 'Ronaldo']
x = input("Digite uma nome: ")
cont = 0
if x not in lista: 
    print(f"O nome {x} não esta na lista")
elif x in lista: 
    print(f"O nome {x} esta na lista: ")


