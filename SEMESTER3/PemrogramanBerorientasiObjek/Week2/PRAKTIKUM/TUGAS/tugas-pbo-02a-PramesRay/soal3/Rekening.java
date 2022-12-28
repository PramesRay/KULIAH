public class Rekening {
  private float balance;

  public Rekening(){
      this.balance = 0;
  }

  public void addBalance(int num){
      this.balance += num;
  }

  public float getBalance(){
      return this.balance;
  }
}
