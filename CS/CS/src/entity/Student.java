package entity;

public class Student {
	private String id;
	private String name;
	private String department;
	private String sex;
	private String pwd;
	private String age;
	
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getDepartment(){
		return department;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	
	public String getPwd(){
		return pwd;
	}
	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	
	public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age=age;
	}

	

}
