package fi.puv.e1401159.adsl.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the wifi database table.
 * 
 */
@Entity
@NamedQuery(name="Wifi.findAll", query="SELECT w FROM Wifi w")
public class Wifi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int crypt;

	private String flag;

	private int frag;

	private String iface;

	@Column(name="interface")
	private String interface_;

	private int misc;

	private int missedbeacon;

	private int nwid;

	private int qlevel;

	private int qlink;

	private int retry;

	private int snr;

	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private String we22;

	public Wifi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCrypt() {
		return this.crypt;
	}

	public void setCrypt(int crypt) {
		this.crypt = crypt;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getFrag() {
		return this.frag;
	}

	public void setFrag(int frag) {
		this.frag = frag;
	}

	public String getIface() {
		return this.iface;
	}

	public void setIface(String iface) {
		this.iface = iface;
	}

	public String getInterface_() {
		return this.interface_;
	}

	public void setInterface_(String interface_) {
		this.interface_ = interface_;
	}

	public int getMisc() {
		return this.misc;
	}

	public void setMisc(int misc) {
		this.misc = misc;
	}

	public int getMissedbeacon() {
		return this.missedbeacon;
	}

	public void setMissedbeacon(int missedbeacon) {
		this.missedbeacon = missedbeacon;
	}

	public int getNwid() {
		return this.nwid;
	}

	public void setNwid(int nwid) {
		this.nwid = nwid;
	}

	public int getQlevel() {
		return this.qlevel;
	}

	public void setQlevel(int qlevel) {
		this.qlevel = qlevel;
	}

	public int getQlink() {
		return this.qlink;
	}

	public void setQlink(int qlink) {
		this.qlink = qlink;
	}

	public int getRetry() {
		return this.retry;
	}

	public void setRetry(int retry) {
		this.retry = retry;
	}

	public int getSnr() {
		return this.snr;
	}

	public void setSnr(int snr) {
		this.snr = snr;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getWe22() {
		return this.we22;
	}

	public void setWe22(String we22) {
		this.we22 = we22;
	}

}