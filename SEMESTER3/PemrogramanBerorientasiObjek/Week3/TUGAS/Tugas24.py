# Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
# NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
# Kelas : A
# Tanggal : 9 September 2022
# Nama Program : soal4.py
# Deskripsi : Cetak bintang bentuk segitiga

def inputBaris():
    print("\n--- Input Jumlah Baris ---\n")
    hasil = int(input("Jumlah Baris : "))
    return hasil

def segitigaFor(b):
    print("\n--- Segitiga Menggunakan For ---")
    for i in range (1, (b+1) ,1):
        print(i,". ",end = "")
        for(j) in range (1, (i+1) ,1):
            print(" * " , end = "")
        print("\n")

def segitigaWhile(b):
    print("\n--- Segitiga Menggunakan While ---")
    
    i = int(1)
    j=  int(1)

    while i<=baris:
        print(i,". ",end = "")
        while j<=i:
             print(" * " , end = "")
             j = j + 1
        print("\n")
        i = i+1
        j = 1

def segitigaTerbalikFor(b):
    print("\n--- Segitiga Terbalik Menggunakan For ---")

    for i in range(b,0,-1):
        print((b+1 - i),". ",end="")
        for j in range(1,(i+1),1):
            print(" * " , end = "")
        print("\n")

def segitigaTerbalikWhile(b):
    print("\n--- Segitiga Terbalik Menggunakan while ---")
    i = b
    j = 1

    while i>=1:
       print((b - i+1),". ",end="") 
       while j<=i:
        print(" * ",end="")
        j=j+1
       print("\n")
       i=i-1
       j=1



        
     

baris = inputBaris()
segitigaFor(baris)
segitigaWhile(baris)
segitigaTerbalikFor(baris)
segitigaTerbalikWhile(baris)