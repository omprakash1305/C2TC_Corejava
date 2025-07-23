package day1.entity;

public class customer {
	private int cid;
	private String cname;
	private String ccity;
	public int getCid() {
		return cid;
	}
	public customer() {
		System.out.println("Default Constructor Has been Called");
	}
	/*public customer() {
		this.cid=102;
		this.cname="Vishnu";
		this.ccity="Cuddalore";
		}*/
	public customer(int cid,String cname,String ccity) {
		this("known","Pudu");
		this.cid=cid;
		this.cname=cname;
		this.ccity=ccity;
	}
	public customer(String cname,String ccity) {
		this();
		this.cname=cname;
		this.ccity=ccity;
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
