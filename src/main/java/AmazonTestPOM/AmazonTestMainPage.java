package AmazonTestPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;

public class AmazonTestMainPage {
    WebDriver driver = null;
    //Identify The SearchBox
    By SearchBox = By.xpath("//*[@id=\"twotabsearchtextbox\"]");

    By Captcha1 = By.xpath("/html/body/div/div[3]/a[1]");
    //Identify The First Element to be bought
    By FirstElement = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div");
    //Identify the add to cart button
    By Cart = By.id("add-to-cart-button");
    // Identify the Cart Button
    By GoToCart = By.xpath("//*[@id=\"sw-gtc\"]/span/a");
    //Identify the variable of checking the cart
    By CartCheck = By.xpath(("//*[@id=\"activeCartViewForm\"]"));

    By TodayDealPage = By.partialLinkText(("Today's Deals"));
    By Popupdelete = By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/div/div/div[3]/span[1]/span/input");
    By Grocery = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/span");
    By Headphones = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[20]/label/span");
    By Discount = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span");

    By NewListPage = By.xpath("/html/body/div[1]/div[19]/div/div/div/div[3]/div/ul/li[5]");

    By AnyItem = By.xpath("/html/body/div[1]/div[19]/div/div/div/div[2]/div[3]/div/div[58]/div/div/a/div/div");

    By SecondCart = By.id("add-to-cart-button");

    public AmazonTestMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Captcha(){
        driver.findElement(Captcha1).click();
    }

    public void SearchCarAccessories(String text) {
        driver.findElement(SearchBox).sendKeys("Car Accessories" + ENTER);
    }

    public void SelectFirstElement() {
        driver.findElement(FirstElement).click();
    }

    public void AddToCart() {
        driver.findElement(Cart).click();
    }

    public void GoToCartPage() {
        driver.findElement(GoToCart).click();
    }

    public void MakeCartCheck() {
        boolean isDisplayed;
        {
            driver.findElement(CartCheck).isEnabled();
            System.out.println("The Element is added successfully to the Cart");
        }
    }
       public void ClickOnTodaysDeal(){
        driver.findElement(TodayDealPage).click();
    }
    public void DeletePopUp(){
        driver.findElement(Popupdelete).click();
    }

    public void SelectGrocery() {
        driver.findElement(Grocery).click();
    }

    public void SelectHeadphone() {
        driver.findElement(Headphones).click();
    }

    public void SelectDiscount() {
        driver.findElement(Discount).click();
    }

    public void LastPage() {
        driver.findElement(NewListPage).click();
    }

    public void SelectAnyItem() {
        driver.findElement(AnyItem).click();
    }

    public void AddSecondItemToTheCart() {
        driver.findElement(SecondCart);
    }

}