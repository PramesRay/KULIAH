/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 17 Oktober 2022
* Deskripsi : Class jawaban assignment-06 soal-04
*/

public class Main {
    public static void main(String[] args) {
        Greetings bahasa1 = new Greetings() {
            @Override
            public void sayHello(String name){
                System.out.println("Well Hello " + name);
            }
            @Override
            public void sayGoodbye(String name){
                System.out.println("Nice to meet u " + name + ", see u next time!");
            }
        };

        Greetings bahasa2 = new Greetings() {
            @Override
            public void sayHello(String name){
                System.out.println("Weh cok! ada " + name + " cuy, apa kabar lu?");
            }
            @Override
            public void sayGoodbye(String name){
                System.out.println("Yaudah, gw cabut dulu ya " + name + ", kapan-kapan nongki lagi kita!");
            }
        };
        
        System.out.println();

        System.out.println("[BAHASA 1]");
        bahasa1.sayHello("Prames");
        bahasa1.sayGoodbye("Prames");

        System.out.println();

        System.out.println("[BAHASA 2]");
        bahasa2.sayHello("Prames");
        bahasa2.sayGoodbye("Prames");

        System.out.println();
    }
}
