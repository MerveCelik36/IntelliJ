package Class23;

public class WebDriver {
    public  void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openUrl(String url){
        System.out.println("opening "+url);
    }
    public void testLoginPage(){
        System.out.println("checking if login page is visible ");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening Google Chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Firefox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening Firefox");
    }


    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening Safari");
    }


    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}
class IE extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening IE");
    }


    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" IE");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on IE");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the IE");
    }
}
class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("opening Edge");
    }


    @Override
    public void openUrl(String url) {
        System.out.println("opening the URL"+url+" Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Edge");
    }
}