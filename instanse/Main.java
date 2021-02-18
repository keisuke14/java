public class Main {
  public static void main(String[] args) {
    /*heroクラスからインスタンスを生成し、変数hに入れる*/
    Hero h = new Hero();
    /*変数hのnameに代入*/
    h.name = "ミナト";
    /*変数hのhpに代入*/
    h.hp = 100;

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';
    
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    // System.out.println("勇者" + h.name + "生み出しました");
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}