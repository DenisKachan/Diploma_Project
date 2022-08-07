package UI.Wrappers;

import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class DropdownTestCase {

    String label;

    public DropdownTestCase(String label) {
        this.label = label;
    }

    public void select(String option) {
        $x(String.format("//div/descendant::label[contains(text(), '%s')]", label)).click();
        $x(String.format("//div[text()='%s']", option)).click();
    }
}
