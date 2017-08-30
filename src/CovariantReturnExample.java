
public class CovariantReturnExample extends SuperTest{
	public final String finalVar1;
	CovariantReturnExample(){
		finalVar1 = "test";
		System.out.println("this class constructor");
	}
	
	CovariantReturnExample(String test){
		finalVar1 = "test";
		System.out.println("");
	}
	public CovariantReturnExample getCovariantReturn(){
		System.out.println("");
		return this;
	}

	public final static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai");
		CovariantReturnExample testJava = new CovariantReturnExample();
		testJava.getCovariantReturn();
	}

}


class SuperTest {
	
	SuperTest() {
		System.out.println("super class constructor");
	}
	
	public SuperTest getCovariantReturn(){
		return this;
	}
}