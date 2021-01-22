public class Sample1{
  public static void main (String[] args) {

    /*条件分岐*/
    /*初めにtrueかfalseを決める*/
    boolean tenki = true;
    /*内容が2行なので｛　省略不可*/
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
      /*内容が1行なので｛　省略可能、ただし、推奨はされていない*/
    } else
      System.out.println("DVDを見ます");

    /*boolean doorClose = true;
    /*ドアが閉まっている間(無限ループする)whileは繰り返し制御
    while (doorClose == true); {
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }*/

  System.out.println("あなたの運勢を占います");
  int fortune = new java.util.Random().nextInt(4) + 1;
  if (fortune == 1) {
    System.out.println("大吉");
  } else if (fortune == 2) {
    System.out.println("中吉");
  } else if (fortune == 3) {
    System.out.println("吉");
  } else {
    System.out.println("凶");
  }

  /*if文をスマートにするためにswitchを使う*/
  /*switchを使う場合、全ての条件式が「変数==値」「変数==変数」のように左辺等辺が一致するかを比較する式になっていること*/
  switch(fortune) {
    case 1:
      System.out.println("大吉");
      break;
    case 2:
      System.out.println("中吉");
      break;
    case 3:
      System.out.println("吉");
      break;
    default:
      System.out.println("凶");
  }

  }
}