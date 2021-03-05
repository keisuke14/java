/*5行目、6行目に例外が発生する*/
public class Main2 {
  public static void main(String[] args) {
    int[] counts = null;
    float[] heights = {171.3F,175.0F};
    /*NullPointerException nullが格納されている配列変数を利用すると発生する*/
    System.out.println(counts[1]);
    System.out.println(heights[2]);
  }
}