package resource;

public class SharedResource {

	private int counter = 0;

	public void incrementCounter() {
		counter++;
	}

	public int getCounter()	{
		return counter;
	}
}
