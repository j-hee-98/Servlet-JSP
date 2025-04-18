package ex0416.el;

public class Product {
	private String code="A01";
	private String name="새우깡";
	private int qty=5;
	private int price=3500;
	
	public Product() {
		System.out.println("Product constuctor call...");
	}
	
	public String getCode() {
		System.out.println("getCode() 호출...");
		return code;
	}
	public String getName() {
		System.out.println("getName() 호출...");
		return name;
	}
	public int getQty() {
		System.out.println("getQty() 호출...");
		return qty;
	}
	public int getPrice() {
		System.out.println("getPrice() 호출...");
		return price;
	}
	
}
