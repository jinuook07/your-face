import java.util.ArrayList;
import java.util.Scanner;

public class MainScore {


	public static void main(String[] args) {

		ArrayList<Student> slist=new ArrayList<Student>();	//Student Ŭ������ Arraylist ���·� �ҷ��� slist�� �����Ѵ�.

		Scanner sc=new Scanner(System.in);		//�Է¹��� ���� ����ϱ� ���� Scanner Ŭ������ �����Ѵ�.





		while(true) {
			System.out.println("/---------------------------------------------------------------------------------------/");
			System.out.println("| 1.�����Է�	2.�����˻�		3.����		4.��������		5.��ü���		6.����	|");
			System.out.println("/---------------------------------------------------------------------------------------/");


			int input=sc.nextInt();		//input ������ �Է¹��� ��.


			if(input==1) {
				System.out.println("�̸��� �Է��ϼ���");

				String name=sc.next();

				System.out.println("����������  �Է��ϼ���");
				int kor= sc.nextInt();

				System.out.println("����������  �Է��ϼ���");
				int eng= sc.nextInt();

				System.out.println("����������  �Է��ϼ���");
				int math= sc.nextInt();

				slist.add(new Student(name, kor, eng, math));	//Student�� ( name, kor, eng, math) ����
				//������� Arraylist�� �߰��Ѵ�.
			}
			else if(input==2) {
				System.out.println("�˻��� �л��� �̸��� �Է��ϼ���");
				String name=sc.next();
				for(int i=0;i<slist.size();i++) {
					if(slist.get(i).name.equals(name)) {			//slist.get(i).name.equals(name))�� ����
						System.out.print(slist.get(i).name+"\t");	//������ i��° ���� ���� �̸����� ã�� ����Ѵ�.
						System.out.print(slist.get(i).kor+"\t");
						System.out.print(slist.get(i).eng+"\t");	
						System.out.print(slist.get(i).math+"\t");
						System.out.print(slist.get(i).total()+"\t");
						System.out.print(slist.get(i).avg()+"\t");
						System.out.println();


					}

				}

			}
			else if(input==3) {
				System.out.println("������ �л��� �̸��� �Է��ϼ���");
				String name=sc.next();


				System.out.println("������ ������ �Է��ϼ���."+"\n"+"1.����� "+"2.����� "+"3.���м��� ");
				int a=sc.nextInt();
				for(int i=0;i<slist.size();i++) {
					if(slist.get(i).name.equals(name)) {		
						if(a==1) {
							slist.get(i).setKor(sc.nextInt());}	//slist.get(i).setKor()�� �̿��� ������ ���� �Է¹޴� ������ �ٲ۴�.
						else if(a==2) {
							slist.get(i).setEng(sc.nextInt());}
						else if(a==3) {
							slist.get(i).setMath(sc.nextInt());}

					}
				}
			}
			else if(input==4) {
				System.out.println("������ �л��� �̸��� �Է��ϼ���");
				String name=sc.next();
				for(int i=0;i<slist.size();i++) {
					if(slist.get(i).name.equals(name)) {
						slist.remove(i);					//slist.remove(i); i��° ��̸� �����Ѵ�.
					}
				}

			}
			else if(input==5) {
				System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���");
				for(int i=0;i<slist.size();i++) {
					System.out.println(slist.get(i).name+"\t"+slist.get(i).kor+"\t"+slist.get(i).eng+"\t"+slist.get(i).math+"\t"+slist.get(i).total()+"\t"+slist.get(i).avg());


				}

			}
			if(input==6) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}