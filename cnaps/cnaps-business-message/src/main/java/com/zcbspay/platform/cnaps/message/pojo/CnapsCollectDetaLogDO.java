package com.zcbspay.platform.cnaps.message.pojo;
// default package
// Generated 2017-3-3 11:03:08 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TCnapsCollectDetaLog generated by hbm2java
 */
@Entity
@Table(name = "T_CNAPS_COLLECT_DETA_LOG")
public class CnapsCollectDetaLogDO implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5055857151410273175L;
	private long tid;
	private String batchno;
	private String txid;
	private String purposeproprietary;
	private String debtorname;
	private String debtoraccountno;
	private String debtorbranchcode;
	private long amount;
	private String endtoendidentification;
	private String checkflag;
	private String addinfo;
	private String rspstatus;
	private String rsprejectcode;
	private String rsprejectinformation;
	private String rspprocessparty;
	private String rspdate;
	private String txnseqno;
	private String notes;
	private String remarks;

	public CnapsCollectDetaLogDO() {
	}

	public CnapsCollectDetaLogDO(long tid, String batchno, String txid,
			String purposeproprietary, String debtorname,
			String debtoraccountno, String debtorbranchcode, long amount,
			String endtoendidentification) {
		this.tid = tid;
		this.batchno = batchno;
		this.txid = txid;
		this.purposeproprietary = purposeproprietary;
		this.debtorname = debtorname;
		this.debtoraccountno = debtoraccountno;
		this.debtorbranchcode = debtorbranchcode;
		this.amount = amount;
		this.endtoendidentification = endtoendidentification;
	}

	public CnapsCollectDetaLogDO(long tid, String batchno, String txid,
			String purposeproprietary, String debtorname,
			String debtoraccountno, String debtorbranchcode, long amount,
			String endtoendidentification, String checkflag, String addinfo,
			String rspstatus, String rsprejectcode,
			String rsprejectinformation, String rspprocessparty,
			String rspdate, String txnseqno, String notes, String remarks) {
		this.tid = tid;
		this.batchno = batchno;
		this.txid = txid;
		this.purposeproprietary = purposeproprietary;
		this.debtorname = debtorname;
		this.debtoraccountno = debtoraccountno;
		this.debtorbranchcode = debtorbranchcode;
		this.amount = amount;
		this.endtoendidentification = endtoendidentification;
		this.checkflag = checkflag;
		this.addinfo = addinfo;
		this.rspstatus = rspstatus;
		this.rsprejectcode = rsprejectcode;
		this.rsprejectinformation = rsprejectinformation;
		this.rspprocessparty = rspprocessparty;
		this.rspdate = rspdate;
		this.txnseqno = txnseqno;
		this.notes = notes;
		this.remarks = remarks;
	}

	@Id
	@Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getTid() {
		return this.tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	@Column(name = "BATCHNO", nullable = false, length = 8)
	public String getBatchno() {
		return this.batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	@Column(name = "TXID", nullable = false, length = 16)
	public String getTxid() {
		return this.txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	@Column(name = "PURPOSEPROPRIETARY", nullable = false, length = 5)
	public String getPurposeproprietary() {
		return this.purposeproprietary;
	}

	public void setPurposeproprietary(String purposeproprietary) {
		this.purposeproprietary = purposeproprietary;
	}

	@Column(name = "DEBTORNAME", nullable = false, length = 120)
	public String getDebtorname() {
		return this.debtorname;
	}

	public void setDebtorname(String debtorname) {
		this.debtorname = debtorname;
	}

	@Column(name = "DEBTORACCOUNTNO", nullable = false, length = 32)
	public String getDebtoraccountno() {
		return this.debtoraccountno;
	}

	public void setDebtoraccountno(String debtoraccountno) {
		this.debtoraccountno = debtoraccountno;
	}

	@Column(name = "DEBTORBRANCHCODE", nullable = false, length = 14)
	public String getDebtorbranchcode() {
		return this.debtorbranchcode;
	}

	public void setDebtorbranchcode(String debtorbranchcode) {
		this.debtorbranchcode = debtorbranchcode;
	}

	@Column(name = "AMOUNT", nullable = false, precision = 12, scale = 0)
	public long getAmount() {
		return this.amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Column(name = "ENDTOENDIDENTIFICATION", nullable = false, length = 60)
	public String getEndtoendidentification() {
		return this.endtoendidentification;
	}

	public void setEndtoendidentification(String endtoendidentification) {
		this.endtoendidentification = endtoendidentification;
	}

	@Column(name = "CHECKFLAG", length = 4)
	public String getCheckflag() {
		return this.checkflag;
	}

	public void setCheckflag(String checkflag) {
		this.checkflag = checkflag;
	}

	@Column(name = "ADDINFO", length = 512)
	public String getAddinfo() {
		return this.addinfo;
	}

	public void setAddinfo(String addinfo) {
		this.addinfo = addinfo;
	}

	@Column(name = "RSPSTATUS", length = 4)
	public String getRspstatus() {
		return this.rspstatus;
	}

	public void setRspstatus(String rspstatus) {
		this.rspstatus = rspstatus;
	}

	@Column(name = "RSPREJECTCODE", length = 4)
	public String getRsprejectcode() {
		return this.rsprejectcode;
	}

	public void setRsprejectcode(String rsprejectcode) {
		this.rsprejectcode = rsprejectcode;
	}

	@Column(name = "RSPREJECTINFORMATION", length = 210)
	public String getRsprejectinformation() {
		return this.rsprejectinformation;
	}

	public void setRsprejectinformation(String rsprejectinformation) {
		this.rsprejectinformation = rsprejectinformation;
	}

	@Column(name = "RSPPROCESSPARTY", length = 14)
	public String getRspprocessparty() {
		return this.rspprocessparty;
	}

	public void setRspprocessparty(String rspprocessparty) {
		this.rspprocessparty = rspprocessparty;
	}

	@Column(name = "RSPDATE", length = 14)
	public String getRspdate() {
		return this.rspdate;
	}

	public void setRspdate(String rspdate) {
		this.rspdate = rspdate;
	}

	@Column(name = "TXNSEQNO", length = 16)
	public String getTxnseqno() {
		return this.txnseqno;
	}

	public void setTxnseqno(String txnseqno) {
		this.txnseqno = txnseqno;
	}

	@Column(name = "NOTES", length = 256)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 256)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}