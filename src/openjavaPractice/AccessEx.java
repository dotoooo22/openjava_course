package openjavaPractice;

class Sample {
	public int a;
	//private int b;		//private로하면 밖에서 접근불가.
	int b;
	int c;
}
public class AccessEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;		//다른 클래스에서 private 접근 불가
		aClass.c = 10;
	}

}
