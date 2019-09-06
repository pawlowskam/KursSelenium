package com.kurs.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingSearchTest {

            private WebDriver driver;

        @Before
        public void setUp() {


            System.setProperty("webdriver.gecko.driver",

                    "src/test/resources/geckodriver");


            // Uruchom nowy egzemplarz przeglądarki Firefox
            driver = new FirefoxDriver();

            // Zmaksymalizuj okno przeglądarki
            driver.manage().window().maximize();
            // Przejdź do Bing
            driver.get("http://www.bing.com");
        }
        @Test
        public void testGoogleSearch() {
            // Znajdź element wprowadzania tekstu na podstawie jego nazwy
            WebElement element = driver.findElement(By.name("q"));
            // Wyczyść teskst zapisany w elemencie
            element.clear();

            // Wpisz informacje do wyszukania
            element.sendKeys("Mistrzostwa Świata w piłce nożnej 2018");

            // Prześlij formularz
            element.submit();
        }
        @After
        public void tearDown() throws Exception {
            // Zamknij przeglądarkę
            driver.quit();
        }
    }


