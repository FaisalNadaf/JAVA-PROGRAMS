package typeCasting;

public class typecastig {

public static void main(String[] args)
{
int i = 100;
double d = i; //no explicit type casting required
double e = 100.04;
int f = (int)e; // explicit type conversion required
System.out.println("Example of implicit type conversion");
System.out.println("Int value "+i);
System.out.println("Double value "+d);
System.out.println("Example of explicit type conversion");
System.out.println("Double value "+e);
System.out.println("Int value "+f);
}
}

    

