
peso = float(input("Coloque seu peso em [Kg]: "))
altura = float(input("Coloque sua altura [em M]: "))
imc = peso/altura**2
if imc<18.5:
    print("Magreza (Africano)")
elif  18.5< imc <24.9:  
    print("normal")
elif  24.9<= imc <29.9:
    print("Sobrepeso")
else:
    print("Obeso")    
