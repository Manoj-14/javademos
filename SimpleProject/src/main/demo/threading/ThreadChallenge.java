package main.demo.threading;

public class ThreadChallenge {
	public static void main(String[] args) {

		int n = 10;
		for (int i = 1; i <= n; i++)
			Utils.printMsg("" + i);

		Runnable evenNumber = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 10; i += 2)
					Utils.printMsg("" + i);
			}
		};

		Runnable oddNumber = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i += 2)
					Utils.printMsg("" + i);

			}
		};
		
		Thread t1 = new Thread(evenNumber);
		t1.setName("Even number Thread");
		t1.start();
		
		Thread t2 = new Thread(oddNumber);
		t2.setName("Odd number Thread");
		t2.start();

	}
}

class ResourceWorker implements Runnable {
	EvenNumbers en;
	OddNumbers od;

	public ResourceWorker(EvenNumbers en, OddNumbers od) {
		this.en = en;
		this.od = od;
	}

	@Override
	public void run() {
		en.printEvenNumber();
		od.printOddNumber();
	}

}

class EvenNumbers {
	public synchronized void printEvenNumber() {
		for (int i = 0; i <= 10; i += 2)
			Utils.printMsg("" + i);
	}
}

class OddNumbers {
	public synchronized void printOddNumber() {
		for (int i = 1; i <= 10; i += 2)
			Utils.printMsg("" + i);
	}
}