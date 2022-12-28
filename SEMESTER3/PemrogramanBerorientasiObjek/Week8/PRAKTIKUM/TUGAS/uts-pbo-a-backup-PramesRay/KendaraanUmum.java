public abstract class KendaraanUmum {
  protected String type;

  protected KendaraanUmum(String type) {
      this.type = type;
  }

  protected abstract void statusPergerakan();
}