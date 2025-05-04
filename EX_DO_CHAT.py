'''Crie um programa que gera um número aleatório entre 1 e 100 e pede para o usuário adivinhar qual é esse número. O jogador tem apenas 7 tentativas para acertar.

Regras:

Se o palpite for menor que o número correto, o programa deve informar: "Tente um número maior!".

Se for maior, o programa deve dizer: "Tente um número menor!".

Se o jogador acertar, exiba: "Parabéns! Você acertou em X tentativas!".

Se o jogador esgotar as 7 tentativas sem acertar, exiba: "Game Over! O número correto era Y."-'''
from random import randrange, randint


print("O joguinho fará vc acertar um numero de 1 a 100: ")
n1 = randint(1,100)
c = 0 
while (c<7): 
    tent = int(input("Digite o numero: "))
    if tent > n1:
        print("Digite um numero menor: ")
    elif tent < n1:
        print("Digite um numero maior")
    elif tent == n1: 
        print("parabéns, você acertou!!")
        break 
    else: 
        print("Não foi dessa vez, o numero era: ", n1)
        break
    c+=1