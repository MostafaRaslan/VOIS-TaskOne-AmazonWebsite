    package org.example;
    import AmazonExcelSheet.AmazonExcelUtils;
    import AmazonTestPOM.AmazonTestMainPage;
    import io.cucumber.java.en.*;
    import org.openqa.selenium.MutableCapabilities;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;

    import java.time.Duration;
    import java.util.HashMap;

    public class AmazonTestScenarios {
        WebDriver driver = new FirefoxDriver();
        AmazonTestMainPage AmazonMainPage = new AmazonTestMainPage(driver);

        @Given("User On Amazon Website")
        public void User_On_Amazon_Website() {
        }

        @When("open Amazon homepage and Type Car Accessories")
        public void open_amazon_homepage_and_type_car_accessories() {
            driver.get("https://www.amazon.com/");
            try{
                AmazonMainPage.Captcha();
            } catch (Exception e) {
            e.printStackTrace();}
            String projectpath = System.getProperty("user.dir");
            AmazonExcelUtils excel = new AmazonExcelUtils(projectpath + "/Excel//AmazonData.xlsx", "Sheet1");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            AmazonMainPage.SearchCarAccessories(String.valueOf(AmazonExcelUtils.getCellDataString(0, 0)));
        }
        @When("Select the first Item")
        public void select_the_first_item() {
            AmazonMainPage.SelectFirstElement();
        }
        @When("Add Item To Cart")
        public void add_item_to_cart() {
            AmazonMainPage.AddToCart();
        }
        @When("Go To Cart Page")
        public void check_item_is_added_successfully() {
            AmazonMainPage.GoToCartPage();
        }
        @Then("Check item is added successfully")
        public void Check_item_is_added_successfully(){
            AmazonMainPage.MakeCartCheck();
        }
        @And("Close Page")
        public void Close_Page(){
            driver.quit();
        }
        @Given("User Is On Amazon Website")
        public void User_Is_on_amazon_website() {

        }
        @When("open amazon Todays Deals page")
        public void open_amazon_Todays_Deals_page() {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            MutableCapabilities capabilities = new MutableCapabilities();
            HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
            browserstackOptions.put("resolution", "1024x768");
            driver.get("https://www.amazon.com/");
            try{
                AmazonMainPage.Captcha();
            } catch (Exception e) {
                e.printStackTrace();}
        }
        @When("Click On Deals Page")
        public void Click_On_Deals_Page(){
            AmazonMainPage.DeletePopUp();
            AmazonMainPage.ClickOnTodaysDeal();
        }

        @When("Select The Required Categories")
        public void select_the_required_categories() {
            AmazonMainPage.SelectGrocery();
            AmazonMainPage.SelectHeadphone();
        }
        @When("Select The Required Discount Category")
        public void select_the_required_discount_category() {
            AmazonMainPage.SelectDiscount();
        }
        @When("Go to the fourth page and Select the required item")
        public void go_to_the_fourth_page_and_select_the_required_item() {
            AmazonMainPage.LastPage();
            AmazonMainPage.SelectAnyItem();
        }
        @When("Add Second Item to the Cart")
        public void Add_Second_Item_to_the_Cart()
        {
            AmazonMainPage.AddSecondItemToTheCart();
        }
        @And("Close Browser")
        public void close_browser() {
            driver.close();
        }
    }
