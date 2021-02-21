/*Heroクラスを定義*/
public class Hero {
  String name;
  int hp;
  /*剣の情報*/
  Sword sword;
  public void attack() {
  System.out.println(this.name + "は攻撃した");
  System.out.println("敵に5ポイントのダメージを与えた");
  }
}