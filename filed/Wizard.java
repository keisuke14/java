public class Wizard {
  String name;
  int hp;
  /*引数はHero型*/
  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(h.name + "のHPを10回復した");
  }
}