package UI.Wrappers;

import lombok.Data;

import static com.codeborne.selenide.Selenide.$x;

@Data
public class InputTestCase {

    String label;

    public InputTestCase(String label) {
        this.label = label;
    }

    public void write(String text) {
        $x(String.format("//div/descendant::label[contains(text(), '%s')]/following::input", label)).sendKeys(text);
    }
}
