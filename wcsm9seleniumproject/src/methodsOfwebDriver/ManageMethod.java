package methodsOfwebDriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension targetSize=new Dimension(350,450);
		driver.manage().window().setSize(targetSize);
		Point targetPosition=new Point(450,250);
		driver.manage().window().setPosition(targetPosition);
		
		

	}

}
