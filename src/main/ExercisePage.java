package main;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;


public class ExercisePage {

    WebDriver driver;

    public ExercisePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String page) {
        driver.get(page);
    }

    public String getPageTitleValue() {
        return driver.getTitle();
    }

    public void setTitle(String titleValue){
        WebElement slot1 = driver.findElement(By.id("answer1"));
        slot1.sendKeys(titleValue);
    }

    public String getNameValue(){
        WebElement name = driver.findElement(By.cssSelector("li:nth-child(2) b"));
        return name.getText();
    }

    public void setName(String nameValue) {
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys(nameValue);
    }

    public String getOccupationValue() {
        WebElement occupation = driver.findElement(By.cssSelector("li:nth-child(3) b"));
        return occupation.getText();
    }

    public void selectOccupation(String occupationValue) {
        WebElement occupationDropDown = driver.findElement(By.id("occupation"));
        Select dropDown = new Select(occupationDropDown);
        dropDown.selectByVisibleText(occupationValue);
    }

    public int countBlackBoxes() {
        int blackBoxesValue = driver.findElements(By.className("blackbox")).size();
        return blackBoxesValue;
    }

    public void setBlackBoxesNumber (int blackBoxesValue) {
        WebElement number = driver.findElement(By.id("answer4"));
        number.sendKeys(String.valueOf(blackBoxesValue));
    }

    public String getLinkValue() {
        WebElement linkValue = driver.findElement(By.cssSelector("li:nth-child(5) b"));
        return linkValue.getText();
    }

    public void clickLink (String linkValue) {
        WebElement link = driver.findElement(By.linkText(linkValue));
        link.click();
    }

    public String getRedBoxClassValue() {
        WebElement redBox = driver.findElement(By.id("redbox"));
        String redBoxClassValue = redBox.getAttribute("class");
        return redBoxClassValue;
    }

    public void setRedBoxClass(String classValue) {
        WebElement classSlot = driver.findElement(By.id("answer6"));
        classSlot.sendKeys(classValue);
    }

    public String getRadioButtonValue() {
        WebElement radioButtonValue = driver.findElement(By.cssSelector("li:nth-child(7) b"));
        return radioButtonValue.getText();
    }

    public void selectRadioButton (String radioButtonValue) {
        WebElement radio = driver.findElement(By.xpath("//input[@value='"+radioButtonValue+"']"));
        radio.click();
    }

    public String getRedBoxTextValue() {
        WebElement redBox = driver.findElement(By.id("redbox"));
        return redBox.getText();
    }

    public void setRedBoxText(String redBoxTextValue) {
        WebElement redBoxSlot = driver.findElement(By.id("answer8"));
        redBoxSlot.sendKeys(redBoxTextValue);
    }

    public String getTopBoxColorValue () {
        String backgroundColor = driver.findElement(By.xpath("//span[contains(text(),'BOX')][1]")).getAttribute("style");
        if (backgroundColor.contains("green")) {
            return "green";
        }else {
            return "orange";
        }
    }

    public void setTopBoxColor(String backgroundColorValue) {
        WebElement colorSpot = driver.findElement(By.id("answer9"));
        colorSpot.sendKeys(backgroundColorValue);
    }

    public boolean isIAmHere() {
        try {
            driver.findElement(By.id("IAmHere")).isDisplayed();
            return true;
        } catch(NoSuchElementException e) {
            return false;
        }
    }

    public void setIAmHere(boolean ishere) {
        WebElement isHere = driver.findElement(By.id("answer10"));
        String value;
        if (ishere)  {
            value = "YES";
        } else
            value = "NO";
        isHere.sendKeys(value);
    }

    public void setPurpleBox() {
        WebElement purpleBoxSlot = driver.findElement(By.id("answer11"));
        String value;
        if (driver.findElement(By.id("purplebox")).getAttribute("style").contains("none"))  {
            value = "NO";
        } else
            value = "YES";
        purpleBoxSlot.sendKeys(value);
    }

    private void clickAndWaitWaitLink() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.linkText("Wait")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Click After Wait")));
    }

    public void clickClickAfterWaitLink() {
        clickAndWaitWaitLink();
        driver.findElement(By.linkText("Click After Wait")).click();
    }

    public void clickOKonAlert() throws InterruptedException {
        driver.switchTo().alert().accept();
    }

    public void submitForm() {
        driver.findElement(By.id("submitbutton")).click();
    }


    public void checkResults() {
        driver.findElement(By.id("checkresults")).click();
    }

}
