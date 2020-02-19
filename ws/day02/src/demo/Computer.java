package demo;

public class Computer {
	private int ram;
	private String os;
	private int cpu;
	
	public Computer() {
		System.out.println("Computer is ready");
	}
	

	public Computer(String os, int cpu) {
//		this.os = os;
//		this.cpu = cpu;
		this(2, os, cpu);
		System.out.println("default ram is 2 gb");
	}


	public Computer(int ram, String os, int cpu) {
		System.out.println("in const");
		this.ram = ram;
		this.os = os;
		this.cpu = cpu;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + "GB, os=" + os + ", cpu=" + cpu + "]";
	}
	
	
	
	
	

}
