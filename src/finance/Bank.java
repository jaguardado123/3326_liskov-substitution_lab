package finance;

public class Bank extends FinanceInstitute {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    // Overrides the stakeholders() method to be mores specifice to most Banks in the US.
    @Override
    public void stakeholders() {
        System.out.println("This institute has multiple internal & external stakeholders.");
    }

    @Override
    public void about() {
        System.out.println("About " + this.name + ",");
        super.services();
        super.insured();
        this.stakeholders();
    }
}