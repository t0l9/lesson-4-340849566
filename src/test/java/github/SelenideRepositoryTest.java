package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class SelenideRepositoryTest {

    @Test
    void secusessTestGithub(){
        open("https://github.com/");
        $("[data-target='qbsearch-input.inputButton']").click();
        $("#query-builder-test").setValue("Selenide").pressEnter();


        $$("[data-testid='results-list'] div").first().$("a").click();

        $("#repository-container-header")
                .$("a[data-pjax='#repo-content-pjax-container']")
                .shouldHave(text("selenide"));


        sleep(5000);

        Assertions.assertTrue(3>2);



    }
}
