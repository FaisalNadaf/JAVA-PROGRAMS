package superKeyword;

public class sup {

    public int a=10;
    
}

class sup1 extends sup{
    void print(){
        System.err.println(super.a);
    }
    public static void main(String[] args) {
        sup1 s=new sup1();
        s.print();
    }
}