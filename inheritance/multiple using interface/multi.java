

 interface multi {
public void print();
    
} 
 interface multi1 {
public void print();
    
} 


 class multi2 implements multi,multi1{

    public void print(){
        System.out.println("multiple inheritance");
    }
    public static void main(String[] args) {
        multi2 m= new multi2();
        m.print();
    }
}
