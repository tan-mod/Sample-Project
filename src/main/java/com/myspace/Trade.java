package com.myspace;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Trade implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String buySellCode;
	private java.lang.String buySideAccountIdentifier;

	private java.lang.Integer id;

	private java.lang.String name;

	public Trade() {
	}

	public java.lang.String getBuySellCode() {
		return this.buySellCode;
	}

	public void setBuySellCode(java.lang.String buySellCode) {
		this.buySellCode = buySellCode;
	}

	public java.lang.String getBuySideAccountIdentifier() {
		return this.buySideAccountIdentifier;
	}

	public void setBuySideAccountIdentifier(
			java.lang.String buySideAccountIdentifier) {
		this.buySideAccountIdentifier = buySideAccountIdentifier;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public Trade(java.lang.String buySellCode,
			java.lang.String buySideAccountIdentifier, java.lang.Integer id,
			java.lang.String name) {
		this.buySellCode = buySellCode;
		this.buySideAccountIdentifier = buySideAccountIdentifier;
		this.id = id;
		this.name = name;
	}

}