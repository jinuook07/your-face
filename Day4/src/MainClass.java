import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Memory mem;					// Ÿ�Ը� Memory 
		MyStack ms= new MyStack(); // �ڽĲ� Ÿ���� �� �θ����� ������
		MyQueue mq= new MyQueue(); // �ڽ�Ÿ���� �� �θ����� ������
		
		int index=0, index1=0;
		
		
		while(true) {
			System.out.println("1.stack 2.queue 3.break");
			index= sc.nextInt();
		
			if(index==1) mem=ms;
			if(index==2) mem=mq;
			else break;
			
			while(true) {
				System.out.println("1.push 2. pop 3.break");
			index1= sc.nextInt();
			
			if(index1==1) mem.push(sc.nextInt());
			else if(index1 == 2)System.out.println(mem.pop());
			else break;
			}
		
					
					
		}
		
//		MyStack ms=new MyStack();
//
//		ms.push(10);
//		ms.push(30);
//		ms.push(40);
//
//		System.out.println(ms.pop());// 40
//		System.out.println(ms.pop());// 30
//		System.out.println(ms.pop());// 10
//
//		MyQueue mq=new MyQueue();
//
//		mq.push(10);
//		mq.push(30);
//		mq.push(40);
//
//		System.out.println(mq.pop());// 10
//		System.out.println(mq.pop());// 30
//		System.out.println(mq.pop());// 40
	}

}
