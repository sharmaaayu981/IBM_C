package demo;

public class LoopDemo {

	public static void main(String[] args) {
		// table num
		
		int num = 5;
		int x=1;
		
//		while(x<=10) {
//			System.out.println(num + "*"+x+"="+num*x++);
//		}
		
		x=1;
//		for(;x<=10;)
//			System.out.println(num + "*"+x+"="+num*x++);

//		for(int a = 1;a<=10;)
//			System.out.println(num + "*"+a+"="+num*a++);

		
		for(int a = 1;a<=10;a++)
			System.out.println(num + "*"+a+"="+num*a);
		
		
		
		int[] a = new int[5];
		for(int n:a) {
			System.out.println(n);
		}
	}
}
