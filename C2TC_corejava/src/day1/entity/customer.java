package day1.entity;

public class customer {
	private int cid;
	private String cname;
	private String ccity;
	public int getCid() {
		return cid;
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + "]";
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	
}
