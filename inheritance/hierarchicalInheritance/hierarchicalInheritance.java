package inheritance.hierarchicalInheritance;

 class hierarchicalInheritance {
    void print(){
        System.out.println("BASE");
    }    
}
 class hierarchicalInheritance_1 extends hierarchicalInheritance {
    void print1(){
        System.out.println("DERIVED1");
    }    
}
 class hierarchicalInheritance_2 extends hierarchicalInheritance {
    void print1(){
        System.out.println("DERIVED2");
    }   
    
    public static void main(String args[]){
         hierarchicalInheritance_1 h1=new hierarchicalInheritance_1();
        h1.print();
        h1.print1();
        hierarchicalInheritance_2 h2=new hierarchicalInheritance_2();
        h2.print();
        h2.print1();
    }
}
