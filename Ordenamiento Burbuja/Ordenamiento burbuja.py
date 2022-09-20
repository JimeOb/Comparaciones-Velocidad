import time
elementos = [12789, 37920, 28910, 1293, 5783, 28290, 28394, 23749, 19320, 53790]
inicio = time.time()

def ord_burbuja(arreglo):
  n = len(arreglo)
  for i in range(n-1):
    for j in range(n-1-i):
      if arreglo[j] > arreglo[j+1]:
        arreglo[j], arreglo[j+1] = arreglo[j+1], arreglo[j]

ord_burbuja(elementos)
fin = time.time()
print("\nLos números organizados son:\n",elementos)
print("\nEl tiempo de ejecución fue de:\n ",fin-inicio)