package javaproject1;

/*
The below class is where all the hashMap values are being stored inside
*/
import java.util.HashMap;

public class HashMapClass 
{
    //creating a HashMap.
    protected HashMap<String,String> data = new HashMap<>();
   
    //this method below stores all the data coming from the textFields inside the hashmap
    public String storeValues(String name, String id, String age, String role)
    {
        
       data.put("Name", name);   //gets and puts the value from NameField
       data.put("Id", id);       //gets and puts the value from IdField
       data.put("Age",age);      //gets and puts the value from AgeField
       data.put("Role",role);    //gets and puts the value from RoleField
       
       
       String value1 = data.get("Name");   //this stores values from the above code into a string format
       String value2 = data.get("Id");     //this stores values from the above code into a string format
       String value3 = data.get("Age");    //this stores values from the above code into a string format
       String value4 = data.get("Role");   //this stores values from the above code into a string format
       
      //below code prints the data from the HashMap 
      return value1 + "                                   "+ value2 + "                                        " + value3 + "                                             " + value4;
      
    }
    
}