/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 17 Oktober 2022
* Deskripsi : Class jawaban assignment-06 soal-03
*/

class Test {
    private static String s;

    static class Inner {
        void testMethod() {
            s = "set from inner";
            System.out.println(s);
        }
    }

    // Don't change the code below!
    // Code below must be executed without error!
    public static void main(String[] args) {
        Test.Inner inner = new Test.Inner();
        inner.testMethod();
    }
}