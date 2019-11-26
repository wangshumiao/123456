package Tel;
import java.text.*;
import java.util.*;
import xml.ReadXMLUitilcar;
import company.*;
import name.*;
public class TelcomUser {
     private String PhoneNumber;
     private String callTo;
     private TreeSet  list;
     public TelcomUser(String phoneNumber) {
    	 this.PhoneNumber =phoneNumber;
    	 this.list=new TreeSet();
     }
//ģ��ͨ����¼������
public void generateCommunicateRcords() {
    	 int recordNum=new Random().nextInt(10);
    	 for(int i=0;i<=recordNum;i++) {
    		 //������ɵ�i��ͨ����¼
    		 //��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
    		 long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
    		 //����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
    		 long timeEnd=timeStart + 60000+new Random().nextInt(600000);
    		 //���к���
    		 this.callTo=getCallToPhoneNumber(); 
    		 //����ͨ����¼
    		 this.list.add(this.PhoneNumber+
    				 ","+timeStart+
    				 ","+timeEnd+
    				 ","+this.callTo);
    	 }	 
     }
     //������ɱ��к��루����λ�����������
     private String getCallToPhoneNumber(){
    	 return "1834844"+String.valueOf( new Random().nextInt(10))+
    			 String.valueOf( new Random().nextInt(10))+
    			 String.valueOf(new Random().nextInt(10))+
    			 String.valueOf(new Random().nextInt(10));
    			 
     }
//ģ��ƷѰ취�����ַ�������ʽ���ر���4λС���ļƷѽ��
private String accountFee(long timeStart, long timeEnd) { 	
	Dianxin  ch = null;
	Company company;
	ch=(Dianxin)ReadXMLUitilcar.getBean();
	company=ch.productCompany();
    		 //ÿ�����շ�*Ԫ
    		 double feePerMinute=company.fei();
    		 //ͨ������ȥβ
    		 int minutes=Math.round((timeEnd-timeStart)/60000);
    		 double feeTotal=feePerMinute * minutes;
    		 return String.format("%.4f", feeTotal);
    	 }
//��ӡͨ����¼
public void printDetails() { 
	    Iterator it=list.iterator();
    	 //ѭ���ָ��¼�ڵ�ÿһ����
    	 while(it.hasNext()){    
    		 System.out.println("--------ͨ����¼������---------------");
    		 String [] recordField = ((String)it.next()).split(",");
    		 System.out.println("����"+recordField[0]);
    		 System.out.println("����"+recordField[3]);
    		 Date timeStart = new Date(Long.parseLong(recordField[1]));
    		 Date timeEnd = new Date(Long.parseLong(recordField[2]));
    		 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��dd��");
    		 
    		 System.out.println("ͨ����ʼʱ��"+simpleDateFormat.format(timeStart));
    		 System.out.println("ͨ������ʱ��"+simpleDateFormat.format(timeEnd));
    		 System.out.println("�Ʒѣ�"
    				 +accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
    						 +"   Ԫ��");
    	 }
     }
}
