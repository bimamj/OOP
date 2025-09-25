public class TravelOperator {
    private String operatorName;
    private String classTier;

    public TravelOperator (String operatorName, String classTier) {
        this.operatorName = operatorName;
        this.classTier = classTier;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorName() {
        return operatorName;
    }


    public void setClassTier(String classTier) {
        this.classTier = classTier;
    }    

    public String setClassTier() {
        return classTier;
    }


    public void displayInfo() {
        System.out.println("Operator   : " + operatorName);
        System.out.println("Class   : " + classTier);
    }
}
