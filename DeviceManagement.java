import java.util.Scanner;
public class DeviceManagement {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Phone[] phones = new Phone[4];
      for( int i = 0; i < 4; i++){
          int id = sc.nextInt();
          sc.nextLine();
          String os = sc.nextLine(); 
          String brand = sc.nextLine();
          int price = sc.nextInt();
          phones[i] = new Phone(id, os, brand,price);
      }
      sc.nextLine();
      String searchBrand = sc.nextLine();
      String searchOS = sc.nextLine();
      sc.close();

      int priceResult = findPriceForGivenBrand(phones,searchBrand);
      if(priceResult!= 0){
          System.out.println(priceResult);
      }
      else{
          System.out.println("The given Brand is not available");
      }

      Phone phoneResult = getPhoneIdBasedOnOs(searchOS,phones);
      if(phoneResult!=null){
          System.out.println(phoneResult.phoneid);
      }
      else{
          System.out.println("No phones are available with specified os and price range");
      }
    }
  
    public static int findPriceForGivenBrand(Phone[] a,String brand){
           int sum = 0;
           for(int i = 0; i < a.length; i++){
               if(brand.equalsIgnoreCase(a[i].getBrand()))
                sum +=a[i].getPrice();
           }
           return sum;
    }

    public static Phone getPhoneIdBasedOnOs(String os,Phone[] a){

        for(int i = 0; i < a.length ; i++){
            if(os.equalsIgnoreCase(a[i].getOs()) && a[i].getPrice() >= 50000)
            return a[i];
        }
        return null;
    }


}

class Phone{
   int phoneid;
   String os;
   String brand;
   int  price;

   Phone(int phoneid,String os,String brand,int price){
       this.phoneid = phoneid;
       this.os = os;
       this.brand = brand;
       this.price = price;
   }
   String getBrand(){
   return brand;
   }

   String getOs(){
       return os;
   }

   int getPrice(){
       return price;
   }


}



//input
// 111
// iOS
// Apple
// 30000
// 222
// android
// Samsung
// 50000
// 333
// Symbian
// HTC
// 12000
// 444
// Paranoid
// HTC
// 89000
// Blackberry
// aNdRoid

//output
// The given Brand is not available
// 222


























    

