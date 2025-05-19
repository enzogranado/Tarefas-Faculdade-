import AnaliseTextofuncao
def main():
    frase = input("Digite uma frase: ")
    print("Quantidade de palavras na frase = " + AnaliseTextofuncao.contar_palavras(frase))
    print("Quantidade de vogais na frase = " + AnaliseTextofuncao.contar_vogais(frase))
    palavra = input("Digite uma palavra e veremos se ela\n esta na frase")
    print("A palavra " + palavra + " esta na lista no index " + AnaliseTextofuncao.encontrar_ocorrencia(palavra,frase) )

main()