/*
* Nama      : Prames Ray Lapian
* NPM       : 140810210059
* Kelas     : A
* Tanggal   : 12 November 2022
* Deskripsi : Vector 

[PENJELASAN]
-> Vector dapat memperbesar atau memperkecil ukurannya secara fleksibel
-> Vector dapat menyimpan banyak elemen karena tidak ada batasan ukuran
-> Vector meng-implement List
-> Constructor :
  - Vector()                    : Membuat default vector dengan initial capacity adalah 10
  - Vector(int size)            : Membuat default vector dengan capacity sebesar size
  - Vector(int size, int incr)  : Membuat default vector dengan capacity sebesar size. Setiap size sudah penuh, size akan diperbesar sebesar incr
  - Vector(Collection c)        : Membat vector yang mana isi elementnya adalah element dari collection c
-> Metod Vector:
  - clone()         : meng-copy semua element
  - add(E e)        : menambahkan sebuah element ke vector
  - get(int index)  : mengambil element di vector berdasarkan index
  - isEmpty()       : cek apakah vector kosong atau tidak
*/

import java.util.*;

class ToDoList {
  private String desc, type;
  private int priority, dayRemaining;

  public ToDoList() {
    this.desc = "";
    this.type = "";
    this.priority = 0;
    this.dayRemaining = 0;
  }
  public ToDoList(String type, String desc, int priority, int dayRemaining) {
    this.type = type;
    this.desc = desc;
    this.priority = priority;
    this.dayRemaining = dayRemaining;
  }
  
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public int getPriority() {
    return priority;
  }
  public void setPriority(int priority) {
    this.priority = priority;
  }

  public int getDayRemaining() {
    return dayRemaining;
  }
  public void setDayRemaining(int dayRemaining) {
    this.dayRemaining = dayRemaining;
  }

  @Override
  public String toString() {
    return "\nType: " + this.type + ", \nDesc: " + this.desc + ", \nPriority: " + this.priority + ", \nDay Remaining: " + this.dayRemaining + "\n";
  }
}

/**
 * VectorTest
 */
public class VectorTest {
  public static void main(String[] args) {
    Vector<ToDoList> task = new Vector<ToDoList>();
      task.add(new ToDoList("Kuliah", "Mengerjakan Tugas 9 Praktikum PBO No 1", 1, 1));
      task.add(new ToDoList("Kuliah", "Mengerjakan Tugas 9 Praktikum PBO No 2", 1, 1));
      task.add(new ToDoList("Kuliah", "Mengerjakan Tugas 9 Praktikum PBO No 3", 1,1));
      task.add(new ToDoList("Rutinitas", "Belanja Bulanan", 2,3));
      task.add(new ToDoList("Rutinitas", "Bersih-bersih Kostan", 3,2));
      System.out.println("[TO DO LIST]: Normal");
      System.out.println(task);
      
      System.out.println();
      Vector<ToDoList> taskSortByPriority = (Vector<ToDoList>)task.clone();
      Comparator<ToDoList> compPriority = new Comparator<ToDoList>() {
        public int compare(ToDoList t1, ToDoList t2) {
          if(t1.getPriority() > t2.getPriority()) return 1;
            return -1;
          }
        };
        Collections.sort(taskSortByPriority, compPriority);
        System.out.println("[TO DO LIST]: Sorted By Priority");
        System.out.println(taskSortByPriority);
        
        
      System.out.println();
      Vector<ToDoList> taskSortByDayRemaining = (Vector<ToDoList>)task.clone();
      Comparator<ToDoList> compDayRemaining = new Comparator<ToDoList>() {
        public int compare(ToDoList t1, ToDoList t2) {
          if(t1.getDayRemaining() > t2.getDayRemaining()) return 1;
            return -1;
        }
      };
      Collections.sort(taskSortByDayRemaining, compDayRemaining);
      System.out.println("[TO DO LIST]: Sorted By DayRemaining");
      System.out.println(taskSortByDayRemaining);
      
  }
  
}