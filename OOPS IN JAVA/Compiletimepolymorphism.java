package OPPS;
class ABC{
	int add(int a,int b) {
		return a+b;
	}
	long add(long a,long b) {
		return a*b;
	}
}
class Compiletimepolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ABC a=new ABC();
	    System.out.println(a.add(5, 6));
	    System.out.println(a.add(36636L,3673737L));
	}

}
