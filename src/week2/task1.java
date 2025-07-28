package week2;

public class task1 {
	private String name ="Ajith";
	private  int accNum =147852369;
	
	//getter methods
	String getName() {
		return name;
	}
	int getAccNum() {
		return accNum;
	}
	
	//setter methods
	void  setName(String n) {
		name=n;
	}
	void setAccNum(int a) {
		accNum =a;
	}
	
	public static void main(String[] args) {
		 task1 obj = new task1();
		 System.out.println(obj.getName());
		 System.out.println(obj.getAccNum());
		 
		 //if we need to hide the date then ---->
//		 obj.setAccNum(123456789);
//		 obj.setName("Vijay");
//		 System.out.println(obj.getName());
//		 System.out.println(obj.getAccNum());
	}
}
