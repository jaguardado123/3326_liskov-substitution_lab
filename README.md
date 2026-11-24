# Liskov-Substitution Lab

### Finance App 

A Finance App has been created for you. This finance app display the information of two financial institutions, Bank of America and Rally Credit Union. However, the app is structured in a way that violates the Liskov Substitution principle.

**Violation:**

The `CreditUnion` class is inheriting the `FinanceInstitute` class since it needs most of its methods and subsequently inherits the method `stakeholders()`. This presents a problem because **Credit Unions don't have stakeholders**, thus `CreditUnion` needs to *override* `stakeholders()` to throw an exception that signals developers that this method shouldn't be called from any `CreditUnion` object. This violates **Liskov-Substitution** because it breaks the expected behavior of `FinanceInstitute`.

**Your task:**

- Refactor the code so that the Liskov-Substitution isn't violated. This means `CreditUnion` shouldn't inherit `stakeholders()`.
- Remember, `CreditUnion` should still inherit `FinanceInstitute` since it needs majority of its methods.

Make sure your solution still adheres to the **Single-Responsibility** and **Open-Closed** principles. 