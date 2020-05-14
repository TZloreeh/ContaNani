//Write a program that instaties two threads with mame thread1 and thread2 which print their na,e for 7 timees 

// *Run the program and see/interpret the result
// *Then insert a sleep of 1 second at each point



class Main {
  public static void main(String[] args) {
    
		
		
    
  }
}

class Thread1 extends Thread {
	public Thread1(){     	//costruttore
		super();
		setName("settenani");
	}
	
	@Override 
	public void run(){
		System.out.println("Thread: "+this.getName());
		

	}


}