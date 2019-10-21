public class Example03{
public static void main(String[] args){
Mythread mythread=new Mythread;
Thread thread=new Thread(myThread);
thread.start();
while(true){
System.out.println("main()方法在执行");
}}}
class Mythread implements Runnable{
public void run(){
while(true){
System.out.println("Mythread类的run()方法在执行");
}}}
