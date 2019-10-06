public class Assig1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("http://www.jqueryui.com");
		driver.findElement(By.linkText("Demos")).click();
		driver.findElement(By.xpath("(//a[text()='Draggable'])")).click();
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='https://jqueryui.com/resizable/']")).click();
		driver.findElement(By.xpath("(//a[text()='Sortable'])")).click();
		driver.close();
		
	}

}
