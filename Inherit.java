package youdoordie;



	class parent{
		int add(int a, int b) {
			
			return a + b;
			
		}
	}

	public class Inherit extends parent{
		
		public static void main(String[] args) {
			Inherit obj = new Inherit();
			int sum = obj.add(2,2);
			
			System.out.println(sum);
		}
	}


