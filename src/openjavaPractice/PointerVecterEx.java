package openjavaPractice;
import java.util.Vector;

class Point7 {
	private int x, y;
	public Point7(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointerVecterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point7> v = new Vector<Point7>();
		// 3 개의 Point 객체 삽입
		v.add(new Point7(2, 3));
		v.add(new Point7(-5, 20));
		v.add(new Point7(30, -8));
		v.remove(1); // 인덱스 1의 Point(-5, 20) 객체 삭제
		
		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point7 p = v.get(i); // 벡터에서 i 번째 Point 객체 얻어내기
			System.out.println(p); // p.toString()을 이용하여 객체 p 출력
		}
	}

}
