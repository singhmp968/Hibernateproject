package Assign2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USING")
public class Flower {
	@Id
	private String FlowerId;
	private String FlowerName;
	private String color;
	private int price;
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flower( String flowerName, String color, int price,String flowerId) {
		super();
		FlowerId = flowerId;
		FlowerName = flowerName;
		this.color = color;
		this.price = price;
	}
	public String getFlowerId() {
		return FlowerId;
	}
	public void setFlowerId(String flowerId) {
		FlowerId = flowerId;
	}
	public String getFlowerName() {
		return FlowerName;
	}
	public void setFlowerName(String flowerName) {
		FlowerName = flowerName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flower [FlowerId=" + FlowerId + ", FlowerName=" + FlowerName + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	
}
