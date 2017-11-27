
import java.util.Scanner;

class SumMessage {
	int sum_card; //合計値計算

	public String logic(int sum_card1, int sum_card2) { //最初に２枚受け取るメソッド
		sum_card += sum_card1;
		sum_card += sum_card2;
		String str = "";

		if (sum_card == 21) { //受け取った値を元にstrに代入する値を分岐
			str = "BlackJack!!!";
		} else if (sum_card > 21) {
			str = "Pig!";
		} else if (sum_card > 16) {
			str = "STAND";

		} else {
			str = "HIT";
		}
		return str;
	}

	public String logic(int sum_card1) { //引数を１つだけ受け取るメソッド
		String result = "";
		result = this.logic(sum_card1, 0); //logicの中身によって結果が変わる。
		return result;
	}

}

public class BlackJack {
	public static void main(String[] args) {
		int card3;
		Scanner sc = new Scanner(System.in);

		try {
			int card1 = Integer.parseInt(args[0]); //コマンドラインから受け取った値を整数に変換
			int card2 = Integer.parseInt(args[1]);

			SumMessage msg = new SumMessage(); //メソッドクラスのオブジェクトを生成あたいf

			System.out.println(card1 + "の値を受け取りました");
			System.out.println(card2 + "の値を受け取りました");
			System.out.println(msg.logic(card1, card2));

			if (msg.sum_card < 16) { //jackが16より小さかったら
				while (msg.sum_card < 16) {
					String sc1 = sc.next();//値を受け取る。
					if (sc1 != null) {
						card3 = Integer.parseInt(sc1);
						System.out.println(msg.logic(card3));//スキャナーで受け取った値を引数に渡す
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
