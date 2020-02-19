package com;

public class Computer {

	private int ram;
	private int cpu;
	private String os;
	static String manufacturer;
	
	public Computer() {
		
	}
	public Computer(int ram, int cpu, String os) {
		this.ram = ram;
		this.cpu = cpu;
		this.os = os;
	}
	public Computer(int cpu, String os) {
		this(2, cpu, os);
	}
	public Computer(String os, int ram) {
		this(ram, 4, os);
	}
	public Computer(int cpu) {
		this(cpu, "DOS");
	}
	
	
	
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", cpu=" + cpu + ", os=" + os + ", manufacturer=" + manufacturer + "]";
	}
	
	
	
	
}
