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
			String country = sc.next();
			System.out.print(country + " ");
			int c_time = sc.nextInt();
			System.out.println(cl.get(Calendar.HOUR) + c_time + ":" +
					cl.get(Calendar.MINUTE));
		}
	}
}
