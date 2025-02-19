package com.nttdata.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/shop.feature",
        glue = "com.nttdata.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@RealizarCompraExitosa",
        plugin = {
                "pretty",
                "json:target/serenity-reports/web_applications/login/cucumber.json",
                "html:target/serenity-reports/web_applications/login/serenity-html-report.html",
                "rerun:target/serenity-reports/web_applications/login/rerun.txt"
        }
)
public class RunnerAgregarProdCompra {


}
