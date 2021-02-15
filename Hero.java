public class Hero {
  /*クラスブロック内に宣言された変数はフィールドという*/
  String name;
  int hp;

  public void sleep() {
    this.hp = 100;
    /*thisは自分自身のインスタンスを表す*/
    System.out.println(this.name + "は、眠って回復した");
  }
  /*座る(sitメソッド),(int sec)で何秒座るか引数で受け取る*/
  public void sit(int sec) {
    /*座る秒数だけでHPを増やす*/
    this.hp += sec;
    System.out.println(this.name + "は、"　+ sec + "秒座った");
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  /*転ぶ(slipメソッド)*/
  public void slip( {
   this.hp -= 5;
   System.out.println(this.name + "は、転んだ");
   System.out.println("5のダメージ");
  }
  /*逃げる(runメソッド)*/
  public void run() {
    System.out.println(this.name + "は、逃げ出した");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}