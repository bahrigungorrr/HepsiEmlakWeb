package com.hepsiemlak;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;

public class HepsiEmlakCase extends BasePage {

    public void HepsiEmlakSatilik() throws InterruptedException {
        BasicConfigurator.configure();
        webElementiBul("css", "img[src='/_nuxt/img/satilik.c924a0d.svg']");
        webelementiBekle(1);
        //izmir
        log.info("İl seçiliyor...");
        webElementiBul("css", "div[class='filter-select grid-100']");
        webElementiBul("css", "li[class='he-select__list-item']:nth-of-type(3)");
        webelementiBekle(1);
        //bornova
        log.info("İlçe seçiliyor...");
        webElementiBul("css", "section[class='filter-item-wrap loc locationCountySec']");
        webelementiBekle(1);
        webElementiBuluncaTikla("li[class='he-multiselect__list-item']:nth-of-type(7)");
        webElementiBul("css", "li[class='he-multiselect__list-item']:nth-of-type(7)");
        webelementiBekle(1);
        webElementiBul("css", "span[class='he-select-base__caret he-select-base__caret--dropdown-active']");
        //İşyeri seç
        log.info("İşyeri seçiliyor.");
        webElementiBul("css", "section[class='listing-filter']>div>section:nth-of-type(2) li:nth-of-type(2)");
        webelementiBekle(1);
        //Fiyat seç
        log.info("Fiyatlar giriliyor...");
        webElementineGönder("css",
                "section[class='listing-filter']>div>section:nth-of-type(4) input[class='floating-input priceMin']"
                , "100000");
        webElementineGönder("css"
                , "section[class='listing-filter']>div>section:nth-of-type(4) input[class='floating-input priceMax']"
                , "2000000");

        //BinaYaşı seç
        log.info("Bina yaşı seçiliyor...");
        webElementiBuluncaTikla("section[class='listing-filter']>div>section:nth-of-type(7) div[class='custom-select']");
        webelementiBekle(1);
        webElementiBul("css", "section[class='listing-filter']>div>section:nth-of-type(7) div[class='custom-select']");
        webelementiBekle(1);
        webElementiBul("css", "ul[class='dropdown-list']>li:nth-of-type(1)");
        webElementiBul("css", "ul[class='dropdown-list']>li:nth-of-type(2)");
        webElementiBul("css", "ul[class='dropdown-list']>li:nth-of-type(3)");
        webelementiBekle(2);
        webElementiBul("css",
                "span[class='he-icon custom-select__chevron he-icon__dib he-icon__24 he-icon__red he-icon--expand_more rotated']");

        //Ara butonuna bas
        log.info("Sonuçlar gösteriliyor.");
        webElementiBul("css", "a[class='btn btn-red btn-large']");
        webelementiBekle(2);
        //Kontroller
        log.info("Filtreler Kontrol ediliyor...");
        webElementControl("İzmir", webDriver.findElement(By.
                cssSelector("div[class='applied-filters__inner'] li:nth-of-type(1)>span[class='applied-filters-list-item last--item']"))
                .getText());

        webElementControl("Bornova", webDriver.findElement(By.
                cssSelector("div[class='applied-filters__inner'] li:nth-of-type(2)>span[class='applied-filters-list-item last--item']"))
                .getText());

        webElementControl("İşyeri", webDriver.findElement(By.
                cssSelector("div[class='applied-filters__inner'] li:nth-of-type(3)>span[class='applied-filters-list-item last--item']"))
                .getText());

        webElementControl("100.000 TL - 2.000.000 TL", webDriver.findElement(By.
                cssSelector("div[class='applied-filters__inner'] li:nth-of-type(4)>span[class='applied-filters-list-item last--item']"))
                .getText());

        webElementControl("Sıfır Bina", webDriver.findElement(By.
                cssSelector("div[class='applied-filters__inner'] li:nth-of-type(5)>span[class='applied-filters-list-item']"))
                .getText());

        webElementControl("1-5", webDriver.findElement(By.
                cssSelector("span[class='applied-filters-list-item']:nth-of-type(1)"))
                .getText());
        webElementControl("6-10", webDriver.findElement(By.
                cssSelector("ul[class='applied-filters-list']>span:nth-of-type(2)"))
                .getText());

        log.info("Satılık testi bitti.");
        webelementiBekle(1);

    }

    public void HepsiEmlakKiralik() throws InterruptedException {
        BasicConfigurator.configure();
        log.info("Kiralık testi başlıyor...");
        //kiralık
        webElementiBul("css", "img[src='/_nuxt/img/kiralik.1359811.svg']");
        webelementiBekle(1);
        //il seç
        log.info("İl seçiliyor...");
        webElementiBul("css", "div[class='he-control-base he-select js-city-filter']");
        webelementiBekle(1);
        webElementiBul("css", "ul[class='he-select__list']>li:nth-of-type(2)");
        webelementiBekle(1);
        //ilçe seç
        log.info("İlçe seçiliyor...");
        webElementiBul("css", "section[class='filter-item-wrap loc locationCountySec']");
        webelementiBekle(1);
        webElementiBuluncaTikla("ul[class='he-multiselect__list']>li:nth-of-type(7)");
        webElementiBul("css", "ul[class='he-multiselect__list']>li:nth-of-type(7)");
        webelementiBekle(1);

        //Oda salon sayısı seç
        log.info("Oda salon sayısı seçiliyor...");
        webElementiBuluncaTikla("section[class='listing-filter']>div>section:nth-of-type(6)");
        webElementiBul("css", "section[class='listing-filter']>div>section:nth-of-type(6)");
        webElementiBul("css", "ul[class='dropdown-list']>li:nth-of-type(3)");
        webelementiBekle(1);
        //site seç
        log.info("Site seçiliyor...");
        webElementiBuluncaTikla("section[class='filter-switch withinSiteSec']");
        webElementiBul("css", "section[class='filter-switch withinSiteSec']");
        webelementiBekle(1);
        //Araya bas
        log.info("Aramaya basılıyor...");
        webElementiBul("css", "a[class='btn btn-red btn-large']");
        webelementiBekle(2);
        //İlan seç
        log.info("3. ilan seçiliyor.");
        webElementiBul("css", "div[class='listView']>div:nth-of-type(4)>div");
        webelementiBekle(2);
        //Telefon numarasını göster
        log.info("Telefon numarası gösteriliyor.");
        webElementiBul("css", "button[class='owner-phone-numbers-button btn btn-red btn-large']");
        webelementiBekle(1);
        //Telefon gerçek mi karşılaştır
        log.info("Telefonlar kontrol ediliyor...");
        isValidPhoneNumb("+905337141414");
        log.info("Telefon numarası sitedeki ile aynı.");
        isValidPhoneNumb("+903122878786");
        isValidPhoneNumb("+905052319151");
        webElementControl("tel:+905052319151", webDriver.findElement(By.
                xpath("//div[1]/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]"))
                .getAttribute("href"));
        log.info("Kiralık testi bitti.");
        webelementiBekle(1);

    }
}