package native_jdbc.dto;

public class Department {
	String deptName;
	int deptNo;
	int floor;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptNo, String deptName, int floor) {
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.floor = floor;
	}

	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("Department [deptNo=%s, deptName=%s, floor=%s]", deptNo, deptName, floor);
	}
	
	
}
