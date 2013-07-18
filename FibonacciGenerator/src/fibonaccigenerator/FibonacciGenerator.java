package fibonaccigenerator;

public class FibonacciGenerator implements FibonacciService{
	
	private long prev, current, temp;
	
	public FibonacciGenerator(){
		prev = 0;
		current = 1;
	}

	@Override
	public long getNextFib() {
		
		temp = prev;
		prev = current;
		current = temp + current;
		return temp;
	}

}
