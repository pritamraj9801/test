package MX2XL;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HMHNet extends browser {
	public void secondUrl(String ch_name, String sec_name, ArrayList<String> questions_names)
			throws InterruptedException {

		System.out.println("-----------------------------------------");
		ch_name = ch_name.split("-")[1].trim();
		sec_name = sec_name.split("-")[1].trim();
		System.out.println(ch_name);
		System.out.println(sec_name);
		System.out.println(questions_names);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<WebElement> chapters = driver.findElements(By.xpath("//select[@id='book-tier-select-0']//option"));
//		for(WebElement chapter: chapters) {
//			System.out.println(chapter.getText().split(".")[1].trim());
//			WebElement chapters_list = driver.findElement(By.id("book-tier-select-0"));
//			Select chapter_list_dropdown = new Select(chapters_list);
			
			
//		}
		 
		
		
		
		
		
//		sec_name.replace(" -", ".");
//		System.out.println(ch_name);
//		System.out.println(sec_name);
//		System.out.println(questions_names);
//		driver.switchTo().frame(driver.findElement(By.id("centerIframe")));
		


//		List<WebElement> chapters = driver.findElements(By.xpath("//select[@id='book-tier-select-0']//option"));
//		for(WebElement chapter: chapters) {
//			System.out.println(chapter.getText().split(".")[1].trim());
//			WebElement chapters_list = driver.findElement(By.id("book-tier-select-0"));
//			Select chapter_list_dropdown = new Select(chapters_list);
			
			
//		}
//		WebElement chapters_list = driver.findElement(By.id("book-tier-select-0"));
//		Select chapter_list_dropdown = new Select(chapters_list);
//		chapter_list_dropdown.selectByValue()
//		for (WebElement chapter : chapters) {
//			if (chapter.getText().contains("ch_name")) {
//				chapter.click();
//				break;
//			}
//		}

//		List<WebElement> sections = driver.findElements(By.xpath("select[@id='book-tier-select-1']//option"));
//		for (WebElement section : sections) {
//			if (section.getText().contains("ch_name")) {
//				section.click();
//				break;
//			}
//		}
//		Thread.sleep(6000);
//		List<WebElement> items = driver.findElements(
//				By.xpath("//tbody[@id='libraryTable']//tr[@class='iterate']//div[@class='title-content']//a"));
//		ArrayList<String> items_names = new ArrayList<String>();
//		for (int i = 0; i < items.size(); i++) {
//			String item_name = items.get(i).getText();
//			items_names.add(item_name);
//		}
//		System.out.println(items_names);
		driver.switchTo().defaultContent();
	}
}
