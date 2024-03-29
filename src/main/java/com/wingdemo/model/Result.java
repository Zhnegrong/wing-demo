/**
 * 
 */
package com.wingdemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author I501061
 *
 */
public class Result { 
	private String PurchaseOrder;
	private String SourceERP;
	private String Vendor;
	private String Line;
	private String Item;
	private int ItemQty;
	private Date PlanDate;
	private int onTimeQte; 
	private List<DelayRecord> Delays=new ArrayList<DelayRecord>(); 
	public Result(String po,String erp,String vendor,String line, String item,int qte, Date date) {
		this.PurchaseOrder=po;
		this.SourceERP=erp;
		this.Vendor=vendor;
		this.Line=line;
		this.Item=item;
		this.ItemQty=qte;
		this.PlanDate=date;
		this.onTimeQte=0;
	}
	public void addRecord(DelayRecord record) {
		Delays.add(record);
	} 
	public List<DelayRecord> getRecords() {
		return Delays;
	}
	public String getPurchaseOrder() {
		return PurchaseOrder;
	}
	public void setonTimeItemQty(int qte) {
		onTimeQte = qte;
	}
	public int getonTimeItemQty() {
		return onTimeQte ;
	}
	public void setPurchaseOrder(String purchaseOrder) {
		PurchaseOrder = purchaseOrder;
	}
	public String getSourceERP() {
		return SourceERP;
	}
	public void setSourceERP(String sourceERP) {
		SourceERP = sourceERP;
	}
	public String getVendor() {
		return Vendor;
	}
	public void setVendor(String vendor) {
		Vendor = vendor;
	}
	public String getLine() {
		return Line;
	}
	public void setLine(String line) {
		Line = line;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public int getItemQty() {
		return ItemQty;
	}
	public void setItemQty(int itemQty) {
		ItemQty = itemQty;
	}
	public Date getPlanDate() {
		return PlanDate;
	}
	public void setPlanDate(Date planDate) {
		PlanDate = planDate;
	} 
}
