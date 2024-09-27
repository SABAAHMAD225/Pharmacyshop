public class Person{
    private String name;
    private String contactnumber;
    
    public void setName(String name){
        this.name=name;
    }
    public void setContactnumber(String  contactnumber){
        this.contactnumber=contactnumber;
    }
     public String getName(){
         return name;
    }
     public String getContactnumber(){
         return contactnumber;
    }
     public void displayInformation(){
         System.out.println("*****************************************");

        System.out.println("The name of the onwer is "+name);
        System.out.println("The contact number of the onwer is "+contactnumber);
    }
} 