/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059
 * Kelas  : A
 * Tanggal: 7 November 2022
 * =======================================================================================
 * [PENJELASAN]
 * InvalidClassException akan di"throw" saat terjadi salah satu dari 4 kondisi di bawah :
 * - Versi serial kelas tidak cocok dengan deskriptor kelas yang dibaca dari stream
 * - Kelas berisi tipe data yang tidak diketahui
 * - Kelas tidak memiliki konstruktor no-arg yang dapat diakses
 * - ObjectStreamClass dari konstanta enum tidak mewakili (untuk ENUM type) 
 * =======================================================================================
 */

class Test {
  private int var1;
  private int var2;
  private int var3;
  
  private Test() {
    this.var1 = 0;
    this.var2 = 0;
    this.var3 = 0;
  }

  public int getVar1() {
    return var1;
  }

  public void setVar1(int var1) {
    this.var1 = var1;
  }

  public int getVar2() {
    return var2;
  }

  public void setVar2(int var2) {
    this.var2 = var2;
  }

  public int getVar3() {
    return var3;
  }

  public void setVar3(int var3) {
    this.var3 = var3;
  }
  
}

public class Soal02 {

	public static void main(String[] args) {
    Test obj = new Test();
	}
}