/*HeroクラスをベースにしてSuperHeroクラスを定義する*/
public class SuperHero extends Hero {
  // String name = "ミナト";
  // int hp = 100;
  /*flyingフィールドを追加*/
  boolean flying;

  // public void attack(Matango m) {
  //   System.out.println(this.name + "の攻撃");
  //   m.hp -= 5;
  //   System.out.println("5ポイントのダメージを与えた");
  // }

  // public void run() {
  //   System.out.println(this.name + "は逃げ出した");
  // }

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }
  /*子クラスで再定義　オーバーライド*/
  public void run() {
    System.out.println(this.name + "は撤退した");
  }
  // public void attack(Matango m) {
  //   super.attack(m);
  //   if (this.flying) {
  //     super.attack(m);
  //   }
}
