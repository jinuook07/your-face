
public class Student {
	
	String name;			// �̸�, ��,��,�� ������ �����Ѵ�.
	int kor;
	int eng;
	int math;

	Student(){}
	Student(String name, int kor, int eng, int math){	//������ �Լ��� ���� �ʱ�ȭ �Ѵ�.
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public int total() {	//������ ���ϱ� ���� total �Լ��� ����
		return kor+eng+math;
	}
	
	public float avg() {	//����� ���ϱ� ���� avg �Լ��� ����
		return total()/3;
	}
	
}
