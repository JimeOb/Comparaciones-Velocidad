import time

def DecAbin(decimal):
  bin =[]
  print ("\nNumero en decimal: " , decimal)
  
  while decimal != 0:
    residuo=decimal%2 
    bin.append(residuo)
    decimal=(decimal//2)
    bin.reverse()
  print("\nEste es su binario:\n",bin)

decimal=int(input("Ingrese el decimal que desea convertir a binario:"))

inicio = time.time()

DecAbin(decimal)

fin = time.time()
print("\nEl tiempo de ejecución fue de:\n ",fin-inicio)