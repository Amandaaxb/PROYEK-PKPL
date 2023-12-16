//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//	public class TambahPerangkat {
//		WebDriver driver = null;
//		/* VARIASI 1 : T - T 
//		 * //TambahPerangkat 1
//		 * 
//		 * @Given("browser is open") public void browser_is_open() {
//		 * System.out.println("Inside Step - browser is open");
//		 * 
//		 * String projecPath = System.getProperty("user.dir");
//		 * System.out.println("Project path is:"+projecPath);
//		 * 
//		 * System.setProperty("webdriver.chrome.driver",
//		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		 * 
//		 * driver = new ChromeDriver();
//		 * 
//		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
//		 * 
//		 * @And("user is on login page") public void user_is_on_login_page() {
//		 * driver.navigate().to("http://127.0.0.1:8000/"); }
//		 * 
//		 * @When("user enter nik") public void user_enter_nik() {
//		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
//		 * 
//		 * @And("user enter password") public void user_enter_password() {
//		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
//		 * sendKeys("12345678"); }
//		 * 
//		 * @And("user click button") public void user_click_button() {
//		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
//		 * 
//		 * @And("user click button OK") public void user_click_button_OK() {
//		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
//		 * ); }
//		 * 
//		 * @And("user click button perangkat") public void user_click_button_perangkat()
//		 * {
//		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
//		 * ); }
//		 * 
//		 * @And("user click button tambah perangkat") public void
//		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
//		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		 * }
//		 * 
//		 * @Then("user enter nama") public void user_enter_nama() {
//		 * driver.findElement(By.id("nama")).sendKeys("Brunella Hutapea"); }
//		 * 
//		 * @Then("user enter jabatan") public void user_enter_jabatan() {
//		 * driver.findElement(By.id("jabatan")).sendKeys("Kepala Desa"); }
//		 * 
//		 * @Then("user click button submit") public void user_click_submit() {
//		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
//		 * ; }
//		 */
		
		/*
		 * //TambahPerangkat 2
		 * 
		 * @Given("browser is open") public void browser_is_open() {
		 * System.out.println("Inside Step - browser is open");
		 * 
		 * String projecPath = System.getProperty("user.dir");
		 * System.out.println("Project path is:"+projecPath);
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
		 * 
		 * @And("user is on login page") public void user_is_on_login_page() {
		 * driver.navigate().to("http://127.0.0.1:8000/"); }
		 * 
		 * @When("user enter nik") public void user_enter_nik() {
		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
		 * 
		 * @And("user enter password") public void user_enter_password() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
		 * sendKeys("12345678"); }
		 * 
		 * @And("user click button") public void user_click_button() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
		 * 
		 * @And("user click button OK") public void user_click_button_OK() {
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
		 * ); }
		 * 
		 * @And("user click button perangkat") public void user_click_button_perangkat()
		 * {
		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
		 * ); }
		 * 
		 * @And("user click button tambah perangkat") public void
		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
		 * }
		 * 
		 * @Then("user enter nama") public void user_enter_nama() {
		 * driver.findElement(By.id("nama")).sendKeys("Elvaretta Ambarita"); }
		 * 
		 * @Then("user enter jabatan") public void user_enter_jabatan() {
		 * driver.findElement(By.id("jabatan")).sendKeys("Sekretaris Desa"); }
		 * 
		 * @Then("user click button submit") public void user_click_submit() {
		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
		 * ; }
		 */
		
		/*
		 * //TambahPerangkat 3
		 * 
		 * @Given("browser is open") public void browser_is_open() {
		 * System.out.println("Inside Step - browser is open");
		 * 
		 * String projecPath = System.getProperty("user.dir");
		 * System.out.println("Project path is:"+projecPath);
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
		 * 
		 * @And("user is on login page") public void user_is_on_login_page() {
		 * driver.navigate().to("http://127.0.0.1:8000/"); }
		 * 
		 * @When("user enter nik") public void user_enter_nik() {
		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
		 * 
		 * @And("user enter password") public void user_enter_password() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
		 * sendKeys("12345678"); }
		 * 
		 * @And("user click button") public void user_click_button() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
		 * 
		 * @And("user click button OK") public void user_click_button_OK() {
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
		 * ); }
		 * 
		 * @And("user click button perangkat") public void user_click_button_perangkat()
		 * {
		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
		 * ); }
		 * 
		 * @And("user click button tambah perangkat") public void
		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
		 * }
		 * 
		 * @Then("user enter nama") public void user_enter_nama() {
		 * driver.findElement(By.id("nama")).sendKeys("Austin Anzel Rambe"); }
		 * 
		 * @Then("user enter jabatan") public void user_enter_jabatan() {
		 * driver.findElement(By.id("jabatan")).sendKeys("Sekretaris Desa 2"); }
		 * 
		 * @Then("user click button submit") public void user_click_submit() {
		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
		 * ; }
		 */
		
		/*
		 * //TambahPerangkat 4
		 * 
		 * @Given("browser is open") public void browser_is_open() {
		 * System.out.println("Inside Step - browser is open");
		 * 
		 * String projecPath = System.getProperty("user.dir");
		 * System.out.println("Project path is:"+projecPath);
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
		 * 
		 * @And("user is on login page") public void user_is_on_login_page() {
		 * driver.navigate().to("http://127.0.0.1:8000/"); }
		 * 
		 * @When("user enter nik") public void user_enter_nik() {
		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
		 * 
		 * @And("user enter password") public void user_enter_password() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
		 * sendKeys("12345678"); }
		 * 
		 * @And("user click button") public void user_click_button() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
		 * 
		 * @And("user click button OK") public void user_click_button_OK() {
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
		 * ); }
		 * 
		 * @And("user click button perangkat") public void user_click_button_perangkat()
		 * {
		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
		 * ); }
		 * 
		 * @And("user click button tambah perangkat") public void
		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
		 * }
		 * 
		 * @Then("user enter nama") public void user_enter_nama() {
		 * driver.findElement(By.id("nama")).sendKeys("Hoshi Ibad Simarmata"); }
		 * 
		 * @Then("user enter jabatan") public void user_enter_jabatan() {
		 * driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 1"
		 * ); }
		 * 
		 * @Then("user click button submit") public void user_click_submit() {
		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
		 * ; }
		 */
		
		/*
		 * //TambahPerangkat 5
		 * 
		 * @Given("browser is open") public void browser_is_open() {
		 * System.out.println("Inside Step - browser is open");
		 * 
		 * String projecPath = System.getProperty("user.dir");
		 * System.out.println("Project path is:"+projecPath);
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
		 * 
		 * @And("user is on login page") public void user_is_on_login_page() {
		 * driver.navigate().to("http://127.0.0.1:8000/"); }
		 * 
		 * @When("user enter nik") public void user_enter_nik() {
		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
		 * 
		 * @And("user enter password") public void user_enter_password() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
		 * sendKeys("12345678"); }
		 * 
		 * @And("user click button") public void user_click_button() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
		 * 
		 * @And("user click button OK") public void user_click_button_OK() {
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
		 * ); }
		 * 
		 * @And("user click button perangkat") public void user_click_button_perangkat()
		 * {
		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
		 * ); }
		 * 
		 * @And("user click button tambah perangkat") public void
		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
		 * }
		 * 
		 * @Then("user enter nama") public void user_enter_nama() {
		 * driver.findElement(By.id("nama")).sendKeys("Gwen Fay Marpaung"); }
		 * 
		 * @Then("user enter jabatan") public void user_enter_jabatan() {
		 * driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 2"
		 * ); }
		 * 
		 * @Then("user click button submit") public void user_click_submit() {
		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
		 * ; }
		 */
		
		/*
		 * //TambahPerangkat 6
		 * 
		 * @Given("browser is open") public void browser_is_open() {
		 * System.out.println("Inside Step - browser is open");
		 * 
		 * String projecPath = System.getProperty("user.dir");
		 * System.out.println("Project path is:"+projecPath);
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
		 * 
		 * @And("user is on login page") public void user_is_on_login_page() {
		 * driver.navigate().to("http://127.0.0.1:8000/"); }
		 * 
		 * @When("user enter nik") public void user_enter_nik() {
		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
		 * 
		 * @And("user enter password") public void user_enter_password() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
		 * sendKeys("12345678"); }
		 * 
		 * @And("user click button") public void user_click_button() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
		 * 
		 * @And("user click button OK") public void user_click_button_OK() {
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
		 * ); }
		 * 
		 * @And("user click button perangkat") public void user_click_button_perangkat()
		 * {
		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
		 * ); }
		 * 
		 * @And("user click button tambah perangkat") public void
		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
		 * }
		 * 
		 * @Then("user enter nama") public void user_enter_nama() {
		 * driver.findElement(By.id("nama")).sendKeys("Jazman Irvin Lubis"); }
		 * 
		 * @Then("user enter jabatan") public void user_enter_jabatan() {
		 * driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 6"
		 * ); }
		 * 
		 * @Then("user click button submit") public void user_click_submit() {
		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
		 * ; }
		 */
		
		/*
		 * //TambahPerangkat 7
		 * 
		 * @Given("browser is open") public void browser_is_open() {
		 * System.out.println("Inside Step - browser is open");
		 * 
		 * String projecPath = System.getProperty("user.dir");
		 * System.out.println("Project path is:"+projecPath);
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * projecPath+"/src/test/resources/drivers/chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); }
		 * 
		 * @And("user is on login page") public void user_is_on_login_page() {
		 * driver.navigate().to("http://127.0.0.1:8000/"); }
		 * 
		 * @When("user enter nik") public void user_enter_nik() {
		 * driver.findElement(By.id("nik")).sendKeys("1212021711020006"); }
		 * 
		 * @And("user enter password") public void user_enter_password() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).
		 * sendKeys("12345678"); }
		 * 
		 * @And("user click button") public void user_click_button() {
		 * driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click(); }
		 * 
		 * @And("user click button OK") public void user_click_button_OK() {
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click(
		 * ); }
		 * 
		 * @And("user click button perangkat") public void user_click_button_perangkat()
		 * {
		 * driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click(
		 * ); }
		 * 
		 * @And("user click button tambah perangkat") public void
		 * user_click_button_tambah_perangkat() { driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
		 * }
		 * 
		 * @Then("user enter nama") public void user_enter_nama() {
		 * driver.findElement(By.id("nama")).sendKeys("Mehram Limbong"); }
		 * 
		 * @Then("user enter jabatan") public void user_enter_jabatan() {
		 * driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 3"
		 * ); }
		 * 
		 * @Then("user click button submit") public void user_click_submit() {
		 * driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click()
		 * ; }
		 */
		
//		//TambahPerangkat 8
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Delvin Charil Habeahan");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 4");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 9
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Tavisha Yamina Pakpahan");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 10
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Ezhar Gandhi Situmorang");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 11
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Hanna Puri Sihite");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 12
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jazmi Mahendra");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 4");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 13
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Kenan Imran Rumapea");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 5");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 14
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Yasmin Faizah");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 6");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 15
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Nafi Pradipa Tambun");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 16
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Tavisha Yamina Pakpaha");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat 17
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Ezhar Gandhi Situmorang");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 18
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Hanna Puri Sihite");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat 19
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jihan Dyra Harahap");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Kesejahteraan 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 20
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Sarisha Tara");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Kesejahteraan 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 21
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Taufiq Ulwan Lubis");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Kesejahteraan 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 22
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Caera Sia");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Pelayanan 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 23
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jahida Myria");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Pelayanan 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 24
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Inggrid Simorangkir");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Pelayanan 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 25
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Raka Saad");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinator Pemerintahan 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		// VARIASI 2 : T - F
//		//TambahPerangkat 26 
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020006");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("12345678");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jihan Dyra Harahap");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 27
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Elvaretta Ambarita");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 28
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Austin Anzel Rambe");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 29
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Hoshi Ibad Simarmata");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 30
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Gwen Fay Marpaung");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 31
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jazman Irvin Lubis");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
////		
//		//TambahPerangkat 32
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Mehram Limbong");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 33
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Delvin Charil Habeahan");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 34
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Luthfi Rania Mahulae");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 35
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Carlton Faiq Nababan");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 36
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Tavisha Yamina Pakpahan");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 37
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Ezhar Gandhi Situmorang");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat 38
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Hanna Puri Sihite");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa-3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		

//		//TambahPerangkat 39
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Puri Sihite");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan_Desa(04)");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 40
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Luthfi Rania Mahulae");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa_5");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 41
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Carlton Faiq Nababan");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa@6");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 42
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Tavisha Yamina Pakpahan");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa+1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 43
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Ezhar Gandhi Situmorang");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa&2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 44
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Inggrid Simorangkir");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi_Pelayanan_1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 45
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jahida Myria");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi-Pelayanan-2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 46
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Caera Sia");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi@Pelayanan-3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
////		//TambahPerangkat 47
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Taufiq Ulwan Lubis");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Kesejahteraan-1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 48
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Sarisha Tara");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Kesejahteraan_2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		
//		//TambahPerangkat 49
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jihan Dyra Harahap");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Kesejahteraan@3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 50
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1132149087654216");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("sio123456");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Ghava Eisa");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Sekretaris_Desa@2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		// VARIASI 3: F - T
		//TambahPerangkat 51 
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Brunella-Hutapea");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Kepala Desa");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat 52
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Elvaretta_Ambarita");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Sekretaris Desa");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 53
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Austin-Anzel-Rambe");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Sekretaris Desa 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 54
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Hoshi Ibad-Simarmata");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 55
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Gwen Fay_Marpaung");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 56
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Jazman#Irvin Lubis");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 6");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 57 
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Mehram Limbong__");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 58
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Delvin-Charil-Habeahan");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 4");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 59
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Brunella-Hutapea");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Kepala Desa");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 60
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Yasmin Faizah_12");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 61
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Nafi Pradipa Tambun_01");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat 62
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Raka_Saad07");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 4");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat 63
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama")
//		public void user_enter_nama() {
//			 driver.findElement(By.id("nama")).sendKeys("Inggrid Simorangkir009");
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pelayanan 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		

//		
//		//TambahPerangkat64
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa 6");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
		
//		//TambahPerangkat65
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Kesejahteraan 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat66
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pelayanan 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat67
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pelayanan 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat68
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pelayanan 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat69
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 4");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat69
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat70
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 1");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat71
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Koordinasi Pemerintahan 2");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat72
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 6");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat73
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 5");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat74
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 4");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat75
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan")
//		public void user_enter_jabatan() {
//			 driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa 3");
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat76
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
////		//TambahPerangkat77
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat78
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat79
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat80
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat81
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat82
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Brunella Hutapea09"); 
//		} 
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Kepala Desa-1"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat83
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Elvaretta_Ambarita"); 
//		} 
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Sekretaris-Desa"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat84
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Austin Anzel Rambe_09"); 
//		} 
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Sekretaris-Desa-2"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat85
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Hoshi Ibad Simarmata 00"); 
//		} 
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa_1"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat86
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Gwen Fay Marpaung_9999"); 
//		} 
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa_2"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat87
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Jazman Irvin Lubis0001"); 
//		} 
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa_6"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat88
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa_3"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat89
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa-1"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat90
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Lembaga Kemasyarakatan Desa-6"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat91
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Sekretaris-Desa"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat92
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Sekretaris-Desa-2"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat93
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter jabatan") public void user_enter_jabatan() {
//			driver.findElement(By.id("jabatan")).sendKeys("Badan Permusyawaratan Desa_1"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat94
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Ezhar Gandhi Situmorang_8901"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat95
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Hanna Puri Sihite 234"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
//		//TambahPerangkat96
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Jazmi Mahendra - 132"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat97
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Elvaretta_Ambarita"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//		
//		//TambahPerangkat98
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Austin Anzel Rambe_09"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		
//		//TambahPerangkat99
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Hoshi Ibad Simarmata 00"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
		
		//TambahPerangkat100
//		@Given("browser is open")
//		public void browser_is_open() {
//		   System.out.println("Inside Step - browser is open");
//		   
//		   String projecPath = System.getProperty("user.dir");
//		   System.out.println("Project path is:"+projecPath);
//		   
//		   System.setProperty("webdriver.chrome.driver", projecPath+"/src/test/resources/drivers/chromedriver.exe");
//		   
//		   driver = new ChromeDriver();
//		   
//		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		}
//		@And("user is on login page")
//		public void user_is_on_login_page() {
//		    driver.navigate().to("http://127.0.0.1:8000/");
//		}
//		@When("user enter nik")
//		public void user_enter_nik() {
//			driver.findElement(By.id("nik")).sendKeys("1212021711020002");
//		}
//		@And("user enter password")
//		public void user_enter_password() {
//			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		}
//		@And("user click button")
//		public void user_click_button() {
//			 driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		}
//		@And("user click button OK")
//		public void user_click_button_OK() {
//			 driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//		}
//		@And("user click button perangkat")
//		public void user_click_button_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[4]/a")).click();
//		}
//		@And("user click button tambah perangkat")
//		public void user_click_button_tambah_perangkat() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter nama") public void user_enter_nama() {
//			driver.findElement(By.id("nama")).sendKeys("Jazman Irvin Lubis0001"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"perangkat_form\"]/button[1]")).click();
//		}
//	}
				