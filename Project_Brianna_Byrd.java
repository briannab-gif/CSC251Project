import java.util.Scanner; 

public class Project_Brianna_Byrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Policy Number: ");
        int pNum = sc.nextInt(); sc.nextLine();
        
        System.out.print("Provider Name: ");
        String pName = sc.nextLine();
        
        System.out.print("Age: ");
        int age = sc.nextInt(); sc.nextLine();
        
        System.out.print("Height: ");
        double weight = sc.nextDouble();
        
        Policy p = new Policy(pNum, pName, fName, Lname, age, sStat, height, weigh);
        
        System.out.println("\nPolicy Number: " + p.getPolicyNumber());
        System.out.println("Provider Name: " + p.getProviderName());
        System.out.println("First Name : "+ p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Smoking Status: " + p.getSmokingStatus());
        System.out.println("Height: " + p.getHeight());
        System.out.println("Weight: " + p.getWeight());
        
        sc.close();
    }
}