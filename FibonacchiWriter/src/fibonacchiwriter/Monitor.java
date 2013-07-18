package fibonacchiwriter;

import fibonaccigenerator.FibonacciGenerator;

public class Monitor {
	
	private FibonacciGenerator generator;
	
	public Monitor(){
		generator = new FibonacciGenerator();
	}
	
	public synchronized long getNextFib(){
		return generator.getNextFib();
	}

}
