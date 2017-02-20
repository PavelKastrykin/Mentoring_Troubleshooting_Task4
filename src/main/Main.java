package main;

import resource.SharedResource;
import thread.Incrementer;

public class Main {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		Thread thread1 = new Incrementer(resource, "FirstThread");
		Thread thread2 = new Incrementer(resource, "SecondThread");
		Thread thread3 = new Incrementer(resource, "ThirdThread");
		Thread thread4 = new Incrementer(resource, "FourthThread");
		Thread thread5 = new Incrementer(resource, "FifthThread");
		Thread thread6 = new Incrementer(resource, "SixthThread");
		Thread thread7 = new Incrementer(resource, "SeventhThread");
		Thread thread8 = new Incrementer(resource, "EighthThread");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
	}
}
