##ejercicio numero 4 de programacion 1 ##

##pedimos los datos al usuario
aux = int(input("ingrese su edad : "))


##analizamos con operadores logicos
if aux >= 0 and aux <=10 :
    print("la infancia es bella")
elif aux > 10 and aux <= 19:
    print("tienes mucho cambios, mucho por estudiar")
elif aux >= 20 and aux <= 29 :
    print("amor y confianza el trabajo")
else :
    print("el numero ingresado es mayor o igual a 30")