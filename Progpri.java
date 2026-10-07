package youdoordie;

	
class Parent66 {
		private int a;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
	}

	public class Progpri  extends Parent66 {

		public static void main(String[] args) {
			Progpri bb = new Progpri();
			bb.setA(7);
			int ss = bb.getA();
			System.out.println(ss);
		}

	}

