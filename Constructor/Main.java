public class Main {
  public static void main(String[] args) {
    /*①のコンストラクションを呼び出す　文字列引数がある*/
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    /*2②のコンストラクタを呼び出す　引数がない*/
    Hero h2 = new Hero();
    System.out.println(h2.name);
    // h1.name = "ミナト";
    // h1.hp = 100;
    // Hero h2 = new Hero();
    // h2.name = "アサカ";
    // h2.hp = 100;
    // Wizard w = new Wizard();
    // w.name = "スガワラ";
    // w.hp = 50;
    // w.heal(h1);
    // w.heal(h2);
    // w.heal(h2);
  }
}