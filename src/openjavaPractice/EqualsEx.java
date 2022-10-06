package openjavaPractice;

class Point6 {
	int x, y;
	public Point6(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point6 p = (Point6)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}
class Rect3 {
	int width;
	int height;
	public Rect3(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect3 p = (Rect3)obj;
		if (width*height == p.width*p.height)
			return true;
		else
			return false;
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Point6 a = new Point6(2,3);
		Point6 b = new Point6(2,3);
		Point6 c = new Point6(3,4);
		if(a == b) // false
			System.out.println("a==b");
		if(a.equals(b)) // true
			System.out.println("a is equal to b");
		if(a.equals(c)) // false
			System.out.println("a is equal to c");*/
		Rect3 a = new Rect3(2,3);
		Rect3 b = new Rect3(3,2);
		Rect3 c = new Rect3(3,4);
		if(a.equals(b))
		System.out.println("a is equal to b");
		if(a.equals(c))
		System.out.println("a is equal to c");
		if(b.equals(c))
		System.out.println("b is equal to c");
	}

}
