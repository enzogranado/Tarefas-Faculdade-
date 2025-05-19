
palavra = str(input("Digite uma palavra "))

def palindromo(palavra):
    for i in range(len(palavra)//2):
        if palavra[i] != palavra[len(palavra)-1-i]:
            return False 
            resp = "falso"
        else: 
            resp = "verdadeiro"
            return True 
    return resp


print(palindromo(palavra))





