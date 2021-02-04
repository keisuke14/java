  public class Sample2 {
    public static void main (String[] args) {
      /*int型の要素を代入できる型*/
      int[] scores;
      /*new演算子　指定された型の要素を[]内に指定された数だけ作成*/
      scores = new int[5];
      /*配列の要素の数を調べるコード*/
      int num = scores.length;
      System.out.println("要素の数:" + num);

      /*配列の要素に値を代入*/
      int[] score;
      score = new int[5];
      score[1] = 30;
      System.out.println(score[1]);

      int[] scor = {20, 30, 40, 50, 80};
      /*合計の算出 scor[0]からでないとエラーが出る　先頭の要素の添え字は[0]から*/
      int sum = scor[0] + scor[1] + scor[2] + scor[3] + scor[4];
      /*平均の算出*/
      int avg = sum / scor.length;
      /*合計と平均の表示*/
      System.out.println("合計点:" + sum);
      System.out.println("平均点:" + avg);

      /*for文でループ*/
      int[] sco = {20, 30, 40, 50, 80};
      /*集計結果を入れるための変数を初期化して準備*/
      int summ = 0;
      for (int i = 0; i < sco.length; i++) {
        summ += sco[i];
      }
      /*平均の算出*/
      int average = summ / sco.length;
      /*合計と平均の表示*/
      System.out.println("合計点:" + summ);
      System.out.println("平均点:" + average);

       int[] s = {20, 30, 40, 50, 80};
      /*集計結果を入れるための変数を初期化して準備*/
      int count = 0;
      for (int j = 0; j < s.length; j++) {
        /*条件に合致する要素があればカウント*/
        if (s[j] >= 50) {
          count++;
        }
      }
      System.out.println("50点以上の科目の数は" + count);

      int[] seq = new int[10];
      /*塩基配列をランダムに生成*/
      for (int k = 0; k < seq.length; k++) {
        seq[k] = new java.util.Random().nextInt(4);
      }
      /*生成した塩基配列の記号を表示*/
      for (int k = 0; k < seq.length; k++) {
        /*配列baseを定義*/
        char[] base = {'A', 'T', 'G', 'C'};
        /*配列baseの中にseq[k]があるだけ*/
        System.out.println(base[seq[k]] + "");
      }
    /*2次元配列の利用*/
    /*2行3列の配列　[2]が行[3]が列*/
     int[][] counts = new int[2][3];
     counts[0][0] = 40;
     counts[0][1] = 50;
     counts[0][2] = 60;
     counts[1][0] = 80;
     counts[1][1] = 60;
     counts[1][2] = 70;
     System.out.println(counts[1][1]);

     /*親要素と子要素の要素数を表示*/
     int[][] conts = {{40,50,60},{80,60,70}};
     System.out.println(conts.length);
     System.out.println(conts[0].length);
    }
  }