
compras = []
while True:
    print("Digite (1) se pretende adicionar um elemento á lista")
    print("Digite (2) se pretende remover algum elemento da lista")
    print("Digite (3) se pretende limpar a lista")
    print("Digite (4) se pretende ver a lista ")
    print("Digite (5) para encerrar o programa")
    resp = int(input("         Digite qual opção deseja fazer: "))
    if resp == 1:
        itens = input("Digite qual item vc quer adicionar: ")
        compras.append(itens)
        print(compras)
    elif resp == 2:
        print("Legal, sua lista esta assim: " , compras)
        pos = int(input("Qual a posição do item a ser removido? "))
        compras.pop(pos)
    elif resp == 3:
        compras.clear()
        print("Agora sua lista esta vazia")
    elif resp == 4:
        print("Patrão, sua lista ficou assim: " , compras)
    elif resp == 5:
        print("Pronto, até logo: ")
        break








        
            











'''compras.append(input("Digite um item da compra: "))
print(compras)
resp0=input("Quer gerenciar os itens? (sim) (nao) (pare)--> para o programa ")
while resp0 != 'pare':
    if resp0 == 'sim':
        resp1=input("Quer adicionar um item (add) ou remover (rem) ou limpar a lista (cle)?  ")
        if resp1 == 'add':
            compras.append(input("Adicione os itens: "))
        elif resp1 == 'rem':
            compras.pop(input("Digite a posição do iten que quer remover: "))
        elif resp1 == 'cle':
            compras.clear()
        print("Sua lista esta assim: " [compras] )    
    if resp0 == 'nao':
        print("Ok, sua lista ficou assim " [compras])    '''  