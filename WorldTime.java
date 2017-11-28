import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class WorldTime{
	public static void main(String[] args) throws Exception {
		TimeZone tmz = TimeZone.getTimeZone("UTC");
		Calendar cl = Calendar.getInstance();
		cl.setTimeZone(tmz);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			System.out.print(s + " ");
			int ss = sc.nextInt();
			System.out.println(cl.get(Calendar.HOUR) + ss + ":" +
					cl.get(Calendar.MINUTE));
		}
	}
}
