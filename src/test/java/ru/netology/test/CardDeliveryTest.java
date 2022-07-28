package ru.netology.test;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryTest {
    @Test
    void test() {
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").setValue("Уфа");
        $x("//input[@placeholder='Дата встречи']").setValue("30.07.2022");
        $x("//input[@name='name']").setValue("Иванов Иван");
        $x("//input[@name='phone']").setValue("+78003000600");
        $("[data-test-id='agreement']").click();
        $x("//span[@class='button__text']").click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(visible, Duration.ofSeconds(15));
    }

}
