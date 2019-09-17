单例模式：
class Single{
private static Single INSTANCE=new Single();
private Single(){}
public static Single getInstance(){
return INSTANCE;
}
}
class Example15{
public static void main (String[] args){
Single sl=Single.getInstance();
Single s2=Single.getInstance();
System.out.println(S1==S2);}}
多例模式：
class Example{
static{
System.out.println("测试类的静态代码块执行了");
}
public static void main(String[]args){
Person p1=new Person();
Person p2=new Person();
}}
class Person{
static String country;
static{
country="china";
System.out.println("Person类中的静态代码块执行了");
}}

Student类：
class Student{
 int grade;
 string name;
 public Student(int grade,string name){
 this.grade=grade;
 this.name=name;
 }
 public String getname(){
 return name;
 }
 public void setname(string name)
 {
 this.name=name;}
 public int getgrade(){
 return grade;
 }
 public void setgrade(int grade)
 {
 this.grade=grade;
 }
 }
 public class Test{
 public static void main(String[]args){
 Student stu1=new Student();
 stu1.setname("wanger");
 stu1.setgrade(99);
 Student stu2=new Student("zhangsan",100);
 }}
 
 

