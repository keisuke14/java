/*x+yは15と表示させる*/
public class Main1 {
  public static void main(String[] args) {
    int x = 5;
    int y = 10;
    /*以下のコードだと表示されない 510と表示される*/
    // String ans = "x+yは" + x + y;
    // System.out.println(ans);
    
    /*オペランドの中に文字列が含まれると、他のオペランドも文字列に変換される*/
    String ans = "x+yは" + (x + y);
    System.out.println(ans);
  }
}