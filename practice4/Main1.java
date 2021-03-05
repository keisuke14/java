/*3つの残高「121902」「8302」「55100」が格納されているint型配列moneyListを宣言*/
/*その配列の要素を1つずつfor文で取り出し、表示する*/
/*同じ配列の要素を拡張for文で1つずつ取り出し、表示する*/
public class Main1 {
  public static void main(String[] args) {
    int[] moneyList = {121902,8302,55100};
    for (int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }
    for (int m : moneyList) {
      System.out.println(m);
    }
  }
}