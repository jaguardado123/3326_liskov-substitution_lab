package finance;
import java.lang.UnsupportedOperationException;

public class CreditUnion extends FinanceInstitute {
    private String name;

    public CreditUnion(String name) {
        this.name = name;
    }

    // Overriding stakeholders to throw an exception, because Credit Unions don't have stakeholders.
    // This of course violates the Liskov-Substituiton principle.
    @Override
    public void stakeholders() {
        throw new UnsupportedOperationException("This institute has no stakeholders!");
    }

    @Override
    public void about() {
        System.out.println("About " + this.name + ",");
        super.services();
        super.insured();
    }
}