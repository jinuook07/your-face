
public class MyQueue extends Memory{//Memory�� ��ӹ���
	private int front;

	public MyQueue() {
		front=0;
	}

	public int pop() {		//�θ����� �޾Ҿ� �̰� �� ���¡~
		return arr[front++];
	}

}