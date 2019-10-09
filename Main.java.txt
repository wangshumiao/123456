public class Main{
public static void main(Stirng[] args){
TV tv;
TVFactory factory;
factory = (TVFactory)XMLUtil.getBean();
tv = factory.produceTV();
tv.play();
}}