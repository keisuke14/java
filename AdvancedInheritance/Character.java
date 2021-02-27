public class Character {
  String name;
  int hp;
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
  /*abstractは内容が確定していないときに使う、「あいまい、抽象的という意味」*/
  public abstract void attack(Matango m) ;
  
}