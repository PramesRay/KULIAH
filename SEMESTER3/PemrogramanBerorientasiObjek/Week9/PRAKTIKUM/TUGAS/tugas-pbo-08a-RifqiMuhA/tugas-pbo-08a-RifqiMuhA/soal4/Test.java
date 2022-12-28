import java.io.*;

/*
* Nama      : Rifqi Muhadzib Ahdan
* NPM       : 140810210029
* Kelas     : A
* Tanggal   : 06 November 2022
* Deskripsi : Checked exception - Interupted Exception
* ===Deskripsi===
* Sinyal bahwa operasi I/O telah diinterupsi. 
* InterruptedIOException dilemparkan untuk menunjukkan bahwa transfer input atau output telah dihentikan karena thread yang menjalankannya ter-interupsi. 
*/

class MyThread extends Thread {
    @Override
    public void run(){
        int iterasi = 10;
        try {
            for (int i = 0; i < iterasi; i++) {
                System.out.println("Thread ke-" + (i+1));
                sleep(1000);
                if(i == 5){
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        } catch (InterruptedIOException e) {
            System.out.println("Error : Oops! Thread ter-interupsi");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test {
    public static void main(String[] args) throws Exception{
        MyThread t = new MyThread(); 

        t.start();  
    }

    
       
}
