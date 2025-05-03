gabs = ['a','b','c']
resp = ['a', 'a', 'b']
def pontuacao(gabs,resp):
    x = len(gabs)
    pontos = 0
    for i in range(x):
        if gabs[i] == resp[i]:
            pontos +=1
    return pontos

print(f" A prova foi {resp} e o gabarito foi {gabs} \n a pontuação foi: {pontuacao(gabs,resp)}")

