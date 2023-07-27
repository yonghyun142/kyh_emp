package jsp_kyh_example1.dto;

/*
이름     널?       유형           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
*/

public class DeptDto {
	private int deptno;
	private int dname;
	private int loc;
	
	public DeptDto() {
		
	}
	
	public DeptDto(int deptno, int dname, int loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public DeptDto(int deptno2, String dname2, String loc2) {
		// TODO Auto-generated constructor stub
	}

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getDname() {
		return dname;
	}
	public void setDname(int dname) {
		this.dname = dname;
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		this.loc = loc;
	}
	
	
}
