package openjavaPractice;

import java.util.Scanner;
import java.util.Vector;

public class Q7_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Shape10> v = new Vector<Shape10>();
		Shape10 shape = null;
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					shape = new Line10();
					break;
				case 2:
					shape = new Rect10();
					break;
				case 3:
					shape = new Circle10();
					break;
				}
				v.add(shape);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 >> " );
				int position = sc.nextInt();
				if(v.size() == 0 || v.size() <= position)
					System.out.println("삭제할 수 없습니다.");
				else 
					v.remove(position);
				break;
			case 3:
				for(int i=0; i<v.size(); i++)
					v.get(i).draw();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
}
abstract class Shape10 {
	private Shape10 next;
	public Shape10() { next = null; }
	public void setNext(Shape10 obj) { next = obj; } //링크 연결
	public Shape10 getNext() { return next; }
	public abstract void draw();
}
class Line10 extends Shape10 {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect10 extends Shape10 {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle10 extends Shape10 {
	public void draw() {
		System.out.println("Circle");
	}
}
