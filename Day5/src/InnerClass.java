
/*
 * 1. member inner class   OUTTER CLASS ����� �����Ӱ� ����� �� �ְ� ���ش�.
 * 2. static inner class
 * 3. local inner class   ����� ��
 * 4. annonymous inner class   �ֹ߼� 
 * 
 * 
 * 	Class A{
 * 
 * 			ClassB{
 * 
 * 
 * 			}	
 * 
 * 
 * }
 * 
 * 
 */





class A{
	private int a;

	public A() { System.out.println("A");
	a=30;
	}


	class B{
		public B() {
			a=50;
			System.out.println("B"+a);
		}
	}

	public static void main(String[] args) {

		// A aa=new A();
		// A.B bb= aa.new B();
		A.B aa1=new A().new B();
	}
}
