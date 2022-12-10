package OPPS;
abstract class A{
	abstract void call1();
	public void call2() {
		System.out.println("Non abstract method");
	}
}
class Abstraction extends A{
    public void call1() {
    	System.out.println("Abstract method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Abstraction a=new Abstraction();
			a.call1();
			a.call2();

	}

}