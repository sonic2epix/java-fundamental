class Person{
 String name ;
 int age ;

 void setName(String tmp){
  name = tmp ;
 }

 void setAge(int tmp){
  age = tmp ;
 }
 
 void print(){
  System.out.println("Name : " + name);
  System.out.println("Umur : " + age);
  System.out.println("---------------------------\n");

 }
 
  
 public static void main(String[]args){
	// object fanani
 	Person fanani = new Person();
	fanani.setName("Fanani Mafatikul Ihsan");	
	fanani.setAge(21);
	fanani.print();

	// object adi
	Person adi = new Person();
        adi.setName("Adi Sulitiono");
        adi.setAge(17);
        adi.print();
 }

}
