from ElementList import ElementList
from Mobil import Mobil
from Motor import Motor
from Truck import Truck

class LinkedList:
    __first  = ElementList()
    def __init__(self):
        self.__first = None
    
    def createList(self):
        self.__first = None
    
    def createElement(self):
        baru = ElementList()
        num = 0

        print("Jenis Kendaraan : ")
        print("1 . Mobil")
        print("2 . Motor")
        print("3 . Truck")

        num = int(input("Input..."))

        match num:
            case 1:
                baru.setData(Mobil())
            
            case 2:
                baru.setData(Motor())
            
            case 3:
                baru.setData(Truck())
        
        baru.getData().inputKendaraan()

        return baru
    
    
    #Insert
    def inserFirst(self,baru):
        if(self.__first == None):
            self.__first = baru
        
        else:
            baru.next = self.__first
            self.__first = baru
    
    def insertLast(self,baru):
        if(self.__first == None):
            self.__first = baru
        else:
            bantu = self.__first
            while(bantu.next != None):
                bantu = bantu.next
            bantu.next = baru
    
    #Delete
    def deleteFirst(self):
        hapus = ElementList()
        if(self.__first.next==None):
            hapus = self.__first
            self.__first =None
        

        elif(self.__first == None):
            print("Tidak ada yang Dihapus")
        
        else:
            hapus = self.__first
            self.__first = self.__first.next

    def deleteLast(self):
        hapus = ElementList()
        if(self.__first== None):
            hapus = self.__first
            self.__first = None
        

        elif(self.__first == None):
            print("Tidak ada yang dihapus")
        

        else:
            b4last = self.__first
            while(b4last.next.next !=None):
                b4last = b4last.next
            

            hapus = b4last.next.next
            b4last.next = None
    
    #Search
    def search(self,no):
        hasilCari = self.__first
        found = 0

        while(hasilCari!= None and found == 0):
            if(hasilCari.getData().getNoKendaraan() == no):
                found = 1
            else:
                hasilCari = hasilCari.next
        return hasilCari
    
    #Print data
    def cetakTabelParkir(self):
        print("\t\t\t\tRekapitulasi Biaya parkir PT Parkir Jaya\n")
        if(self.__first == None):
            print("List Kosong ! ")
        
        else:
            no = int(1)
            bantu = self.__first
            print("================================================================================================================================")
            print("No\tNo Kendaraan\t\tJenis\tJam Masuk\tJam Pulang\tLama Parkir\tLama jam\tBiaya");
            print("================================================================================================================================")
            while(bantu != None):
                print(
                    no,"\t",
                    bantu.getData().getNoKendaraan(),"\t\t", 
                    bantu.getData().getJenis(),"\t", 
                    bantu.getData().getWaktuDatang().getWaktu(),"\t", 
                    bantu.getData().getWaktuPulang().getWaktu(),"\t",   
                    bantu.getData().getLamaParkir().getWaktu(),"\t ", 
                    bantu.getData().getLamaJam(),"\t\t", 
                    bantu.getData().getBiayaParkir(),"\t  "  
                         )
                no = no+1
                bantu = bantu.next     
            print("================================================================================================================================")
    
    def totalBiaya(self):
        total = 0
        bantu = self.__first
        while(bantu != None):
            total = total + bantu.getData().getBiayaParkir()
            bantu = bantu.next
        return total     

        

        

             
                



    
        
        