# Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
# NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
# Kelas : A
# Tanggal : 9 September 2022
# Nama Program : soal1.py
# Deskripsi : Mencari nilai akhir , mutu nilai , dan kriteria lulus mahasiswa

def inputNpm() : 
    print("\n--- Input NPM ---\n")
    npm = input("Masukkan NPM : ");
    return npm

def inputNama() :
    print("\n--- Input Nama ---\n")
    nama = input("Masukkan Nama : ")
    return nama

def cariNilaiAkhir(n1,n2,n3):
   
    return int((n1+n2+n3)/3)

def inputNilai():
    print("\n--- Input Nilai ---\n")
    n = int(input("Masukkan Nilai : "))
    return n

def cariHurufMutu(nF):
    print("\n--- Proses Mencari Huruf Mutu ---\n")

    if(nF>=0 and nF<45):
        hm = 'E'
    elif(nF>=45 and nF<55):
        hm='D'
    elif(nF>=55 and nF<68):
        hm='C'
    elif(nF>=68 and nF<80):
        hm='B'
    elif(nF>=80 and nF<100):
        hm='A'
    return hm

def cariLulusTidak(nF):
    print("\n--- Proses Mencari Kriteria Lulus ---\n")
    krit = " "
    if(nF<55):
        krit="Gagal"
    else:
        krit="Lulus"
    
    return krit

def printDataMahasiswa(npm,nama,nF,hf,kr):
    print("\n--- Output Data Mahasiswa ---")
    print("NPM : ",npm)
    print("Nama : ",nama)
    print("Nilai Akhir : ",nF)
    print("Huruf Mutu : ",hf)
    print("Kriteria Lulus : ",kr)


npm = inputNpm()
nama = inputNama()

nilai1 = inputNilai()
nilai2 = inputNilai()
nilai3 = inputNilai()


nilaiF = cariNilaiAkhir(nilai1,nilai2,nilai3)


hm = cariHurufMutu(nilaiF)
krit = cariLulusTidak(nilaiF)

printDataMahasiswa(npm,nama,nilaiF,hm,krit)