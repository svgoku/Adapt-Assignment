import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Assignment4Q2 {
	 private int totalPrice;
	    private String status;

	    public Assignment4Q2(int totalPrice, String status) {
			super();
			this.totalPrice = totalPrice;
			this.status = status;
		}

		public int getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
			Iterator<Assignment4Q2> iterator=orders.iterator();
			while(iterator.hasNext()) {
				Assignment4Q2 assignment4q2=iterator.next();
				if(assignment4q2.getTotalPrice()>10000 && (assignment4q2.getStatus().equals("Accepted") || assignment4q2.getStatus().equals("Completed"))){}
				else {
					iterator.remove();
				}
						
			}
			return orders;
		}

	public static void main(String[] args) {
		Assignment4Q2 order1=new Assignment4Q2(15000,"Accepted");
		Assignment4Q2 order2=new Assignment4Q2(10000,"Completed");
		Assignment4Q2 order3=new Assignment4Q2(12000,"NotCompleted");
		Assignment4Q2 order4=new Assignment4Q2(5000,"NotAccepted");
		Assignment4Q2 order5=new Assignment4Q2(19990,"Completed");
		
		ArrayList<Assignment4Q2> orders=new ArrayList<Assignment4Q2>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders=listOfOrders(orders);
		orders.forEach(order->System.out.println("The total price of order is: "+order.getTotalPrice()+"\nand the status of order is: "+order.getStatus()));

	}
 
}
