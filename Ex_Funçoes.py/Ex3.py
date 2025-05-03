'''def ehprimo(n1,n2):
    c =0 

    for i in range(n1,n2):
        for y in range(2,n2-1):
            if i/y != 0:
                return i 
            


             
        
def main():
    a,b = 1,10
    print(f"numeros primos entre {a} e {b} são: {ehprimo(a,b)}")
main()'''
def ehprimo(a,b):
    lista = []
    for x in range(a, b+1):
        flag = 0
        for i in range (2,x):
            if x%i == 0:
                flag ==1
                break 
            if not flag:
                lista.append(x)
def main():
    n1,n2 = 1,10
    print(ehprimo(n1,n2))
main()
    