
public class Demo {
	
	private 
		int no=10;
		char ch;
		short sh;
		long ln;
		float fl;
		boolean bo;
		double db;
	private static float avg;
	public int getdata(int a) {
		int n=a;
		return n;
	}
	public static void main(String [] args) {
		Demo d1=new Demo();
		Demo d3=new Demo();
		System.out.println(d1.no);
		Demo d2=d1;
		System.out.println(d2.ch);
		System.out.println(d2.sh);
		System.out.println(d2.db);
		System.out.println(d2.ln);
		System.out.println(d2.bo);
		System.out.println(d2.fl);
		System.out.println(d2.getdata(100));
		 
	}
}
