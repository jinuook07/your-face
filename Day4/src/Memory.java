
public abstract class Memory {


	protected int arr[];  //���� ������ ���� private, protected, default ����
	protected int index;

	//������//
	public Memory() {		
		arr = new int[5];
		int index=0;
	}




	//	public Memory(int count) {
	//		arr=new int[count];
	//	}


	public  void push(int index) {
		arr[this.index++] = index;

		//arr[index++]=index;
	}

	public abstract int pop();  //�߻�ȭ���Ѽ� �������ε� ��Ŵ���� �ڽ�Ŭ���װ�
	// pop�� �� ���� �ְ��Ѵ�.
}


