package OPPS;

public class Encapsulation {
public static void main(String ar[]) {
	Employee obj=new Employee();
	obj.set("Kural");
	obj.set(1);
	System.out.println("Integer : "+obj.geta());
	System.out.println("String : "+obj.getb());
}
}
