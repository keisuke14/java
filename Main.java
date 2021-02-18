//練習問題
// public class Main {
//   public static void main (String[] args) throws Exception {
//     doWarusa();
//     doTogame();
//     csllDeae();
//     showMondokoro();
//   }
//   public static void doWarusa() {
//     System.out.println("きなこでござる。食えませんがの。");
//   }
//   public static void doTogame() {
//     System.out.println("この老いぼれの目はごまかせませんぞ");
//   }
//   public static void callDeae() {
//     System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
//   }
//   public static void showMondokoro() {
//     System.out.println("飛車さん、角さん。もういいでしょう。");
//     System.out.println("この紋章が目に入らぬか！");
//     doTogame(); //もう一度、とがめる
//   }
// }

import comment.Zenhan;

public class Main {
  public static void main(String[] args) throws Exception {
    Zenhan.doWarusa();
    Zenhan.doTogame();
    comment.Kouhan.callDeae();
    comment.Kouhan.showMondokoro();
  }
}

