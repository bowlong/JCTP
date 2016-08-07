package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6295\u8d44\u8005<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:455</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcInvestorField extends StructObject {
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u6295\u8d44\u8005\u5206\u7ec4\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorGroupID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6295\u8d44\u8005\u540d\u79f0<br>
	 * C type : TThostFtdcPartyNameType
	 */
	@Array({81}) 
	@Field(3) 
	public Pointer<Byte > InvestorName() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(4) 
	public byte IdentifiedCardType() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u8bc1\u4ef6\u7c7b\u578b<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(4) 
	public CThostFtdcInvestorField IdentifiedCardType(byte IdentifiedCardType) {
		this.io.setByteField(this, 4, IdentifiedCardType);
		return this;
	}
	/**
	 * \u8bc1\u4ef6\u53f7\u7801<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(5) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u662f\u5426\u6d3b\u8dc3<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public int IsActive() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \u662f\u5426\u6d3b\u8dc3<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public CThostFtdcInvestorField IsActive(int IsActive) {
		this.io.setIntField(this, 6, IsActive);
		return this;
	}
	/**
	 * \u8054\u7cfb\u7535\u8bdd<br>
	 * C type : TThostFtdcTelephoneType
	 */
	@Array({41}) 
	@Field(7) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u901a\u8baf\u5730\u5740<br>
	 * C type : TThostFtdcAddressType
	 */
	@Array({101}) 
	@Field(8) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \u5f00\u6237\u65e5\u671f<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(9) 
	public Pointer<Byte > OpenDate() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \u624b\u673a<br>
	 * C type : TThostFtdcMobileType
	 */
	@Array({41}) 
	@Field(10) 
	public Pointer<Byte > Mobile() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \u624b\u7eed\u8d39\u7387\u6a21\u677f\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(11) 
	public Pointer<Byte > CommModelID() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * \u4fdd\u8bc1\u91d1\u7387\u6a21\u677f\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(12) 
	public Pointer<Byte > MarginModelID() {
		return this.io.getPointerField(this, 12);
	}
	public CThostFtdcInvestorField() {
		super();
	}
	public CThostFtdcInvestorField(Pointer pointer) {
		super(pointer);
	}
}