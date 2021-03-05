/*int型で要素数3の配列numbers 初期値は3,4,9とする*/
/*画面に1桁の数字を入力*/
/*キーボードから数字を入力を受け付け、変数inputに代入*/
/*配列を回しながら、いずれかの要素と等しいかを調べ、等しければ、当たりと表示*/
public class Main3 {
  public static void main(String[] args) {
    int[] numbers={3,4,9};
    System.out.println("1桁の数字を入力");
    int input = new java.util.Scanner(System.in).nextInt();
    for(int n : numbers) {
      if(n == input) {
        System.out.println("当たり");
      }
    }
  } 
}