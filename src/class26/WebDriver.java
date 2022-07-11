package class26;

public interface WebDriver {

    //Create a WebDriver Interface that will have the following unimplemented behaviour:
    //openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    //Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

    class ChromeDriver implements WebDriver {
        @Override
        public void openBrowser(){
            System.out.println("Open Chrome browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close Chrome browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize Window in your Chrome browser");
        }

        @Override
        public void findElement() {
            System.out.println("Find an element by hovering your mouse on object");

        }
    }
    class Firefox implements WebDriver {
        @Override
        public void openBrowser() {
            System.out.println("Open Firefox browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Close your Firefox browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Maximize your window");
        }

        @Override
        public void findElement() {
            System.out.println("Find an element in your Firefox browser");
        }
    }
class Main {
    public static void main(String[] args) {
        WebDriver [] behaviors={new ChromeDriver(), new Firefox()};
        for (WebDriver obj:behaviors) {
            obj.openBrowser();
            obj.closeBrowser();
            obj.maximizeWindow();
            obj.findElement();
        }
    }
}
}
