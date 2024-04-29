package src.main.java;



import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;





public class FB {
	public static void main (String []args) {
		ChromeDriver d = new ChromeDriver();
	d.get("https://www.facebook.com");
	Options op = d.manage();
	Window w = op.window();
	w.maximize();
	}

}
