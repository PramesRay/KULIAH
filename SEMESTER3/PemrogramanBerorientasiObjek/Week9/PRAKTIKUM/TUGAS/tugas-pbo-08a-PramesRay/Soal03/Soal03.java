import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/*
 * =======================================================================================
 * Nama   : Prames Ray Lapian
 * NPM    : 140810210059
 * Kelas  : A
 * Tanggal: 7 November 2022
 * =======================================================================================
 * [PENJELASAN]
 * UTFDataFormatException merupakan kondisi ketika skema pengkodean karakter yang tidak 
 * didukung digunakan dalam string atau byte java. Metode java String getBytes mengonversi 
 * string yang diminta menjadi byte dalam format pengkodean yang ditentukan. 
 * Jika java tidak mendukung format encoding, maka metode String getBytes throw 
 * java.io.UnsupportedEncodingException dengan format encoding yang diberikan. 
 * =======================================================================================
 */

public class Soal03 {
  public static String decodeUrl(String url){
      String decode = "";
      String temp = "";
      try {
          temp = URLDecoder.decode(url, "UTF-8");
          decode = "Hasil decode : " + temp;
      } catch (UnsupportedEncodingException e) {
          System.out.println("Ada error (decode) : ");
          e.printStackTrace();
          decode = temp;
      }
      return decode;
  }

  public static String encodeUrl(String url){
      String decode = "";
      String temp = "";
      try {
          temp = URLEncoder.encode(url, "UTF");
          decode = "Hasil encode : " + temp;
      } catch (UnsupportedEncodingException e) {
          System.out.println("Ada error : ");
          e.printStackTrace();
          decode = temp;
      }
      return decode;
  }
  public static void main(String[] args) {
      String urlEncode = "https://github.com/praktikum-tiunpad-2022/";
      String urlDecode = "https%3A%2F%2Fpraktikum-tiunpad-2022.github.io%2Fmateri-PBO-08%2F22";
      
      System.out.println();
      System.out.println("[BEFORE]");
      System.out.println("URL decode : " + urlDecode);
      System.out.println("URL encode : " + urlEncode);
      
      System.out.println();
      System.out.println("[AFTER]");
      System.out.println(decodeUrl(urlDecode));
      System.out.println(encodeUrl(urlEncode));
  }
}