import numpy as nm

n = int(input("Ingrese el tamaño del vector "))
A = nm.zeros([n],dtype=int)
B = nm.zeros([n],dtype=int)

for i in range(0,n):
    A[i] = int(input())
    B[i] = A[i]

print(A)

print(" ")

factorial = 0

for i in range(0,n):
    factorial = 1
    for j in range(1,A[i]+1):
        factorial = factorial * j
    print (B[i], "! = ",factorial)
