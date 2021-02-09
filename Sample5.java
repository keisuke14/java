package calcapp.main;
import calcapp.logics.Sample5Logic;

 public class Sample5 {
   public static void main(String[] args) {
     int a = 10; int b = 2;
     /*ファイルSample5Logicから呼びだす方法*/
     int total = calcapp.logics.Sample5Logic.tasu(a,b);
     int delta = calcapp.logics.Sample5Logic.hiku(a,b);
     System.out.println("足すと"+total+"、引くと"+delta);
   }
   // public static int tasu(int a, int b) {
   //   return (a + b);
   // }
   // public static int hiku(int a, int b) {
   //   return (a - b);
   // }
 }