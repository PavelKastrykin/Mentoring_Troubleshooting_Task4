package thread;

import resource.SharedResource;

public class Incrementer extends Thread {

	private SharedResource resource;

	public Incrementer(SharedResource resource, String name) {
		this.resource = resource;
		this.setName(name);
	}

	public void run() {
		synchronized (resource) {
			System.out.println(getName() + " lock shared resource");
			while (resource.getCounter() < 100) {
				resource.incrementCounter();
				System.out.println(getName() + " increment counter to " + resource.getCounter());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName() + " release shared resource");
	}
}
