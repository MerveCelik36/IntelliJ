package Class25;

public class Task1 {/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */


}
interface WebDriver{
    void openBrowser();
   void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Open browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("find element");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("find element");
    }
}