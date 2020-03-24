package netAppNGDC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NetAppGermanL5Test 
{

	
		
		@Test
		public static void assessment() throws InterruptedException//main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C://sarath_eclipse//sarath_eclipse_jars//chromedriver_win32//chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\sarath_eclipse\\sarath_eclipse_jars\\EdgeDriver\\MicrosoftWebDriver.exe");
			
			WebDriver NetAppG = new ChromeDriver();
			
			NetAppG.manage().window().maximize();	
			NetAppG.get("https://uat-netapp-ngdc-lg-18.webappuat.com/");
						
			NetAppG.findElement(By.xpath("//*[@id=\"warning\"]/div/div/div[3]/a")).click();
			
			Thread.sleep(2000);
			//click Begin
			NetAppG.findElement(By.xpath("/html/body/div[3]/div/div/div/a")).click();
			//click 1st option for "Warum beschäftigen Sie sich mit Infrastrukturlösungen für agile Rechenzentren? Was ist der Hauptgrund?"
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm1\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			NetAppG.findElement(By.xpath("//*[@id=\"btnNext\"]")).click();
			
			Thread.sleep(2000);
			//click 1st option for  "Wie ist Ihre IT-Organisation strukturiert?
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm2\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			
			//NetAppG.findElement(By.xpath("//button[(contains(@id,\"btnNext\")) and (text() = \"WEITER  \")]")).click();
			/*
			boolean submitbuttonPresence=NetAppG.findElement(By.id("btnNext")).isDisplayed();	
			if(submitbuttonPresence==true)
			{
				WebElement submitbuttonPresenceclick = NetAppG.findElement(By.id("btnNext"));
				submitbuttonPresenceclick.click();
			}
			*/	//K”)).isDisplayed();
			//NetAppG.findElement(By.xpath("//button[contains(@id,'btnNext') and not(contains(@style,'display: none; visibility: hidden;')) and contains(@type,'submit') and contains(text(),'WEITER  ')]")).click();
			//NetAppG.findElement(By.xpath("//button[contains(text(),'  ZURÜCK ')]")).click();
			//NetAppG.findElement(By.xpath("//footer[@class='assessment-navigation'] //button[@id='btnNext'] //button[contains(text(),'WEITER  ')")).click();
			//NetAppG.findElement(By.partialLinkText("WEITER")).click();
			//NetAppG.findElement(By.cssSelector("button[id='btnNext']")).click();
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Wie oft modernisieren Sie die Kernbestandteile Ihres Rechenzentrums?
			//click option 1: Kontinuierlich
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm3\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[3]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Nutzen Sie Cloud Services von externen Anbietern?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm4\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[4]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Müssen Sie Ihr Rechenzentrum in ein agiles Rechenzentrum transformieren?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm5\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[5]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			
			//Profit Center oder Cost Center: Welche Rolle hat Ihr Rechenzentrum innerhalb des Unternehmens?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm6\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[6]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Welches Statement beschreibt die personelle Ressourcenauslastung in Ihrer IT-Organisation am besten?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm7\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[7]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			
			//Wie hoch ist der Anteil der Workloads, die Sie virtualisieren können?
			Thread.sleep(2000);
			WebElement slider = NetAppG.findElement(By.xpath("//*[@id=\"sectionForm8\"]/div/section/fieldset/section/div[2]/div/label/span/span[6]"));

			//Using Action Class
			Actions move = new Actions(NetAppG);
			Action action = move.dragAndDropBy(slider, 1000, 0).build();
			action.perform();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[8]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Provisionierung von IT-Ressourcen: Welche Aussage beschreibt Ihre Situation bei Über- bzw. Unterprovisionierung am besten?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm9\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[9]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Nutzen Sie Open-Source-Technologien (Docker/Kubernetes) für Ihre Core-IT-Systeme (Kerngeschäftsprozesse)?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm10\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[10]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Wenn Sie die Gegebenheiten in Ihrem heutigen Rechenzentrum ändern könnten, welche wären das?
			Thread.sleep(2000);
			NetAppG.findElement(By.xpath("//*[@id=\"sectionForm11\"]/div/section/fieldset/section/div[2]/div/section/label[1]")).click();
			
			Thread.sleep(2000);
			//click Next
			NetAppG.findElement(By.xpath("/html/body/section/div/div/div/div/div[11]/div/div/form/div/section/fieldset/footer/button[1]")).click();
			
			//Unternehmen
			Thread.sleep(20000);
			WebElement Organization = NetAppG.findElement(By.xpath("//input[@id=\"Q12-QI12-AC68\"]"));
			WebElement CompanyLocation = NetAppG.findElement(By.xpath("//*[@id=\"Q13-QI13-AC69\"]"));
			WebElement Industry = NetAppG.findElement(By.xpath("//*[@id=\"Q14-QI14\"]"));
			WebElement EmployeeSize = NetAppG.findElement(By.xpath("//*[@id=\"Q15-QI16\"]"));
			WebElement Anrede = NetAppG.findElement(By.xpath("//*[@id=\"Q16-QI17\"]"));
			
			
			Organization.click();
			Organization.sendKeys("IDC Test SC - Innovator");
			
			//Unternehmensstandort
			CompanyLocation.click();
			CompanyLocation.sendKeys("United States of America");
			
			//Branche
			Select IndustryClick = new Select(Industry);
			IndustryClick.selectByValue("71");
			
			//Unternehmensgröße
			Select EmployeeSizeClick = new Select(EmployeeSize);
			EmployeeSizeClick.selectByValue("106");
			
			//Anrede
			Select AnredeClick = new Select(Anrede);
			AnredeClick.selectByValue("107");
			
			//Vorname
			NetAppG.findElement(By.xpath("//*[@id=\"Q17-QI18-AC109\"]")).sendKeys("IDC Test");
			
			//Nachname
			NetAppG.findElement(By.xpath("//*[@id=\"Q18-QI19-AC110\"]")).sendKeys("Admin");
			
			//Jobtitle
			NetAppG.findElement(By.xpath("//*[@id=\"Q19-QI20-AC111\"]")).sendKeys("CIO");
			
			//E-Mail-Adresse
			NetAppG.findElement(By.xpath("//*[@id=\"Q20-QI21-AC112\"]")).sendKeys("idc.test.adm@webappuat.com");
			
			//individuellen Report erhalten    			
			NetAppG.findElement(By.xpath("//*[@id=\"callThankyou\"]")).click();
			
			
		}
		

	

}
