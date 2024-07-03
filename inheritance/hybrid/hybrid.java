package inheritance.hybrid;

public class hybrid {
    void print(){
        System.out.println("BASE");
    }
}

class hybrid1 extends hybrid{
    void print1(){
        System.out.println("hybrid1 derived from hybrid");
    }
}
class hybrid2 extends hybrid1{
    void print2(){
        System.out.println("hybrid2 derived from hybrid1");
    }
    
}
 
class hybrid3 extends hybrid{
     void print3(){
        System.out.println("hybrid3 derived from hybrid1");
    }
}

class hybrid4 extends hybrid2{
     void print4(){
        System.out.println(" hybrid4 derived from hybrid2");
    }
}


class mainClass{
    public static void main(String args[]){
        hybrid1 h1=new hybrid1();
        h1.print();
        h1.print1();
        hybrid2 h2=new hybrid2();
         h2.print();
         h2.print1();
         h2.print2();
        hybrid3 h3=new hybrid3();
         h3.print();
        h3.print3();
        hybrid4 h4=new hybrid4();
          h4.print();
         h4.print1();
         h4.print2();
          h4.print4();

    }
}

    

