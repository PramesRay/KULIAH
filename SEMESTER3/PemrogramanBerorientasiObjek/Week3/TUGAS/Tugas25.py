def inputAngka():
	angka = input("Masukkan Angka: ")
	return angka;

def inputPangkat():
	pangkat = input("Masukkan Pangkat: ")
	return pangkat;

def loopPerkalian(angka, pangkat):
	n = 1;

	while n<=pangkat :
		hasil = angka * angka
		n += 1
	
	return hasil

def printHasil(angka, pangkat, hasil):
	print(angka, " ^ ", pangkat, " : ", hasil)


angka = int(inputAngka())
pangkat = int(inputPangkat())
hasil = loopPerkalian(angka, pangkat)

printHasil(angka, pangkat, hasil)