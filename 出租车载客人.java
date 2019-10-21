package test;

public class Example04{
public static void main(String[] args){
new Visitor().start();
new Visitor().start();
new Visitor().start();
new Visitor().start();
new Visitor().start();}
}
class Visitor extends Thread{
private int visitor=100;
public void run(){
while(true){
if(visitor>0){
Thread vi=Thread.currentThread();
String vi_name=vi.getName();
System.out.println(vi_name+"ÕıÔÚ´îÔØ"+visitor--+"ÕÅÆ±");
}}}}