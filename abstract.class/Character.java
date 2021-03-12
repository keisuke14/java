/*abstractが付いたクラスは抽象クラスと呼ばれる。抽象クラスは、newによるインスタンス化が禁止されている。*/
public abstract class Character {
  String name;
  int hp;
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
//   public abstract void attack(Matango m);

}