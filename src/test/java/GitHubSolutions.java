import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSolutions {

    @Test
    void SearchSoftAssertions () {

        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

        open("https://github.com/");
        $("li")
                .sibling(0)
                .hover();
        $("a[href='/enterprise']")
                .click();
        $("#hero-section-brand-heading")
                .shouldHave(text("The AI-powered\n" +
                "developer platform."));
    }
}

