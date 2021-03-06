package com.cg.capstore.beans;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountBean {

	private String discountId;

	private Integer discountPercent;

	private Date timePeriod;

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public Integer getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Integer discountPercent) {
		this.discountPercent = discountPercent;
	}

	public Date getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(Date timePeriod) {
		this.timePeriod = timePeriod;
	}

	@Override
	public String toString() {
		return "DiscountBean [discountId=" + discountId + ", discountPercent=" + discountPercent + ", timePeriod="
				+ timePeriod + "]";
	}

	public DiscountBean(String discountId, Integer discountPercent, Date timePeriod) {
		super();
		this.discountId = discountId;
		this.discountPercent = discountPercent;
		this.timePeriod = timePeriod;
	}

	public DiscountBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}
