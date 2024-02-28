package Test13;

import java.util.Date;

public class Inventory {
	
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
	public Inventory() {
		super();
	}

	public Inventory(String productName, Date putDate, Date getDate, int putAmount, int getAmount,
			int inventoryAmount) {
		super();
		this.productName = productName;
		this.putDate = putDate; // 입고일
		this.getDate = getDate; // 출고일
		this.putAmount = putAmount;
		this.getAmount = getAmount;
		this.inventoryAmount = inventoryAmount;
	}

	@Override
	public String toString() {
		return "Inventory [productName=" + productName + ", putDate=" + putDate + ", getDate=" + getDate
				+ ", putAmount=" + putAmount + ", getAmount=" + getAmount + ", inventoryAmount=" + inventoryAmount
				+ "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	
	
	

}
