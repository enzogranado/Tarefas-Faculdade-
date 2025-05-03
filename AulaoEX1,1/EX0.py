lista = []
media = []
while True:
    print("Digite 11 se quiser encerrar o programa: ")
    print("Digite 2 se quer visualisar a media final: ")
    resp = int(input("Digite 1 se quer adicuonar uma nota: "))

    if resp == 1: 
        lista.append(input("Digite uma nota de 1 a 10: "))
    if resp == 2: 
        media = sum(lista)/lista.__len__
        print(f"A media final é: {media}")
    elif resp == 11:
        break     


    

            
    

    
