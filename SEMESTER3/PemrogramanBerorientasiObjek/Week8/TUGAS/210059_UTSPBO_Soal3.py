# Program : Soal 3
# Nama    : Prames Ray Lapian
# NPM     : 140810210059
# Kelas   : A
# Tanggal : 23 Oktober 2022

class Matriks:
    __baris = 0
    __kolom = 0

    def __init__(self, baris=0, kolom=0):
        self.__baris = baris
        self.__kolom = kolom
        self.__nilai = [[0]*kolom for i in range (baris)]

    def setBaris(self, baris):
        self.__baris = baris

    def setKolom(self, kolom):
        self.__kolom = kolom

    def setNilai(self, baris, kolom, nilai):
        self.__nilai[baris][kolom] = nilai
        
    def getBaris(self):
        return self.__baris

    def getKolom(self):
        return self.__kolom

    def getNilai(self, baris, kolom):
        return self.__nilai[baris][kolom]

    def inputMatriks(self):
        print("Input Matriks")
        for i in range(0, self.__baris):
            print("Baris ke -", i+1)
            for j in range(0, self.__kolom):
                self.__nilai[i][j] = int(input("Kolom ke-" + str(j) + " : "))
            print()

    def cetakMatriks(self, text):
        print("Matriks", text)
        for i in range(0, self.__baris):
            for j in range(0, self.__kolom):
                print(self.__nilai[i][j], " ", end='')
            print()
        print()

    def compareMatriks(self, matriks2):
        compare = Matriks(self.__baris, self.__kolom)
        for i in range(0, self.__baris):
            for j in range(0, self.__kolom):
                if(self.__nilai[i][j] >= matriks2.getNilai(i, j)):
                    compare.setNilai(1, i, j)
                else:
                    compare.setNilai(0, i, j)
        return compare
    

def inputnilai(urutan: str) -> Matriks:
    print(urutan)
    baris = int(input("Input baris " + urutan +" : "))
    kolom = int(input("Input kolom " + urutan + " : "))
    X = Matriks(baris, kolom)
    X.inputMatriks()
    return X

def output(A : Matriks, B : Matriks, C : Matriks):
    A.cetakMatriks("1")
    B.cetakMatriks("2")
    C.cetakMatriks("Perbandingan")

# main ------------------------------------------------------------------------------------------------
A = Matriks()
B = Matriks()
C = Matriks()

A = inputnilai("Matriks ke-1")
print()
B = inputnilai("Matriks ke-2")
print()
C = A.compareMatriks(B)
print("Output : ")
output(A, B, C)