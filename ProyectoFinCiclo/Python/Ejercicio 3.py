def fibo(n):
    if n>1 :
        return fibo(n-1) + fibo(n-2)
    elif n == 1:
        return 1 
    elif n == 0:
        return 0
    else:
        print("Debe ingresar una posicion mayor a 0")
        return -1 



res = fibo(int(input("Ingrese la posicion de la serie fibo ")))    

print(res)