package FST.demo.entities;

public class Product {
	private int id;
	private String SN;
	private String id_machine;
	private String date;
	private String type_test;
	private String mvt;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSN() {
		return SN;
	}
	public void setSN(String sN) {
		SN = sN;
	}
	public String getId_machine() {
		return id_machine;
	}
	public void setId_machine(String id_machine) {
		this.id_machine = id_machine;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType_test() {
		return type_test;
	}
	public void setType_test(String type_test) {
		this.type_test = type_test;
	}
	public String getMvt() {
		return mvt;
	}
	public void setMvt(String mvt) {
		this.mvt = mvt;
	}
	
	//constructor with params
	public Product(int id, String sN, String id_machine, String date, String type_test, String mvt) {
		super();
		this.id = id;
		SN = sN;
		this.id_machine = id_machine;
		this.date = date;
		this.type_test = type_test;
		this.mvt = mvt;
	}
	
	//constructor without params
	public Product() {
		super();
	}
	
	

}
