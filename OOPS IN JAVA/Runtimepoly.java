package OPPS;

class Runtimepoly {
  public void c() {
	  System.out.println("Super class");
  }
}
class XYZ extends Runtimepoly{
	public void c() {
		System.out.println("Sub class");
	}

}
class M{
	public static void main(String[] ar) {
		Runtimepoly r=new Runtimepoly();
		r.c();
		XYZ x=new XYZ();
		x.c();
	}
}
