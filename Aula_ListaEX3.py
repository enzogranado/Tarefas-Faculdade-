tarefas = []
while True: 
    print("Aperte (1) se deseja adicionar uma tarefa: ")
    print("Aperte (2) se deseja remover uma terefa: ")
    print("Aperte (3) se deseja exibir suas tarefas: ")
    print("Aperte (4) se deseja encerrar o programa")
    opcao = int(input("Faça sua escolha: "))
    if opcao ==1:
        tarefas.append(input("Digite sua tarefa: "))
        tarefas.append(input("Digite (c) se concluida e (n) se não concluida: "))
    if opcao == 2:
        print("Sua lista esta assim: " , tarefas)
        delete = int(input("Digite o index/posição do item que quer remover: "))
        tarefas.pop(delete)
        tarefas.pop(delete)
        print("Após as remoções, sua lista ficou assim: ", tarefas)
    if opcao == 3:
        print("OK, sua lista ficou assim: \n " , tarefas )
    if opcao == 4: 
        print("Fim do programa, até logo!!")
        break 