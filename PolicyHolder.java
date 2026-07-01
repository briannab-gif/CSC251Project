public class Policy {
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder; // Handles collaboration (Policy HAS A PolicyHolder)
   
   // Static field to track the number of Policy objects created
   private static int policyCount = 0;
   
   // Default Constructor 
   public Policy() {
      this.policyNumber = "";
      this.providerName = "";
      this.policyHolder = new PolicyHolder();
      policyCount++; // FIXED: Counter increments in default constructor
   }
   
   // Argument Constructor 
   public Policy(String policyNumber, String providerName; PolicyHolder policyHolder) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      // FIXED: Avoids "Security Hole" data leaks by creating a deep copy
      this.policyHolder = new PolicyHolder(PolicyHolder);
      policyCount++; // FIXED: Counter increments in argument constructor
   }
   
   // Getters and Setters
   public String getPolicyNumber() { return policyNumber; }
   public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
   
   public String getProviderName() { return providerName; }
   public void setProviderName(String providerName) { this.providerName = providerName; }
   
   // FIXED: Avoids "Security Hole" data leaks by returning a deep copy
   public PolicyHolder getPolicyHolder() { return new PolicyHolder(this.policyHolder); }
   public void setPolicyHolder(PolicyHolder policyHolder) { this.policyHolder = new PolicyHolder(policyHolder); }
   
   // Static getter to return the total policy count
   public static int getPolicyCount() { return policyCount; }
   
   // Insurance Price Calculation Method
   public double getInsurancePrice() {
      double basePrice = 600.0;
      double additionalFees = 0.0;
      
      if (policyHolder.getAge() > 50) {
         additionalFees += 75.0;
      }
      
      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
         additionalFees += 100.0;
      }
      
      return basePrice + additionalFees;
   } 
   
   // toString Method required for Project 3
   @Override
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
             "Provider Name: " + providerName + "\n" +
             policyHolder.toString() + "\n" + // Calls the PolicyHolder's toString automatically
             String.format("Insurance Price: $%.2f", getInsurancePrice());
   }
}
   