import Tel.*;
public class Main {
       public static void main(String[] args) {
    	   //ʵ����һ�������û�
    	   TelcomUser telcomUser =new TelcomUser("15565901880");
    	   //����ͨ����¼
    	   telcomUser.generateCommunicateRcords();
    	   //��ӡͨ����¼
    	   telcomUser.printDetails();
       }
}
