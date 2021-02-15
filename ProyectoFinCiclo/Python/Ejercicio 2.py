import numpy as nm

suma1 = 0
suma2 = 0
cp1 = 0
cp2 = 0
n = 5
A  = nm.zeros([n,n],dtype=int)
B  = nm.zeros([n,n],dtype=int)

print("Ingrese los valores de la primera matriz")
for i in range (0,len(A)):
    for j in range(0,len(A[i])):
        A[i,j] = int(input())

print(" ")

print("Ingrese los valores de la segunda matriz")
for i in range (0,len(B)):
    for j in range(0,len(B[i])):
        B[i,j] = int(input())        

for i in range (0,len(A)):
    for j in range(0,len(A[i])):
        d1 = 0
        for k in range(2,A[i,j]):
            resto=A[i,j]%k
            if resto == 0:
                d1+=1
        if d1==0:
            suma1 = suma1 +A[i,j]
            cp1 +=1

print(" ")
for i in range (0,len(B)):
    for j in range(0,len(B[i])):
        d2 = 0
        for k in range(2,B[i,j]):
            resto2=B[i,j]%k
            if resto2 == 0:
                d2+=1
        if d2==0:
            suma2 = suma2 +B[i,j]
            cp2 +=1

print(" ")

print("La primera matriz es: ")
print(A)

print("La segunda matriz es: ")
print(B)

pro1 = int(suma1/cp1)
pro2 = int(suma2/cp2)

print("El promedio de la primera matriz es: ",pro1)
print("El promedio de la segunda matriz es: ",pro2)

if pro1 == pro2:
    print("Sus promedios son iguales")
else:
    print("No son promedios iguales")    