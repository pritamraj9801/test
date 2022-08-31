package MX2XL;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sbNet extends browser {
	public void firstUrl() throws InterruptedException {

		driver = invokeBrowser();
		driver.get("https://sbnet.pearsoncmg.com/");

		// -------------------- login
		String username1 = "savleenk";
		String password1 = "Welcome1";

		driver.findElement(By.id("usernameTextBox")).sendKeys(username1);
		driver.findElement(By.id("Password")).sendKeys(password1);
		driver.findElement(By.id("submit")).click();

		// -------------------------------------------- sending book code
		Thread.sleep(500);
		String book_code = "mx_withgottess6";
		driver.findElement(By.id("ctl00_QuickGoRadComboBox_Input")).sendKeys(book_code);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='rcbSlide']//ul//li[1]")).click();
		driver.findElement(By.id("ctl00_QuickGoButton")).click();

//		----------------------------------------------  messy 

		HMHNet secondTarget = new HMHNet();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('http://mlm.pearson.com/northamerica/','__blank')");
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String username2 = "sadhna.hingorani2022@pearson.com";
		String password2 = "Password1234";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sign-in']//a[text()='Sign in']")).click();
		driver.findElement(By.id("username")).sendKeys(username2);
		driver.findElement(By.id("password")).sendKeys(password2);
		driver.findElement(By.id("mainButton")).click();
		
		String book_name_to_be_searched = "Modified Mastering Environmental Science - 22/08/22 - 6e";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement bookTextBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("keywordTextbox")));
		bookTextBox.click();
		bookTextBox.clear(); 
		bookTextBox.sendKeys(book_name_to_be_searched);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-white btn-search-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("courseCardTitle-hingorani10272")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Instructor Tools']/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Item Library']/a")).click();
		Thread.sleep(10000);

		driver.switchTo().window(parentId);
		driver.findElement(By.id("ctl00_HolderMain_bookPartNav_RadComboBoxChapter_Arrow")).click();
		Thread.sleep(1000);
		List<WebElement> chapters = driver.findElements(
				By.xpath("//div[@id='ctl00_HolderMain_bookPartNav_RadComboBoxChapter_DropDown']//ul//li"));

//		System.out.println("------------------ Total chapters: " + (chapters.size() - 1));
		driver.findElement(By.id("ctl00_HolderMain_bookPartNav_RadComboBoxChapter_Arrow")).click();

		for (int ch = 1; ch < chapters.size(); ch++) {
			driver.findElement(By.id("ctl00_HolderMain_bookPartNav_RadComboBoxChapter_Arrow")).click();
			Thread.sleep(2000);
			chapters = driver.findElements(
					By.xpath("//div[@id='ctl00_HolderMain_bookPartNav_RadComboBoxChapter_DropDown']//ul//li"));
			String ch_name = chapters.get(ch).getText();
//			System.out.println("Chapter: " + ch_name);
			chapters.get(ch).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//a[@id='ctl00_HolderMain_bookPartNav_RadComboBoxSection_Arrow']")).click();
			Thread.sleep(2000);
			List<WebElement> sections = driver.findElements(
					By.xpath("//div[@id='ctl00_HolderMain_bookPartNav_RadComboBoxSection_DropDown']//ul//li"));
			driver.findElement(By.xpath("//a[@id='ctl00_HolderMain_bookPartNav_RadComboBoxSection_Arrow']")).click();
//			System.out.println("-------- Total section: " + (sections.size() - 1));
			Thread.sleep(2000);
			for (int sec = 1; sec < sections.size(); sec++) {
				driver.findElement(By.xpath("//a[@id='ctl00_HolderMain_bookPartNav_RadComboBoxSection_Arrow']"))
						.click();
				Thread.sleep(2000);
				sections = driver.findElements(
						By.xpath("//div[@id='ctl00_HolderMain_bookPartNav_RadComboBoxSection_DropDown']//ul//li"));
				String sec_name = sections.get(sec).getText();
//				System.out.println("***" + sec_name);
				sections.get(sec).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath("//*[@id=\"ctl00_HolderMain_ProblemRadGrid_ctl00\"]/thead/tr/th[10]/a"))
						.click();
				Thread.sleep(8000);
				List<WebElement> chapter_table = driver.findElements(By.xpath(
						"//table[@id='ctl00_HolderMain_ProblemRadGrid_ctl00']/tbody/tr//td[@class='titleCell']"));

				ArrayList<String> chapters_names = new ArrayList<String>();
//				System.out.println(
//						"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
//				System.out.println("$ Total questions: " + chapter_table.size());
				for (int qn = 0; qn < chapter_table.size(); qn++) {
					chapter_table = driver.findElements(By.xpath(
							"//table[@id='ctl00_HolderMain_ProblemRadGrid_ctl00']/tbody/tr//td[@class='titleCell']"));
					String chapter_name = chapter_table.get(qn).getText();
//					System.out.println("| -> " + chapter_name);
					chapters_names.add(chapter_name);
				} 
//				System.out.println(
//						"||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				driver.switchTo().window(childId);
				secondTarget.secondUrl(ch_name, sec_name, chapters_names);
				driver.switchTo().window(parentId);
				

			} 
		}
//		return chapters_names;
	}
}
