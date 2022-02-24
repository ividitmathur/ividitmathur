import java.io.*;

public class Vul {
public static void main(String s[]){
  new java.io.DataInputStream(java.lang.Runtime.getRuntime().exec("whoami").getInputStream()).readLine();
 }
}
