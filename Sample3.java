  public class Sample3 {
    public static void main(String[] args) {
    System.out.println("メソッドを呼び出します");
    /*helloメソッドを呼ぶ*/
    hello("湊");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出し終わりました");
    }
    /*helloメソッドの本体*/
    public static void hello(String name) {
    System.out.println(name + "こんにちは");
    }
  }
    


    // add (100, 20);
    // add (200, 50);
    // }
    /*複数の値を受け取るaddメソッド*/
  //   public static int add(int x, int y) {
  //     int ans = x + y;
  //     return ans;
  //   }
  //   public static void main(String[] args) {
  //     int ans = add(100,10);
  //     System.out.println("100 + 10 = " + ans);
  //   }
  // }


  //   public static void methodA() {
  //     System.out.println("methodA");
  //     /*methodBの呼び出し*/
  //     methodB();
  //   }
  //   public static void methodB() {
  //     System.out.println("methodB");
  //   }
  //   public static void main(String[] args) {
  //     /*methodAの呼び出し*/
  //     methodA();
  //   }
  // }