# Nama : Amir Salim , Andre Nathaniel Adipraja , Prames Ray lapian , Ibrahim Dafi Iskandar
# NPM : 140810210015 , 140810200042 , 140810210059 , 140810210039
# Kelas : A
# Tanggal : 9 September 2022
# Nama Program : soal3.py
# Deskripsi : Mencari gaji pegawai dan aturan-aturannya

def inputNama():
    print("\n--- Input Nama ---\n")
    hasil = input("Nama : ")
    return hasil

def inputGol():
    print("\n--- Input Golongan Gaji ---\n")
    hasil = int(input("Golongan gaji : "))
    return hasil

def prosesGapok(gol):
    print("\n--- Proses Mencari Gapok ---\n")
    gapok= int(0)

    match gol:
        case 1 :
            gapok = int(1500000)
        case 2:
            gapok = int(2000000)
        case 3:
            gapok = int(3000000)
        case 4:
            gapok = int(5000000)
        case _:
            print("Bukan termasuk golongan gaji! nilai gapok menjadi 0")
    return gapok

def prosesPotongan(gol):
    print("\n--- Proses Mencari potongan gaji ---\n")
    pot = int(0)

    match gol:
        case 1:
            pot = int(1)
        case 2:
            pot= int(2)
        case 3:
            pot= int(2)
        case 4:
            pot= int(5)
        case _:
            print("Bukan termasuk golongan gaji! nilai gapok menjadi 0")

    return pot

def prosesTunjangan(gol):
    print("\n--- Proses Mencari tunjangan gaji ---\n")
    tun = int(0)

    match gol:
        case 1:
            tun = int(10)
        case 2:
            tun = int(12)
        case 3:
            tun = int(12)
        case 4:
            tun = int(15)
        case _:
            print("Bukan termasuk golongan gaji ! Nilai tunjangan menjadi 0")

    return tun

def prosesGatot(gapok,tun,pot):
    print("\n--- Proses Mencari Gaji Total ---\n")
    return float(float(gapok) + (float(tun/100*gapok) - float(pot/100*gapok)))

def outputKaryawan(nama,gol,gapok,tun,pot,gatot):
    print("\n--- Output Karyawan ---")
    print("Nama : ",nama)
    print("Golongan Gaji : " ,gol)
    print("Gaji Pokok : " ,gapok)
    print("Tunjangan : ",tun,"%")
    print("Potongan : ",pot,"%")
    print("Gaji Total : ",gatot)

nama=inputNama()
gol = inputGol()

gapok=prosesGapok(gol)
potongan=prosesPotongan(gol)
tunjangan=prosesTunjangan(gol)

gatot = prosesGatot(gapok,tunjangan,potongan)

outputKaryawan(nama,gol,gapok,tunjangan,potongan,gatot)