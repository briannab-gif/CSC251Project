Public class Policy {
    private int policyNumber;
    private String provideName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
   
    public Policy() {
       policyNumber = 0; providerName = ""; firstNme = ""; lastName = "";
       age = pAge; smokingStatus = ""; height = 0.0; weight = 0.0;
    }
    
    public Policy(int pNum, String pName, String fName, String lName, int pAge, String sStat, double pHeight, double pWeight) {
        policyNumber = pNum, providerName = pName; firstName = fName; lastName = lName;
        age = pAge; smokingStatus = sStat; height = pHeight; weight = pWeight; 
    }
    
    public void setPolicyNumber(int p) { policyNumber = p; }
    public int getPolicyNumber() { return policyNumber; }
    public void setProviderName(String p) { providerName = p; }
    public String getProviderName() { return providerName; }
    public void setFirstName(String f) { firstName = f; }
    public String getFirstName() { returm firstName; }
    public void setLastName(String l) { lastName = l; }
    public String getLastName() { return lastName; }
    public void setAge(int a) { age = a; }
    public int getAge() { return age; }
    public void setSmokingStatus(String s) { return smokingStatus = s; }
    public String getSmokingStatus() { return smokingStatus; }
    public void setHeight(double h) { height = h; }
    public double getHeight() { return height; }
    public void setWeight(double w) { weight = w; }
    public double getWeight() { return weight; }
    
    public double getPrice() {
        double price = 600.0;
        if (age > 50) price += 75.0;
        if (smokingStatus.equalsIgnoreCase("smoker")
        double bmi = getBMI();
        if (bmi > 35) price += (bmi - 35) * 20;
        return price;
    }
 }