package MDatePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Switch to the iframe containing the date picker
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframeElement);

        // Click on the date field to open the calendar
        WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
        dateField.click();

        // Desired date
        String year = "2025";
        String month = "May";
        String date = "20";

        while (true) {
            // Get the currently displayed month and year
            String calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // If the displayed month and year match the desired ones, break out of the loop
            if (calMonth.equalsIgnoreCase(month) && calYear.equals(year)) {
                break;
            }

            // Click the next button to go to the next month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }

        // Select the desired date
        driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
        
        // Switch back to default content
        driver.switchTo().defaultContent();
        
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Close the browser after execution
        driver.quit();
    }
}
