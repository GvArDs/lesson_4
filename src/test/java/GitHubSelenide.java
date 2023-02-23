import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSelenide {

    @Test
    void jUnit5ExampleSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("nav.js-repo-nav").$("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("div.wiki-rightbar").$$("div ul").first().shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $("div.markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}