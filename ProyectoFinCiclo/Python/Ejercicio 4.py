import numpy as nm

n = 4
A = nm.zeros([n],dtype=int)
B = nm.zeros([n],dtype=int)

print("Ingrese los valores del vector A")
for i in range (0,n):
    A[i] = int(input())

print("Ingrese los valores del vector B")
for i in range (0,n):
    B[i] = int(input())


if A[0] == B[2] and A[1] == B[3] and A[2] == B[0] and A[3] == B[1]:
    print("Son circularmente iguales")
else:
    print("No son circularmente iguales")
