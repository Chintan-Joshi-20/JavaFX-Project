package javaproject1;

/*
Just the normal class which stores the Student information
*/
public class Student {

	private int Age;
	private String Name;
	private int Id;
	private String Role;

        //gets the age
	public int getAge() 
        {
           return this.Age;
	}

        //sets the age
	public void setAge(int Age) 
        {
            this.Age = Age;
	}
        
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
            return this.Role;
	}

        //sets the role
	public void setRole(String Role) 
        {
            this.Role = Role;
	}

        //constructor
	public Student(String Name, int Age, int Id, String Role) 
        {
            this.Name = Name;
            this.Age  = Age;
            this.Id   = Id;
            this.Role = Role;
	}

}