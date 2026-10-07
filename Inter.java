class Parent 
{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a=a;
	}
}
class demo extends Parent{
	public static void main(String[]args) {
		demo bb=new demo();
		bb.setA(3);
		int ss=bb.getA();
		System.out.println(ss);
	}
	
}