package Steps;

import Base.BaseUtil;
import Elements.Bouttonn;
import cucumber.api.Scenario;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Hook extends BaseUtil{

    private BaseUtil base;
    public Hook(BaseUtil base){
        this.base=base;
    }
    public Bouttonn boutton = new Bouttonn(base.driver);


    public class User {
        public String username;
        public String password;

        public User(String UserName, String Password) {
            this.username = UserName;
            this.password = Password;
        }
        public User(){}

    }


    @Before
    public void InitializeTest() {
        System.out.println("opening the browser");
       System.setProperty("webdriver.chrome.driver","C:\\Users\\PC-ASUS\\Downloads\\Compressed\\chromedriver.exe");

        base.driver=new ChromeDriver();
       // base.driver.manage().window().maximize();
        base.driver.navigate().to("http://127.0.0.1:8099/share/page/");
        base.driver.manage().window().maximize();
        List<User> users = new ArrayList<User>();



            //System.out.println("The password is"+ user.password);*/
            base.driver.findElement(By.name("username")).sendKeys("admin");
            base.driver.findElement(By.name("password")).sendKeys("Safa1994");

            base.driver.findElement(By.id("page_x002e_components_x002e_slingshot-login_x0023_default-submit-button")).click();
        //boutton.loginbtn.click();











    }

    @After
    public void TearDownTest(Scenario sc) {

        if(sc.isFailed()){
            System.out.println(sc.getName());
        }

        System.out.println("closing the browser");
    }
}
