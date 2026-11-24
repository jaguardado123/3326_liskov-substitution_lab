package finance;

// This is our main app.

public class FinanceApp {

    public FinanceApp() {
        System.out.println("Welcome to my Finance App!");
        System.out.println("Here's some information about our institutions:");

        FinanceInstitute [] institutes = {
            new Bank("Bank of America"),
            new CreditUnion("Rally Credit Union")
        };

        for(int index = 0; index < institutes.length; index++) {
            institutes[index].about();
        }

        // You can comment this line out after refactoring.
        institutes[1].stakeholders(); // This violates Liskov-Substitution. Credit Union is expected to have stakeholders()!
    }
}