public class Organization implements Cloneable {
    private String organizationCode;
    private String organizationName;
    private String organizationAddress;

    // Constructor
    public Organization(String organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    // Getters and Setters
    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress;
    }

    // Method to print object details
    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    // Overriding clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Organization org1 = new Organization("001", "ABC Corp", "123 Main St");
        
        try {
            // Cloning org1
            Organization org2 = (Organization) org1.clone();

            // Modifying org2 details
            org2.setOrganizationCode("002");
            org2.setOrganizationName("XYZ Corp");
            org2.setOrganizationAddress("456 Elm St");

            // Printing details of both objects
            System.out.println("Details of org1:");
            org1.printDetails();
            System.out.println("\nDetails of org2:");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
