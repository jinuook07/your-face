/*
 *  Overridingg
 *  
 *  1. Super Class �� Sub Class�� �Ȱ��� ������ ����� ������ �ִ� ��
 *  
 *  2. 
 *  
 */


public class B extends A{


	private int age;

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}

	
	public String toString() {
//		return getName()+"\t"+getAge();
		return super.toString()+"\t"+getName()+"\t"+getAge();
	}
	
	
	
	
	///������

	public B() {
		//super(); �ڽ��� �θ��� �����ڸ� ȣ�� // �ڽ� �������� ���� �� ���ο� ����// �� ��������� �� ��� ����Ʈ�� ����.
		System.out.println("B ������");

	}

	public B(String name,int age){
		super(name);
		this.age=age;
	}




	public static void main(String[] args) {


		B bb= new B("Superman",1000);
		bb.setName("superman");
		bb.setAge(1000);

		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		
		System.out.println(bb);
	}

}
