package parameterizedConstructor;

class ParameterizedConstructorUse
{
	private int id;
	private String name="";
	private String department="";

	public ParameterizedConstructorUse(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public ParameterizedConstructorUse(int id,String name,String department) {
		this.id=id;
		this.name=name;
		this.department=department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

public class ParameterizedConstructorMain {

	public static void main(String[] args) {
		ParameterizedConstructorUse constructorUse=new ParameterizedConstructorUse(1,"Suman Sharma");
		ParameterizedConstructorUse constructorUse2=new ParameterizedConstructorUse(2,"Aarti Sharma","CS");
		
		System.out.println("ID\t\t\tName\t\t\tDepartment");
		System.out.println(constructorUse.getId()+"\t\t\t"+constructorUse.getName()+"\t\t\t"+constructorUse.getDepartment());
		System.out.println(constructorUse2.getId()+"\t\t\t"+constructorUse2.getName()+"\t\t\t"+constructorUse2.getDepartment());
		
	}

}
