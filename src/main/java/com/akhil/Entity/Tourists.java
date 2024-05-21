package com.akhil.Entity;

public class Tourists {
	private Integer id;
	private String name;
	private String packageType;
	private Double price;
	public Tourists() {
		super();
	}
	public Tourists(Integer id, String name, String packageType, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.packageType = packageType;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tourists [id=" + id + ", name=" + name + ", packageType=" + packageType + ", price=" + price + "]";
	}

}
