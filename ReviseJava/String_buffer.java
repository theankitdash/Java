class String_buffer  {

    public static void main(String p[]) {

        StringBuffer sb = new StringBuffer("hello"); 

        System.out.println("buffer= "+sb);
        System.out.println("length = "+sb.length()); 
        System.out.println("capacity = "+sb.capacity());

        String s; 
        int a =42;

        StringBuffer sb1 = new StringBuffer (40); 
        System.out.println("capacity = "+sb1.capacity());
        s=sb1.append("a = ").append(a).append("!").toString();
        System.out.println(s);

        StringBuffer sb2 = new StringBuffer("i java!");
        sb2.insert(2, "like ");
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer(" java!");
        sb3.insert(0, "Love");
        System.out.println(sb3);
    }
}