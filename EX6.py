'''6. Calcular o valor do juros compostos: Desenvolva uma 
função que calcule o valor final de um investimento com 
base em uma taxa de juros e um período de tempo.'''
c = float(input("Digite o capital inicial: "))
i0 = float(input("Digite a taxa de juros: "))
i = 10/100
t = int(input("Digite a quantidade de tempo (em anos) que o investimento ficará aplicado: "))
m = (c*(1+i)**t)
lucro = m - c
print(f"O valor final do investimento será: {m:.2f}, seu lucro foi de {lucro:.2f}")