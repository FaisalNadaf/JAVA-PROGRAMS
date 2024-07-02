package constructor.parameterizedConstructor;

class parameteriedConstructor

{
 int id;
 String name;
 parameteriedConstructor
 (int i,String n)
 {
 id = i;
 name = n;
 }
 void display()
{
System.out.println(id+" "+name);
}
 public static void main(String args[])
{
 parameteriedConstructor
  s1 = new parameteriedConstructor
 (111,"Karan");
 parameteriedConstructor
  s2 = new parameteriedConstructor
 (222,"Aryan");
 s1.display();
 s2.display();
 }
} 