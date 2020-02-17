package demo;

class A{
	int num = 0;
}
public class NonPrimitiveDemo {
public static void main(String[] args) {
	A a = new A();
	a.num = 4;
	A a1 = a;
	a1.num = 44;
	System.out.println(a.num);
	
	
}
}
