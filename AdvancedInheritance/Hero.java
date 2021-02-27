public class Hero extends Character {
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("鉄器に10ポイントのダメージを与えた")；
    m.hp -= 10;
  }
}