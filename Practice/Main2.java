public class Main2 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "やきにく";
    System.out.println("こんにちは");
    /*ishungryが0であれば、「おなかいっぱい」、そうでないなら「はらぺこ」と表示*/
    if (isHungry == 0) {
      System.out.println("おなかいっぱい");
      }
      else {
        System.out.println("はらぺこ");
      }
      /*ishungryが空腹なら、food + "をいただきますを表示させる*/
      if (isHungry == 1) {
        System.out.println(food + "をいただきます");
      }
    System.out.println("ごちそうさまでした");
    }
  }