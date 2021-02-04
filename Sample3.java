  public class Sample3 {
    // public static void main(String[] args) {
    //   System.out.println("メソッドを呼び出します");
    //   /*helloメソッドを呼ぶ*/
    //   hello();
    //   System.out.println("メソッドの呼び出し終わりました");
    // }
    // /*helloメソッドの本体*/
    // public static void hello() {
    //   System.out.println("こんにちは");

    public static void methodA() {
      System.out.println("methodA");
      /*methodBの呼び出し*/
      methodB();
    }
    public static void methodB() {
      System.out.println("methodB");
    }
    public static void main(String[] args) {
       /*methodAの呼び出し*/
      methodA();
    }
  }