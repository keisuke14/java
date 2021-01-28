  public class Sample2 {
    public static void main (String[] args) {
      /*int型の要素を代入できる型*/
      int[] scores;
      /*new演算子　指定された型の要素を[]内に指定された数だけ作成*/
      scores = new int[5];
      /*配列の要素の数を調べるコード*/
      int num = scores.length;
      System.out.println("要素の数:" + num);

    }
  }