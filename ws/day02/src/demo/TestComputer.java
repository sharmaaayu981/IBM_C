package demo;

public class TestComputer {

	public static void main(String[] args) {
		Computer nitro = new Computer(4, "Linux", 2);
		
		Computer com = new Computer();
		com.setCpu(8);
		com.setOs("Win7");
		com.setRam(8);
		
		Computer abc = new Computer("Linux", 2);
//		Computer c1 = new Computer(2);
		
		System.out.println(nitro);
		System.out.println(com);
	}
}
