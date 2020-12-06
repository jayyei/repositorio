package introductionObjects;

public class MyDate {
	int day;
	int year;
	int month;
	
	public MyDate() {}
	
	public MyDate(int m, int d, int y) {
		this.month = m;
		this.year = y;
		this.day = y;
	}
	
	public String toString() {
		return month+"/"+day+"/"+year;
	}
	
	public void setDate(int m, int d, int y) {
		this.month = m;
		this.year = y;
		this.day = y;
	}
}
