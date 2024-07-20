import java.util.*; 

public class hashmapdemo {

    public static void main(String p[]) {

        HashMap hm = new HashMap();
        hm.put("john doe", new Double (3134.34));
        hm.put("tom smith", new Double(123.22)); 
        hm.put("jane baker", new Double (1374.00)); 
        hm.put("todd hall", new Double (99.22));
        //hm.put("ralph smith", new Double (19.08));

        Set set = hm.entrySet(); 
        Iterator i = set.iterator(); 
        while(i.hasNext()) {

            HashMap.Entry me = (HashMap.Entry)i.next(); 
            System.out.print (me.getKey() + ": "); 
            System.out.println(me.getValue());
        }
        System.out.println();
    double balance = ((Double)hm.get("john doe")).doubleValue();
    }
}