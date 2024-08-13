

class wrap {
    public static void main(String args[]){
        int i=1;
        double d=1.1;
        Integer a=Integer.valueOf(i);
        Double b=Double.valueOf(d);

        if (a instanceof Integer) {
            System.out.println("intger object is created");
        }

            if (b instanceof Double) {
            System.out.println("Double object is created");
        }

    }
}