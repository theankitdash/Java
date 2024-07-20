class myexception12 extends Exception {
    int detail;
    myexception12(int a) {
        detail = a;
    }
    public String toString() {
        return "myexception12[" + detail + "]";
    }
}


class userdefinedexception {

      static void compute (int a) throws myexception12 {

        System.out.println("called compute("+a+")"); 
        if (a>10) 
            throw new myexception12(a);
            System.out.println("normal exit");
    }
    public static void main(String p[]) {
        try {
            compute(1);
            compute (16);
        }
        catch (myexception12 e) {

            System.out.println("caught" +e);
        }
    }
}