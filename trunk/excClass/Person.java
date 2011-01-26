public class Person {
	String name ;
	int age ;

	public String getName(){
		return name ;
	}
	public int getAge(){
		return age ;
	}

	public void setName(String name){
		this.name = name ;
	}
	public void setAge(int age)
	{
		this.age = age ;
	}

	public static void main(String[]args){
		Person fanani = new Person();
		fanani.setName("Fanani M. Ihsan");
		fanani.setAge(21);
		System.out.println("Name : " + fanani.getName());
		System.out.println("Age  : " + fanani.getAge() + "\n");

		Person adi = new Person();
                adi.setName("Adi Sulistiono");
                adi.setAge(18);
                System.out.println("Name : " + adi.getName());
                System.out.println("Age  : " + adi.getAge() + "\n");
	}
}
