public class Main {
  public static void main(String[] args) {
    testMechKeyboard();
    testMouse();
    testSpeaker();
  }

  static void testMechKeyboard() {
    MechKeyboard MECA6 = new MechKeyboard();
    MECA6.setBrand("Digital Alliance");
    MECA6.setColor("White Grey");
    MECA6.setFunction("Data Input Device");
    MECA6.setSwitchType("Outemu Blue");

    System.out.println();
    System.out.println("KEYBOARD MECHANICAL DA MECA 6 RGB");
    MECA6.printBasicInfo();
    System.out.println("Keyboard Switch Type\t: " + MECA6.getSwitchType());
  }
  
  static void testMouse() {
    Mouse VENOM2 = new Mouse();
    VENOM2.setBrand("Fantech");
    VENOM2.setColor("Blue Mint");
    VENOM2.setFunction("Pointer Device");
    VENOM2.setSensorType("PixArt PAW3212");

    System.out.println();
    System.out.println("MOUSE FANTECH VENOM II WGC2");
    VENOM2.printBasicInfo();
    System.out.println("Mouse Sensor Type\t: " + VENOM2.getSensorType());
  }
  
  static void testSpeaker() {
    Speaker FLIP5 = new Speaker();
    FLIP5.setBrand("JBL");
    FLIP5.setColor("Gray");
    FLIP5.setFunction("Audio Output Device");
    FLIP5.setDecibel(80);

    System.out.println();
    System.out.println("SPEAKER JBL FLIP 5");
    FLIP5.printBasicInfo();
    System.out.println("Speaker Signal-to-noise ratio\t: >" + FLIP5.getDecibel() + "dB");
  }
}
