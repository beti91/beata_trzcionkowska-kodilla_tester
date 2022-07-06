package numberchecker;

import io.cucumber.java8.En;
import numberChecker.NumberChecker;
import org.junit.Assert;

class ItIsNumbers implements En {

    private int number;
    private String answer;

    public void itIsNumbers() {
        Given("Numbers could by divisible by 3", () -> {
            this.number = 3;
        });
        Given("Numbers could by divisible by 5", () -> {
            this.number = 5;
        });

        Given("Numbers could by divisible by 3 and 5", () -> {
            for (int i : new int[]{3, 5}) {
                this.number = i;
            }
        });

        When("I ask what is the number", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfNumber(this.number);
        });
Then("I should said {string}", (String string) -> {
    Assert.assertEquals(string, this.answer);
});
        }
    }

