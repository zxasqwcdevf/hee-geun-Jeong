package net.koreate.vo;

public class ProductVO {
	
	private String name;
	private int price;
	
	public ProductVO() {
		super();
	}

	public ProductVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
	

}
