import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsGitHubSelenide {

    @Test
    void jUnit5Example() {
        open("https://github.com/selenide/selenide");
        $("nav.js-repo-nav").$("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("div.wiki-rightbar").$$("div ul").first().shouldHave(text("SoftAssertions"));
        $x("//a[text()='SoftAssertions']").click();
        $("div.markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}