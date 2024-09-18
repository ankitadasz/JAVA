import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,sec,branch;
        int roll;
        float weight;
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the section:");
        sec=sc.nextLine();
        System.out.println("Enter the branch:");
        branch=sc.nextLine();
        System.out.println("Enter the rollno:");
        roll=sc.nextInt();
        System.out.println("Enter the weight:");
        weight=sc.nextFloat();


        System.out.println("Name:"+name);
      
        System.out.println("Section:"+sec);
       
        System.out.println("Branch:"+branch);
     
        System.out.println("Rollno:"+roll);
         System.out.println("Weight:"+weight);
        
    }
    
}
