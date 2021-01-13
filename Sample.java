  /*サンプルププログラム*/
  public class Sample{
    public static void main(String[] args){
      int age = 20;
      System.out.println("私の年齢は" + age);
      age = 31;
      System.out.println("いや、本当の年齢は" + age);

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

    }
  }
