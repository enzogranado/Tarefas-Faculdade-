def remover_espacos_e_converter_minusculo(texto):
    texto = texto.lower()
    texto = texto.strip()
    texto = texto.split()
    return texto 

def ehpalindromo(texto_tratado):
    for i in range(len(texto_tratado)//2):
        if texto_tratado[i] != texto_tratado[len(texto_tratado)-1-i]:
            return (f"A palavra {texto_tratado} não é um palindromo")
        else: 
            return (f"A palavra {texto_tratado} é um palindromo")

