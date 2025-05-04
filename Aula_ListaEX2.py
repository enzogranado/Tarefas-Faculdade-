
classe = []
media = []
mediaF = []
while True:
    print("Digite (1) se deseja colocar o nome do aluno")
    print("Após digitar o nome, pressione (2) e digite OBRIGATORIAMENTE sua nota em sequência")
    print("Digite (3) se deseja remover o nome e nota de um aluno")
    print("Digite (4) se deseja calcular a média de nota da sala")
    print("Digite (5) se deseja visualizar os alunos e suas notas")
    resp = int(input("Selecione uma numeração e prossiga digitando: "))
    if resp == 1:
            classe.append(input("Digite o Nome: "))
    if resp == 2:
            classe.append(int(input("Digite a nota (0 a 10): ")))
    if resp == 3:
        print("Sua lista esta assim \n" , classe )
        print("Quer remover qual nome e nota? ")
        OutNome = int(input("indique a posição do nome: "))
        OutNota = OutNome #assim dará certo por quando removemos o nome, a numereção da lista volta uma unidade
        classe.pop(OutNome)
        classe.pop(OutNota)
        print("Sua lista esta assim: " , classe)
    if resp == 4: 
        for x in range(1,classe.__len__(), 2):
            media.append(classe[x]) # Quero que adicione os elementos impares da classe X 
        mediaF = (sum(media) / media.__len__())
        print(f"A média da sala é: {mediaF} ")
    if resp == 5: 
        for x in range(0,classe.__len__(),2):
            nomes = (classe[x])
        for y in range(1,classe.__len__(), 2):
            notas = (classe[y])
        print(nomes, ":" , notas) 
    if resp == 6:
          break