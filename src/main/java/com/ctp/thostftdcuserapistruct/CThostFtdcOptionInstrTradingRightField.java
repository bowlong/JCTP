package com.ctp.thostftdcuserapistruct;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u6295\u8d44\u8005\u671f\u6743\u5408\u7ea6\u4ea4\u6613\u6743\u9650<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:3238</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
 
public class CThostFtdcOptionInstrTradingRightField extends StructObject {
	/**
	 * \u5408\u7ea6\u4ee3\u7801<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u6295\u8d44\u8005\u8303\u56f4<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u6295\u8d44\u8005\u8303\u56f4<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CThostFtdcOptionInstrTradingRightField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \u7ecf\u7eaa\u516c\u53f8\u4ee3\u7801<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u6295\u8d44\u8005\u4ee3\u7801<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(4) 
	public byte Direction() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u4e70\u5356\u65b9\u5411<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(4) 
	public CThostFtdcOptionInstrTradingRightField Direction(byte Direction) {
		this.io.setByteField(this, 4, Direction);
		return this;
	}
	/**
	 * \u4ea4\u6613\u6743\u9650<br>
	 * C type : TThostFtdcTradingRightType
	 */
	@Field(5) 
	public byte TradingRight() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \u4ea4\u6613\u6743\u9650<br>
	 * C type : TThostFtdcTradingRightType
	 */
	@Field(5) 
	public CThostFtdcOptionInstrTradingRightField TradingRight(byte TradingRight) {
		this.io.setByteField(this, 5, TradingRight);
		return this;
	}
	public CThostFtdcOptionInstrTradingRightField() {
		super();
	}
	public CThostFtdcOptionInstrTradingRightField(Pointer pointer) {
		super(pointer);
	}
}