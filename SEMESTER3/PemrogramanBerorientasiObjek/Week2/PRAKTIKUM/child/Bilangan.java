public class Bilangan {
  //variable
  private int lo, a, hi;
  
  //constructor
  public Bilangan() {
    this.hi = 100;
  }

  //setter
  public void setLo(int lo) {
    this.lo = lo;
  }
  public void setA(int a) {
    this.a = a;
  }
  public void setHi(int hi) {
    this.hi = hi;
  }

  //getter
  public Integer lo() {
    return this.lo ;
  }
  public Integer a() {
    return this.a ;
  }
  public Integer hi() {
    return this.hi ;
  }
  public Integer getGap() {
    if((a - lo) < (hi - a))
      return (a - lo);
    else 
      return (hi - a);
  }
}
