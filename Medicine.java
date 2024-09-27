public class Medicine{
     private String id;
     private String batchnumber;
     private String manufacturer;
     private Date expirydate;
     private int quantity;
     private String name;
     private double price;

  public Medicine(String id, String batchnumber, String manufacturer, Date expirydate, int quantity, String name, double price){

           this.id=id;
           this.batchnumber=batchnumber; 
           this.manufacturer=manufacturer; 
           this.expirydate=expirydate;
           this.quantity=quantity;
           this.name=name;
           this.price=price;


   }
     public void displayInformation(){

        System.out.println("*****************************************");
        System.out.println("The Id of medicine is " +id);
        System.out.println("The batchnumber of medicine is " +batchnumber);
        System.out.println("The manufacturer of medicine is " +manufacturer);
        System.out.println("The expirydate of medicine is " +expirydate);
        System.out.println("The quantity of medicine is " +quantity);
        System.out.println("The name of medicine is " +name);
        System.out.println("The price of medicine is " +price);
        System.out.println("*****************************************");


}
       public void setId(String id){
         this.id=id;
    }
       public void setBatchnumber(String batchnumber){
         this.batchnumber=batchnumber; 
    }
       public void setManufacturer(String manufacturer){
         this.manufacturer=manufacturer; 
    }
       public void setExpirydate(Date expirydate){
         this.expirydate=expirydate;
    }
       public void setQuantity(int quantity){
         this.quantity=quantity;
    }
       public void setName(String name){
          this.name=name;
    } 
       public void setPrice(double price){
          this.price=price;
    
    }
       public String getId(){
               return id;
    }
         
       public String getBatchnumber(){
               return batchnumber;
    }
       
       public String getManufacturer(){
               return manufacturer;
    }
       
       public Date getExpirydate(){
               return expirydate;
    }
         
       public int getQuantity(){
               return quantity;
    }
       
       public String getName(){
               return name;
    }

       public double getPrice(){
               return price;
    }

}