import java.util.ArrayList;
import java.util.Scanner;

class Method {
	static int jack; //合計値計算
	String str = ""; //戻り値格納

	public String logic(int card1, int card2) { //最初に２枚受け取るメソッド
		jack += card1;
		jack += card2;

		if (Method.jack == 21) { //受け取った値を元にstrに代入する値を分岐
			str = "BlackJack!!!";
		} else if (Method.jack > 21) {
			str = "Pig!";
		} else if (Method.jack > 16) {
			str = "STAND";

		} else {
			str = "HIT";
		}
		return str;
	}

	public String logic(int card1) { //引数を１つだけ受け取るメソッド
		this.logic(card1, 0);
		return str;
	}

}

public class BlackJack {
	public static void main(String[] args) {

		int card3;
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<>();

		try {
			int card1 = Integer.parseInt(args[0]); //コマンドラインから受け取った値を整数に変換
			int card2 = Integer.parseInt(args[1]);

			Method mtd = new Method(); //メソッドクラスのオブジェクトを生成あたいf

			System.out.println(mtd.logic(card1, card2));

			if (Method.jack < 16) { //jackが16より小さかったら
				while (Method.jack < 16) {
					String sc1 = sc.next();//値を受け取る。
					if (sc1 != null) {
						card3 = Integer.parseInt(sc1);
						array.add(card3);//１つだけ値を受け取り配列に格納
					}

					for (int jack : array) {
						System.out.println(mtd.logic(jack));//配列に格納された値を取り出し引数に渡す。
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("カードを受け取っていません");

		} finally {
			sc.close(); // sc
		}

	}
}
