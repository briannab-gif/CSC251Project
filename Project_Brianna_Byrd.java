import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOExeception;

public class Project_ Brianna_Byrd {
   public static void main(String[] args) {
      try {
         // Open the policy information text file
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
         
         // ArrayList to store Policy objects
         ArrayList<Policy> policyList = new ArrayList<>();
         
         // Variables to keep track of smokers and non-smokers
         int smokerCount = 0;
         int nonSmokerount = 0;
         
         // Read file until the end
         while (inputFile.hasNext()) {
            String policyNumber = inputFile.nextLine();
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            
            int age = inputFile.nextInt();
            inputFile.nextLine(); // Clear newline
            
            String smokingStatus = inputFile.nextLine();
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();
            
            if (inputFile.hasNextLine()) {
               inputFile.nextLine(); // Clear trailing newline/blank space  
            }
            if (inputFile.hasNextLine()) {
               inputFile.nextLine(); // Consume the blank spacer line between policies
            }
            
            // 1. Create the PolicyHolder object first
            PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            
            // 2. Create the Policy object passing thr holder inside it
            Policy policy = new Policy(policyNumber, providerName, holder);
            
            // 3. Add to our array list
            policyList.add(policy);
            
            // Track smoker counts
            if (smokingStatus.equalsIgnoreCase("smoker")) {
               smokerCount++;
            } else {
               nonSmokerCount++;
            }
         }
         inputFile.close();
         
         // Print each policy using the new toString() method
         for (Policy policy : policyList) {
            System.out.println(policy);
            System.out.println(); // Blank line between printed policies
         }
         
         // Print out the required Project 2 & 3 summary counts at the bottom
         System.out.println("There are " + Policy.getPolicyCount() + " Policy objects created.");
         System.out.println("The number of smokers is: " + smokerCount);
         System.out.println("The number of non-smokers is: " + nonSmokerCount);
      
      } catch (IOException e) {
         System.out.println("Error: File 'PolicyInformation.txt' not found!");
      }
   } 
}
         
         
         
              
              
           
         
         
       
            
           
                

