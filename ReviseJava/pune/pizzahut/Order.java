package pune.pizzahut;
import java.util.*;

public class Order implements deliverable{

    private int OrderNo;
    private Date orderDate;
    private int cost;
    private String custName;
    private String custAddress;
    private int approxDistance;

    public Order(int orderNo, Date orderDate, int cost, String custname, String custAddress, int approxDistance) {
        this.OrderNo = orderNo;
        this.orderDate = orderDate;
        this.cost = cost;
        this.custName = custName;
        this.custAddress = custAddress;
        this.approxDistance = approxDistance;
    }

    @Override
    public boolean delivery(){
        if (approxDistance <= deliveryAreaLimit) {
            return true;
        }
        else {
            System.out.println("Home delivery not available for this distance.");
            return false;
        }
    }    
}
