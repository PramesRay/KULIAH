from LinkedList import LinkedList
from ElementList import ElementList
from os import system

def menu():
    print("===== MENU =====");
    print("1 . Tambah Data");
    print("2 . Hapus Data");
    print("3 . Cari Data");
    print("4 . Tampilkan Data");
    print("5 . Keluar");
    print("Masukkan Pilihan...." ,end="");

baru = ElementList()
listKendaraan = LinkedList()
cari = ElementList()
cont = "Y"
pil = 0
try:
    while(True):
        menu()
        pil = int(input())
        system('cls')

        match pil:
            case 1:
                print("=== METODE INSERT ===")
                print("1 . Insert First")
                print("2 . Insert Last")
                pil = int(input("Masukkan Pilihan..."))
                system('cls')

                match pil:
                    case 1:
                        print("Insert First...")
                        baru = listKendaraan.createElement()
                        listKendaraan.inserFirst(baru)
                    
                    case 2:
                        print("Insert Last...")
                        baru = listKendaraan.createElement()
                        listKendaraan.insertLast(baru)
                    
                    case _:
                        print("Bukan termasuk pilihan ! ")
            
            case 2:
                print("=== HAPUS DATA ===")
                print("1 . Delete First")
                print("2 . Delete Last")
                pil = int(input("Masukkan Pilihan..."))
                system('cls')

                match pil:
                    case 1:
                        print("Delete First...")
                        listKendaraan.deleteFirst()
                    
                    case 2:
                        print("Delete Last...")
                        listKendaraan.deleteLast()
                    
                    case _:
                        print("Bukan termasuk pilihan ! ")

            
            case 3:
                no = input("Masukkan plat nomor kendaraan yang ingin dicari...")
                cari = listKendaraan.search(no)

                if(cari == None):
                    print("Data tidak ditemukan")
                
                else:
                    print("Data Ditemukan , detail...")
                    cari.getData().getKendaraan()
            
            case 4:
                listKendaraan.cetakTabelParkir()
                print("Total Biaya Parkir = ",listKendaraan.totalBiaya())
            
            case 5:
                cont = "N"
            
            case _:
                print("Bukan termasuk pilihan ! ")

        cont = input("Apakah program masih ingin dilanjutkan ? (Y/N)")
        system('cls')
        if(cont!="Y"):
            break

    print("=== TERIMA KASIH ===")
except:
    print("Terdapat error...")




