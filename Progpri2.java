package youdoordie;

	
class Name {
		private String SuperHero;
		public String getSuperHero() {
			return SuperHero;
		}
		public void setSuperHero(String SuperHero) {
			this.SuperHero = SuperHero;
		}
	}

	public class Progpri2  extends Name {

		public static void main(String[] args) {
			Progpri2 bb = new Progpri2();
			bb.setSuperHero("I am Batman");
			String ss = bb.getSuperHero();
			System.out.println(ss);
		}

	}

