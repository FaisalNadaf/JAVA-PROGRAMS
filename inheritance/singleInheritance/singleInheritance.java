
class singleInheritance {
    void print1(){
        System.out.println("BASE CLASS");
    }
}

class singleInheritance2 extends singleInheritance {
    void print2(){
        System.out.println("DERIVED CLASS");
    }
    public static void main(String args[]){
        singleInheritance2 s=new singleInheritance2();
        s.print1();
        s.print2();
    }
}
