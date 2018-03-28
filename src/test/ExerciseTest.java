package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.ExercisePage;


public class ExerciseTest {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void exercise() throws InterruptedException {
        //Initialize exercise page using Selenium PageFactor
        ExercisePage exercisePage = PageFactory.initElements(driver, ExercisePage.class);
        exercisePage.openPage("http://exercises.fdvs.com.ar/semisenior.html");
        //Solution step 1
        String pageTitle = exercisePage.getPageTitleValue();
        exercisePage.setTitle(pageTitle);
        //Solution step 2
        String name = exercisePage.getNameValue();
        exercisePage.setName(name);
        //Solution step 3
        String occupationValue = exercisePage.getOccupationValue();
        exercisePage.selectOccupation(occupationValue);
        //Solution step 4
        int blackBoxes = exercisePage.countBlackBoxes();
        exercisePage.setBlackBoxesNumber(blackBoxes);
        //Solution step 5
        String linkValue = exercisePage.getLinkValue();
        exercisePage.clickLink(linkValue);
        //Solution step 6
        String classValue = exercisePage.getRedBoxClassValue();
        exercisePage.setRedBoxClass(classValue);
        //Solution step 7
        String radioButtonValue = exercisePage.getRadioButtonValue();
        exercisePage.selectRadioButton(radioButtonValue);
        //Solution step 8
        String redBoxTextValue = exercisePage.getRedBoxTextValue();
        exercisePage.setRedBoxText(redBoxTextValue);
        //Solution step 9
        String backgroundColor = exercisePage.getTopBoxColorValue();
        exercisePage.setTopBoxColor(backgroundColor);
        //Solution step 10
        boolean isHereValue = exercisePage.isIAmHere();
        exercisePage.setIAmHere(isHereValue);
        //Solution step 11
        exercisePage.setPurpleBox();
        //Solution step 12
        exercisePage.clickClickAfterWaitLink();
        //Solution step 13
        exercisePage.clickOKonAlert();
        //Solution step 14
        exercisePage.submitForm();
        //Check Results
        exercisePage.checkResults();
    }
}
