package synchronization;

public class InterCommunicationWaitExample {

	public static void main(String[] args) {
		final Customer customer = new Customer(5000);
		
		new Thread(){
			public void run(){
				try {
					customer.widraw(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		
		new Thread(){
			public void run(){
					customer.deposit(2000);
			}
		}.start();

	}

}
class Customer {
	int amount;
	Customer(int amount){
		this.amount = amount;
	}
	public synchronized void widraw(int widrawAmount) throws InterruptedException{
		if(this.amount<widrawAmount){
			System.out.println("please deposit "+(widrawAmount - this.amount)+"RS");
			System.out.println("waiting for deposit");
			wait();
		}
		
		this.amount = this.amount - widrawAmount;
		System.out.println("amount widrawn "+ widrawAmount+" and current balance "+this.amount);
	}
	
	public synchronized void deposit(int depositAmount) {
		this.amount+= depositAmount;
		System.out.println("deposited "+depositAmount+" rs");
		System.out.println("notifying waited thread to start widrawing");
		notify();
	}
}