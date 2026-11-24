package finance;

// Contains information almost all financial institutions have.

public abstract class FinanceInstitute {

    public void services() {
        System.out.println("Services:");
        System.out.println("- Savings Account");
        System.out.println("- Checking Account");
        System.out.println("- Loans");
    }

    public void insured() {
        System.out.println("Fedarally insured up to $250,000");
    }

    public void stakeholders() {
        System.out.println("This institute has stakeholders.");
    }

    public abstract void about();
}