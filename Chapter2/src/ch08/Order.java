package ch08;

public class Order {
	
	public String orderNumber;
	public String customerPhone;
	public String customerAddress;
	public String orderDate;
	public String orderTime;
	public int price;
	public String menuId;
	
	
	public Order(String orderNumber, String customerPhone, String customerAddress, String orderDate, String orderTime,
			int price, String menuId) {
		
		this.orderNumber = orderNumber;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.price = price;
		this.menuId = menuId;
	}
	
	public void orderDetail() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + customerPhone);
		System.out.println("�ֹ� �� �ּ� : " + customerAddress);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ� �ð� : " + orderTime);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuId);
		
	}
	
	
	
	

}
