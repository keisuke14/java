public class Sample4 {
/*オーバーロード*/
  /*1つ目のaddメソッド*/
  // public static int add(int x, int y) {
  //   return x + y;
  // }
  // /*2つ目のaddメソッド*/
  // public static double add(double x, double y) {
  //   return x + y;
  // }
  // /*3つ目のaddメソッド*/
  // public static String add(String x, String y) {
  //   return x + y;
  // }
  // public static void main(String[] args) {
  //   /*1つ目のaddメソッド*/
  //   System.out.println(add(10, 20));
  //   /*2つ目のaddメソッド*/
  //   System.out.println(add(3.5, 2.7));
  //   /*3つ目のaddメソッド*/
  //   System.out.println(add("Hello", "World"));
    
  /*int型配列を作成して戻すメソッド*/
  public static int[] makeArray(int size) {
    int[] newArray = new int[size]; 
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    /*配列を戻す*/
    return newArray;
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    /*arrayの全要素を出力*/
    for (int i : array) {
      System.out.println(i);
    }
  }
}
// public class Sample4 {
//   /*int型配列を受け取り、すべての要素を表示するメソッド*/
//     public static void printArray(int[] array) {
//       for (int element : array) {
//         System.out.println(element);
//       }
//     }
//     public static void main(String[] args) {
//       int[] array = {1, 2, 3};
//       printArray(array);
//   }
// }