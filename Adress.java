public class Adress{
     private String city;
     private String street;
     private String postalcode;
  
   public Adress(String city,String street,String postalcode){
     this.city=city;
     this.street=street;
     this.postalcode=postalcode;
  }
     public void setCity(String  city){
        this.city=city;
    }
      public void setStreet(String street){
        this.street=street;
    }
       public void setpostalcode(String postalcode){
        this.postalcode=postalcode;
    }
       public String getCity(){
         return city;
    }
       public String getStreet(){
         return street;
    }
       public String getPostalcode(){
         return postalcode;
    }
    public void displayAdress(){
    System.out.println("*************************************************");

    System.out.println("The pharmacy is situated in "+city+ "in the street " +street+ "with postalcode "+postalcode);


   }
}