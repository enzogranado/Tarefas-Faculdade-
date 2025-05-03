def potencia (x,y):
    s = 1
    for i in range(y):
        s = s*x
    return s 
def main():
    a,b = 2, 10
    print(f"A potencia será: {potencia(a,b)}")
main()