import java.util.Arrays;
import java.util.Scanner;
public class Associate_for_given_technology {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Associate[] a=new Associate[2];
        for(int i=0;i<a.length;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String tech = sc.nextLine();
            int yoe= sc.nextInt();
            a[i]= new Associate(id,name,tech,yoe);
        }
        // sc.nextLine();
        // String getTech = sc.nextLine();

        String getTech = sc.next();
        sc.close();

        Associate[] ans = associatesForGivenTechnology(a,getTech);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i].getId());
        }
        
    }


    public static Associate[] associatesForGivenTechnology(Associate[] a,String getTech){
       Associate[] b=new Associate[0];
       for(int i=0;i<a.length;i++){
         if(a[i].getTech().equalsIgnoreCase(getTech) && (a[i].getyoe()%5)==0){
             b=Arrays.copyOf(b,b.length+1);
             b[b.length-1]=a[i];
         }
       }
       return b;
    }
    
}

class Associate{
    int id;
    String name;
    String tech;
    int yoe;
    public Associate(int id,String name,String tech,int yoe){
        this.id=id;
        this.name=name;
        this.tech=tech;
        this.yoe=yoe;
    }
    public int getId(){
        return id;
    }
    public String getTech(){
    return tech;
    }
    public int getyoe(){
        return yoe;
    }
}
// 101
// Alex
// Java
// 15
// 102
// Albert
// Unix
// 20
//java-->ans

// 103
// Alferd101
// Testing
// 13
// 104
// Alfa
// Java
// 15
// 105
// Almas
// Java
// 29
// Java
