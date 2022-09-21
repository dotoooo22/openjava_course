package openjavaPractice;
import java.util.Scanner;
import java.util.Random;

public class CardNumGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        while(true) {
            Random r = new Random();
            int k = r.nextInt(100);
            System.out.println("수를 결정하였습니다. 맞추어보세요");
            System.out.println("0-99");
            int i = 1;
            while(true) {
                
                System.out.println(i + ">>");
                int input = scanner .nextInt(); 

                while(input != k) { 
                    if(input<k)  
                        System.out.println("더 크게");
                    else if(input>k) 
                        System.out.println("더 작게");
                    i++;
                    break;
                }

                if(input==k) { 
                    System.out.println("맞았습니다.");
                    System.out.println("다시하시겠습니까? (y/n) >>");

                    if(scanner.next().equals("n")) {
                        System.out.println("숫자 맞추기를 종료합니다.");
                        System.exit(0);
                    }
                    else 
                        break; 
                }
            }
        }
	}
}
