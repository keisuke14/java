public class Hero {
  String name;
  int hp;

  public void attack() {

  }
  /*コンストラクタとして定義*/
  /*引数として文字列を1つ受け取る①*/
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
  }
  /*新しくつくったコンストラクタ②*/
 public Hero() {
  // this.hp = 100;
  /*①のコンストラクタを呼び出すためにJVMに依頼している*/
   this("ダミー");
 }
}