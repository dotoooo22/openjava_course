package openjavaPractice;
import java.util.*;
public class Q6_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");	
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");	
			System.out.println("어절 개수는 " + st.countTokens());
		}
		
		scanner.close();
	}

}
