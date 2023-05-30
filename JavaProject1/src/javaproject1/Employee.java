package javaproject1;

/*
Just a typical Employee class which stores the data.
*/
public class Employee 
{

	private String Name;
	private int Id;
	private String role;
	private int age;

        //gets the name
	public String getName() 
        {
            return this.Name;
	}

        //sets the name
	public void setName(String Name) 
        {
            this.Name = Name;
	}

        //gets the id
	public int getId() 
        {
            return this.Id;
	}

       //sets the id
	public void setId(int Id) 
        {
            this.Id = Id;
	}

        //gets the role
	public String getRole() 
        {
            return this.role;
	}

       //sets the role
	public void setRole(String role) 
        {
            this.role = role;
	}

        //gets the age
	public int getAge() 
        {
            return this.age;
	}

        //sets the age
	public void setAge(int age) 
        {
            this.age = age;
	}

        //constructor
	public Employee(String Name, int Id, String role, int age) 
        {
            this.Name = Name;
            this.Id  = Id;
            this.role = role;
            this.age  = age;
            
	}

}