using System;
namespace operators{
class Arithmeticoperator {
  static void Main() {
    int a,b;
    Console.WriteLine("Enter two numbers:");
    a=Convert.ToInt32(Console.ReadLine());
    b=Convert.ToInt32(Console.ReadLine());
    Console.WriteLine("Addition:{0}",a+b);
    Console.WriteLine("Substraction:{0}",a-b);
    Console.WriteLine("Multiplication:{0}",a*b);
    Console.WriteLine("Division:{0}",a/b);
    Console.WriteLine("Remainder:{0}",a%b);
    
  }
}
}
