package fibonacchiwriter;

public class FibonacciWriterThread extends Thread {
	
	private Monitor monitor;
	private String name;
	
	public FibonacciWriterThread(String name, Monitor monitor){
		this.monitor = monitor;
		this.name = name;
	}
	
	public void run(){
		for(int i = 0; i < 4; i++){
			System.out.println(name + ":" + " " + monitor.getNextFib());
			try{
				sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
	}
}
