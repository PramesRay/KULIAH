 Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
# NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
# Kelas : A
# Tanggal : 9 September 2022
# Nama Program : soal2.py
# Deskripsi : Print huruf sesuai angka yang diinput

def inputAngka():
    print("\n--- Input Nilai ---\n")
    hasil = int(input("Masukkan Nilai : "))
    return hasil

def bilIfElse(n):
    print("\n--- Proses Menggunakan If-Else ---\n")
    hasil = " "

    if(n==1):
        hasil="Satu"
    elif(n==2):
        hasil="Dua"
    elif(n==3):
        hasil = "Tiga"
    elif(n==4):
        hasil = "Empat"
    elif(n==5):
        hasil = "Lima"
    elif(n==6):
        hasil = "Enam"
    elif(n==7):
        hasil = "Tujuh"
    elif(n==8):
        hasil = "Delapan"
    elif(n==9):
        hasil = "Sembilan"
    elif(n==10):
        hasil = "Sepuluh"
    else:
        hasil="Invalid Number"
    
    return hasil

def bilMatch(n):
    print("\n--- Proses Menggunakan Match ---\n")
    hasil = " "

    match n:
        case 1:
            hasil="Satu"
        case 2:
            hasil ="Dua"
        case 3:
            hasil="Tiga"
        case 4:
            hasil="Empat"
        case 5:
            hasil="Lima"
        case 6:
            hasil="Enam"
        case 7:
            hasil="Tujuh"
        case 8:
            hasil="Delapan"
        case 9:
            hasil = "Sembilan"
        case 10:
            hasil = "Sepuluh"
        case _:
            hasil = "Invalid Number"
    return hasil

def outputProg (nil, s1,s2):
    print("\n--- Output Program")
    print("Bilangan : " , nil)
    print("Hasil Menggunakan if-else : " , s1)
    print("Hasil Menggunakan Match : " , s2)

nilai = inputAngka()
hasilIfElse=bilIfElse(nilai)
hasilMatch = bilMatch(nilai)

outputProg(nilai,hasilIfElse,hasilMatch)