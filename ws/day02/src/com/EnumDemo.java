package com;

enum MachineState{
	RUNNING, STOPPED
}

enum Color{
	RED, GREEN, WHITE
}

enum Gender{
	MALE, FEMALE
}

class Machine{
	MachineState state = null;

	public MachineState getState() {
		return state;
	}

	public void setState(MachineState state) {
		this.state = state;
	}
	
}

public class EnumDemo {
	public static void main(String[] args) {
		Machine m = new Machine();
		
		System.out.println(m.getState());
		
		m.setState(MachineState.RUNNING);
		System.out.println(m.getState());
	}
}
