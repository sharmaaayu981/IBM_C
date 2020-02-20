package com.demo.polymorphism;

abstract class Engine{
	abstract public void run();
	abstract public void stop();
}
class CarEngine extends Engine {

	@Override
	public void run() {
		System.out.println("car is running..");
	}

	@Override
	public void stop() {
		System.out.println("car is stopped..");
	}}
class BikeEngine extends Engine {
	@Override
	public void run() {
		System.out.println("bike is running..");
	}

	@Override
	public void stop() {
		System.out.println("bike is stopped..");
	}}

class PlaneEngine  extends Engine{
	@Override
	public void run() {
		System.out.println("plane is running..");
	}

	@Override
	public void stop() {
		System.out.println("plane is stopped..");
	}}

class Car{
	Engine engine = null;//new PlaneEngine();
	Car(Engine e){// Engine e = new BikeEngine()
		engine = e;
	}
	public void start() {
		engine.run();
	}
}

public class CarDemo {
	public static void main(String[] args) {
		Car maruti = new Car(new BikeEngine());
		maruti.start();
	}
}
