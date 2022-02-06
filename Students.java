package assignment4.week3;

public class Students {
	
	public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(0);
		s.getStudentInfo(0, null);
	s.getStudentInfo(null, 0);
	}
	
	public int getStudentInfo(int regid) {	
		 regid=324;
		System.out.println(regid);
		return regid;
	}

	public void getStudentInfo(int labid,String s) {
		System.out.println("The Library ID is: 12");
	}
	public long getStudentInfo(String email,long phoneNumber) {
		
		email="keerthi@gmail.com";
		phoneNumber=9654675465l;
		System.out.println(email);
		System.out.println(phoneNumber);
		return phoneNumber;
	}
}
