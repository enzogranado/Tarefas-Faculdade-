def soma():
    z = 0
    cont = int(input("Digite quantos numeros quer somar: "))
    numero = []
    while z<cont:
        n = int(input("Digite um numero: "))
        numero.append(n)
        z+=1
    soma = sum(numero)
    return soma 



print(f"A soma é igual a {soma()}")