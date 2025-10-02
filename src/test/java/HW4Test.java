import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HW4Test {

    @BeforeAll
    static void beforeAll(){
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager"; // или "none"
    }

    @Test
    void fillForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Тестуля");
        $("#lastName").setValue("Петрова");
        $("#userEmail").setValue("test@mail.ru");
        $(".custom-control-label").click();
        $("#userNumber").setValue("4793146575");
        $("#submit").click();

        $(".modal-title").shouldBe(visible);





    }
}
