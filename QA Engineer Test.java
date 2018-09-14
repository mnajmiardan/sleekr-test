package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://accounting.sleekr.co/login");
    driver.findElement(By.id("e2e_email")).click();
    driver.findElement(By.id("e2e_email")).clear();
    driver.findElement(By.id("e2e_email")).sendKeys("slka.tester2018@gmail.com");
    driver.findElement(By.id("e2e_password")).click();
    driver.findElement(By.id("e2e_password")).click();
    driver.findElement(By.id("e2e_password")).clear();
    driver.findElement(By.id("e2e_password")).sendKeys("sleekr2018");
    driver.findElement(By.id("submitBtn")).click();
    driver.findElement(By.linkText("PT. Test QA")).click();
    driver.findElement(By.id("transactionButton-btnInnerEl")).click();
    driver.findElement(By.id("menuitem-1016-textEl")).click();
    driver.findElement(By.id("button-1463")).click();
    driver.findElement(By.id("ContactCombo-1546-trigger-picker")).click();
    driver.findElement(By.id("contact_newitem")).click();
    driver.findElement(By.id("textfield-1693-inputEl")).click();
    driver.findElement(By.id("textfield-1693-inputEl")).clear();
    driver.findElement(By.id("textfield-1693-inputEl")).sendKeys("Muhammad Najmi Ardan");
    driver.findElement(By.id("button-1742-btnInnerEl")).click();
    driver.findElement(By.id("datefield-1547-trigger-picker")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='S'])[3]/following::div[21]")).click();
    driver.findElement(By.id("datefield-1548-trigger-picker")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='S'])[6]/following::div[36]")).click();
    driver.findElement(By.id("button-1562-btnInnerEl")).click();
    driver.findElement(By.id("textfield-1550-inputEl")).click();
    driver.findElement(By.id("textfield-1550-inputEl")).clear();
    driver.findElement(By.id("textfield-1550-inputEl")).sendKeys("Glints");
    driver.findElement(By.id("ContactCombo-1552-trigger-picker")).click();
    driver.findElement(By.id("ContactCombo-1552-inputEl")).clear();
    driver.findElement(By.id("ContactCombo-1552-inputEl")).sendKeys("EMP001 - Aragorn");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cell value has been edited'])[13]/following::div[6]")).click();
    driver.findElement(By.id("ItemCombo-1518-trigger-picker")).click();
    driver.findElement(By.id("ext-1526")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='PPN 10%'])[1]/following::div[7]")).click();
    driver.findElement(By.id("ItemCombo-1518-trigger-picker")).click();
    driver.findElement(By.id("ext-1528")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='PPN 10%'])[2]/following::div[7]")).click();
    driver.findElement(By.id("ItemCombo-1518-trigger-picker")).click();
    driver.findElement(By.id("ext-1530")).click();
    driver.findElement(By.id("button-1573-btnInnerEl")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='PPN 10%'])[3]/following::div[7]")).click();
    driver.findElement(By.id("ItemCombo-1518-trigger-picker")).click();
    driver.findElement(By.id("ext-1532")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FSI428CC17JKKB-Bahan Kain Kemeja Pria'])[1]/following::div[2]")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).clear();
    driver.findElement(By.id("numberfield-1775-inputEl")).sendKeys("2");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FSI428CC17JKKS-Bahan Kain Kemeja Wanita'])[1]/following::div[2]")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).clear();
    driver.findElement(By.id("numberfield-1775-inputEl")).sendKeys("3");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BLC-0000004-Balpoint Label CP'])[1]/following::div[2]")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).clear();
    driver.findElement(By.id("numberfield-1775-inputEl")).sendKeys("4");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BAL-0000002-Buku Agenda Label CP'])[1]/following::div[2]")).click();
    driver.findElement(By.id("numberfield-1775-inputEl")).clear();
    driver.findElement(By.id("numberfield-1775-inputEl")).sendKeys("5");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FSI428CC17JKKB-Bahan Kain Kemeja Pria'])[1]/following::td[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FSI428CC17JKKB-Bahan Kain Kemeja Pria'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FSI428CC17JKKB-Bahan Kain Kemeja Pria'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FSI428CC17JKKS-Bahan Kain Kemeja Wanita'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BLC-0000004-Balpoint Label CP'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BAL-0000002-Buku Agenda Label CP'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meter'])[1]/following::div[1]")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).clear();
    driver.findElement(By.id("numberfield-1777-inputEl")).sendKeys("55500");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Meter'])[2]/following::div[1]")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).clear();
    driver.findElement(By.id("numberfield-1777-inputEl")).sendKeys("66000");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pcs'])[1]/following::div[1]")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).clear();
    driver.findElement(By.id("numberfield-1777-inputEl")).sendKeys("9500");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pcs'])[2]/following::div[1]")).click();
    driver.findElement(By.id("numberfield-1777-inputEl")).clear();
    driver.findElement(By.id("numberfield-1777-inputEl")).sendKeys("28000");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pcs'])[2]/following::div[3]")).click();
    driver.findElement(By.id("TaxRateCombo-1521-trigger-picker")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pemuatan...'])[6]/following::a[1]")).click();
    driver.findElement(By.id("textfield-1784-inputEl")).click();
    driver.findElement(By.id("textfield-1784-inputEl")).clear();
    driver.findElement(By.id("textfield-1784-inputEl")).sendKeys("test");
    driver.findElement(By.id("checkbox-1785-inputEl")).click();
    driver.findElement(By.id("checkbox-1785-inputEl")).click();
    driver.findElement(By.id("checkbox-1785-inputEl")).click();
    driver.findElement(By.id("numberfield-1787-inputEl")).clear();
    driver.findElement(By.id("numberfield-1787-inputEl")).sendKeys("20");
    driver.findElement(By.id("AccountCombo-1788-inputEl")).click();
    driver.findElement(By.id("AccountCombo-1788-trigger-picker")).click();
    driver.findElement(By.id("ext-1586")).click();
    driver.findElement(By.id("AccountCombo-1789-trigger-picker")).click();
    driver.findElement(By.id("ext-1589")).click();
    driver.findElement(By.id("button-1800")).click();
    driver.findElement(By.id("button-1602-btnWrap")).click();
    driver.findElement(By.id("menuitem-1605-textEl")).click();
    // ERROR: Caught exception [unknown command []]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
