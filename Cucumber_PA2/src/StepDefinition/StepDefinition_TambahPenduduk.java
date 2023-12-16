//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinition_TambahPenduduk {
//WebDriver driver;
	
	//--------------Login--------------
	//---------------------------------
	
	//Benar
	//Test Case 1
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//
//	@When("^I success login$")
//	public void I_success_login() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		
//	}
//

//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987656");
//		driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Angel");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel12345");
//	}
//
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//	}

	//Test Case 2
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//	
//	@When("^I success login$")
//	public void I_success_login() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//	
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		
//	}
//	
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940003");
//		driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Brunella Hutapea");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunella123");
//	}
//	
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//	}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//	}
//
//
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1434388979608485");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Austin Anzel Rambe");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin1234");
//	}
//
//  @Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208612");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hoshi Ibad Simarmata");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2388851236263516");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Gwen Fay Marpaung");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen12345");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894631");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Jazman Irvin Lubis");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1334135529429465");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Mehram Limbong");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2377557901127510");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Delvin Charil Habeahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1373666866805331");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Luthfi Rania Mahulae");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2126352813135682");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Carlton Faiq Nababan");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1022742320122844");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Tavisha Yamina Pakpahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("3251613963976820");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Ezhar Gandhi Situmorang");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//===========================================================================================================================
//Benar-Benar-Salah
//Test Case 1
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987656");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Angel");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 2
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940003");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Brunella Hutapea");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunel");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1434388979608485");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Austin Anzel Rambe");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208612");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hoshi Ibad Simarmata");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi1");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2388851236263516");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Gwen Fay Marpaung");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen12");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894631");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Jazman Irvin Lubis");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1334135529429465");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Mehram Limbong");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2377557901127510");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Delvin Charil Habeahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1373666866805331");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Luthfi Rania Mahulae");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2126352813135682");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Carlton Faiq Nababan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1022742320122844");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Tavisha Yamina Pakpahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("3251613963976820");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Ezhar Gandhi Situmorang");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//==========================================================================================================================
//Benar-Salah_Benar
//Test Case 1
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987656");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel12345");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 2
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
// 	
// 	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940003");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunella123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1434388979608485");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Austin Anzel Rambe");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208612");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hoshi Ibad Simarmata");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2388851236263516");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Gwen Fay Marpaung");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen12345");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894631");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1334135529429465");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2377557901127510");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1373666866805331");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2126352813135682");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1022742320122844");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("3251613963976820");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//==========================================================================================================================
//Benar-Salah-Salah
//Test Case 1
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987656");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("12");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 2
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940003");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("352");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunell");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1434388979608485");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("362");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208612");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("&#&@&(");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2388851236263516");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("73468635&$&$(w");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894631");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("32785#*&@%(*@");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1334135529429465");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("87143(&#$&(msnd");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2377557901127510");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("824ykjjGEJSG#*@");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1373666866805331");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("872985JKSHJ#&@");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2126352813135682");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("(#$@^%(*@(&%*");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1022742320122844");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("&^$@(*^@");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("3251613963976820");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("80374$^#28752");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//=================================================================================================================
// Salah-Benar-Benar
	//Test Case 1
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//
//	@When("^I success login$")
//	public void I_success_login() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		
//	}
//
//
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("12345678909876HAHDJAHD");
//		driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Angel");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel12345");
//	}
//
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//	}

	//Test Case 2
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//	
//	@When("^I success login$")
//	public void I_success_login() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//	
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		
//	}
//	
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940");
//		driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Brunella Hutapea");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunella123");
//	}
//	
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//	}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//	}
//
//
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1434388979608");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Austin Anzel Rambe");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin1234");
//	}
//
//@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hoshi Ibad Simarmata");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2388851236263516");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Gwen Fay Marpaung");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen12345");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894631");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Jazman Irvin Lubis");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("133413552942");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Mehram Limbong");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2377557901127");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Delvin Charil Habeahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1373666866805331");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Luthfi Rania Mahulae");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2126352813135682");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Carlton Faiq Nababan");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("102274232012");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Tavisha Yamina Pakpahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("3251613963976");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Ezhar Gandhi Situmorang");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 13
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("22231420622");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hanna Puri Sihite");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hanna123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//=================================================================================================================
//Salah-Benar-Salah
	//Test Case 1
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//
//	@When("^I success login$")
//	public void I_success_login() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		
//	}
//
//
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987");
//		driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Angel");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel");
//	}
//
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//	}

	//Test Case 2
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	 	
//	 	driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://127.0.0.1:8000/login");
//	}
//	
//	@When("^I success login$")
//	public void I_success_login() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//		driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//	
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		
//	}
//	
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770943");
//		driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Brunella Hutapea");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunell");
//	}
//	
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//	}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}
//
//	@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//	public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//	}
//
//
//	@When("^I enter NIK, nama, dan password$")
//	public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("143438897960");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Austin Anzel Rambe");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Aust234");
//	}
//
//@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hoshi Ibad Simarmata");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi4");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("238885163516");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Gwen Fay Marpaung");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen12");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("216243603281");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Jazman Irvin Lubis");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("133413552942");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Mehram Limbong");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("23775579011");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Delvin Charil Habeahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("137366686680");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Luthfi Rania Mahulae");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi1");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("212635281313");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Carlton Faiq Nababan");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("102274232012");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Tavisha Yamina Pakpahan");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("3251613963976");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Ezhar Gandhi Situmorang");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar1");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 13
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("222314206221");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("Hanna Puri Sihite");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hanna");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//==========================================================================================================================
//Salah-Salah_Benar
//Test Case 1
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel12345");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 2
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunella123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("143438897960");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("238885123626");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen12345");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("13341355294");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("237755790112");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("13736668668");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("212635281313");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton1234");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("102274232012");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("325161396397");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar123");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//==========================================================================================================================
//Salah-Salah-Salah
//Test Case 1
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1234567890987");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("angel1");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 2
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1278123770940");
//	driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Brunel");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 3
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("143438897960");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Austin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 4
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2415375999208");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hoshi1");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 5
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("238885123626");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Gwen1");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 6
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("2162436032894");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jazman");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 7
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("13341355294");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Mehram");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 8
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("237755790112");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Delvin");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}
//Test Case 9
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("13736668668");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Luthfi");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 10
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("212635281313");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Carlton");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 11
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("102274232012");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Tavisha");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 12
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("325161396397");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ezhar");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}

//Test Case 13
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//	
//	driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("http://127.0.0.1:8000/login");
//}
//
//@When("^I success login$")
//public void I_success_login() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("1212021711020002");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[2]/div/input")).sendKeys("yoas12345");
//driver.findElement(By.xpath("//*[@id=\"login_form\"]/button")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
//
//@Then("^I click menu Kelola Penduduk and tambah penduduk$")
//public void I_click_menu_Kelola_Penduduk_and_tambah_penduduk() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[3]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//
//}
//
//@When("^I enter NIK, nama, dan password$")
//public void I_enter_NIK_nama_dan_password() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"nik\"]")).sendKeys("222314206$#^");
//driver.findElement(By.xpath("//*[@id=\"nama\"]")).sendKeys("1344");
//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hanna");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"penduduk_form\"]/button[1]")).click();
//}


//}
