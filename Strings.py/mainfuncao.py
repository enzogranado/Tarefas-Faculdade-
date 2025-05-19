import funcao

def main():
    texto = input("Digite um texto: ")
    texto_tratado = funcao.remover_espacos_e_converter_minusculo(texto)
    texto_verificado = funcao.ehpalindromo(texto_tratado)
    print(texto_tratado)
    print(texto_verificado)
main()



    

