
public class lotto {
 public static void main(String[] args) {
  int[] num = new int[7];
      
  for(int i=0; i<7; i++) {
   num[i] = (int)(Math.random()*45)+1; //1~45 ���� ����
      
   for(int j=0;j<i;j++) {   //�ߺ��˻�
    if(num[j] ==num[i]) {
     i--;
     break;
    }
   }
  }
  System.out.println("�ζ� ��÷��ȣ");
  for(int i=0; i<7 ;i++) {
   System.out.print(num[i]+",");
  }
  System.out.println();
 }
}