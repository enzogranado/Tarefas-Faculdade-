'''import random
numero = int(input("Digite um numero: "))
x = random.randint(1,11) 
if (numero == x):
    print("Você acertou") 
else:
    print(f"Você errou, o gênio pensou em {x}")'''
import random 
numero = int(input("digite um numero (0 termina o programa) "))
x = random.randint(1,11)
while (x!=numero):
    print(f"errou, tente novamente ")
    numero = int(input("digite outro numero "))
    if (numero == 0):
        print (f"Ok, cancelando o jogo, tinha pensado no numero {x} ")
        break
print("você acertou. ")     