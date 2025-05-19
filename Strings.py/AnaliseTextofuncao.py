def contar_palavras(frase):
    cont = frase.count(" ")
    return cont + 1


def contar_vogais(frase):
    frase = frase.lower()
    numero_vogais = frase.count('a','e','i','o','u')
    return ("Quantidade de vogais = " + numero_vogais)

def encontrar_ocorrencia(frase, palavra):
    variavel = frase.find(palavra) 
    return variavel

