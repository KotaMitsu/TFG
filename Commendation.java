import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Commendation {
	public static void main(String[] args) {
		String people = null;
		String people2 = null;
		int peopleM = 0;

		Map<String, Integer> memberPay = new HashMap<>();//購入者と購入金額をソートする配列

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //人数
		for (int i = 0; i < N; i++) {
			people = sc.next();
			memberPay.put(people,peopleM);
		}
		int bookN = sc.nextInt();//書籍の購入数
		for (int j = 0; j < bookN; j++) {
			people = sc.next();
			peopleM = sc.nextInt();
			memberPay.put(people, peopleM);
		}
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(memberPay.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			//compareを使用して値を比較する
			public int compare(Entry<String, Integer> name, Entry<String, Integer> money) {
				return money.getValue().compareTo(name.getValue());
			}
		});

		// 7. ループで要素順に値を取得する
		for (Entry<String, Integer> entry : list_entries) {
			System.out.println(entry.getKey());
		}
	}
}
