public class Manusia {
  //variable
  private String nama;
  private String npm;
  
  //constructor
  public Manusia() {
    this.nama = "Prames";
    this.npm = "140810210059";
  }

  //setter
  public void setnama(String nama) {
    this.nama = nama;
  }
  public void setnpm(String npm) {
    this.npm = npm;
  }

  //getter
  public String getnama(){
    return this.nama;
  }
  public String getnpm(){
    return this.npm;
  }
}