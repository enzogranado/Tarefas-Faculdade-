''' O respectivo programa converte celcius em farenheit e vice e versa
celcius = int (input("digite uma temperatura em celcius "))
farenreit = (celcius * 1.8) + 32
print (f"A temperatura em farenheit é {farenreit}")
'''
'''
farenreit2 = float (input( " Digite uma temperatura em farenheit "))
celcius2 = (farenreit2 - 32) / 1.8
print (f"A temperatura em celcius é {celcius2}")
'''

'''metro = float (input("digite uma medida em metros ")) #o programa converte metro para centimetros
centimetros = (metro * 100)                              #da merda quando colocamos virgula 
print (f"A medida em centimetros é {centimetros:.2f}")'''

''' PI , R^2'''
'''from math import pi
raio = float (input("Escreva o raio do círculo: "))

area =  pi * pow(raio,2)

print (f"O valor da area é {area:.2f}")'''


salario =  float (input("quanto vc ganha por hora? "))
horas =  float (input("Quantas horas vc trabalha no mês "))
ganho = salario * horas 

print (f'Você ganha {ganho}')

if ganho < 5000:
    print ("você é pobre")
else:
    print ("Você é rico")


