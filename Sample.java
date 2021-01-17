  /*サンプルププログラム*/
  public class Sample{
    public static void main(String[] args){
      /*int age = 20;
      System.out.println("私の年齢は" + age);
      age = 31;
      System.out.println("いや、本当の年齢は" + age);*/

      int a = 3; int b = 5;
      int c = a*b;
      System.out.println("縦幅3横幅5の長方形の面積は" + c);

      int d ; int e;
      d = 20; e = d + 5;
      System.out.println(d);
      System.out.println(e);

      int f;
      f = 100;
      /*fの内容が1増える*/
      f++;
      System.out.println(f);
      /*intが強制的な型変換を指示するキャスト演算子*/
      int year = (int)3.2;
      System.out.println(year);

      /*2(int型)を2.0(double型)に変換*/
      double g = 8.5 / 2;
      /*5(int型)を5L(long型)に変換*/
      long l = 5 + 2L;
      System.out.println(g);
      System.out.println(l);

      /*23(int型)が"23"(String型)に変換されて連結される*/
      String msg = "私の年齢は" + 23;
      System.out.println(msg);

      /*変数宣言
      String name = "すがわら";
      String message;
      計算文
      message = name + "さん、こんにちは";
      命令実行の文
      System.out.println(message);*/

      int i = 5;
      int h = 3;
      /*2つの引数を指定*/
      int m = Math.max(i,h);
      System.out.println("比較実験:" + i + "と" + h + "とで大きいほうは・・・" + m);

      /*乱数*/
      int r = new java.util.Random() .nextInt(90);
      System.out.println("あなたはたぶん、" + r + "歳ですね？");


      System.out.println("あなたの名前を入力してください。");
      /*キーボードから1行の文字列の入力を受け付ける*/
      String name = new java.util.Scanner(System.in).nextLine();
      System.out.println("あなたの年齢を入力してください。");
      /*キーボードから1つの整数の入力を受け付ける*/
      int age = new java.util.Scanner(System.in).nextInt();
      System.out.println("ようこそ、" + age + "歳の" + name + "さん");

    }
  }
