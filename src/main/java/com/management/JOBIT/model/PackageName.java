package com.management.JOBIT.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class PackageName {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int package_id;	
	
	@Column(name= "package_name")
	private String packageName;
	
	@Column(name= "price")
	private String price;
	
	@Column(name= "time")
	private String time;
	
	@Column(name= "descript")
	private String descript;
	
	public PackageName() {}
	public PackageName(int package_id, String packageName, String price, String time, String descript) {
		super();
		this.package_id = package_id;
		this.packageName = packageName;
		this.price = price;
		this.time = time;
		this.descript = descript;
	}
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	
	
}
