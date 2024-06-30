package inheritance.multilevelinheritance;

class multilevelinheritance {
    void print(){
        System.out.println("BASE");
    }
}

class multilevelinheritance1 extends multilevelinheritance{
    void print1(){
        System.out.println("DERIVE1 from base");
    }
}

class multilevelinheritance2 extends multilevelinheritance1{
    void print2(){
        System.out.println("DERIVE2 form derive1");
    }
    public static void main(String args[]){
        multilevelinheritance2 m=new multilevelinheritance2();
        m.print();
        m.print1();
        m.print2();
    }
}
 