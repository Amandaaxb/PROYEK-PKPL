package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TambahPengumuman {
		WebDriver driver = null;
//		//TambahPengumuman1
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("06/01/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Gotong Royong"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Gotong Royong"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman2
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/11/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Bantuan Sosial"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("bantuan "
//					+ "sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu "
//					+ "atau kelompok dalam masyarakat"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman3
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/09/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Tahun 2023 ini, "
//					+ "pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan "
//					+ "mengirimkan Whatsapp Blast / email."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman4
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/12/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Bantuan Sosial"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("bantuan sosial bagi "
//					+ "masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok "
//					+ "dalam masyarakat"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman5
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/20/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Bantuan SosialPERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN"
//					+ " USAHA )"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("UNTUK PENGAJUAN "
//					+ "PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman6
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("11/09/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Persyaratan Pembuatan Kartu Keluarga (KK)"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("KK BARU : Formulir "
//					+ "Permohonan KK, FC Surat Nikah/Akta Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota "
//					+ "keluarga, FC Akta kelahiran semua anggota keluarga"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
//		
//		//TambahPengumuman7
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/26/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Peringatan Keamanan"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Desa kami sedang "
//					+ "menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala "
//					+ "kejadian mencurigakan kepada aparat desa atau kepolisian setempat."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
		//TambahPengumuman8
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/21/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Pemeliharaan Infrastruktur"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Akan dilakukan "
//					+ "pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses "
//					+ "ini berlangsung dan hindari melewati area kerja."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman9
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/20/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Acara Sosial dan Budaya"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengundang "
//					+ "seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan "
//					+ "dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman10
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/11/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Penggalangan Dana"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Desa "
//					+ "kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. "
//					+ "Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana "
//					+ "ini demi kemajuan dan kesejahteraan bersama. "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman11
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/20/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Perbaikan Infrastruktur"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami ingin "
//					+ "menginformasikan bahwa rencana perbaikan infrastruktur di Desa Ompu Raja Hutapea sudah dimulai."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
//		
//		//TambahPengumuman12
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/30/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Kebersihan dan Lingkungan"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami "
//					+ "mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. "
//					+ "Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas "
//					+ "sampah yang tersedia dan hindari pembuangan sampah sembarangan."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman13
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/30/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Kegiatan Komunitas"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengajak "
//					+ "seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa "
//					+ "Ompu Raja Hutapea."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
		//TambahPengumuman14 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/11/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Bantuan Sosial"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
		//TambahPengumuman15 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("06/01/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Gotong Royong"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
		//TambahPengumuman16 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/09/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman17 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/12/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Bantuan Sosial"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman18 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/20/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman19 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("11/09/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Persyaratan Pembuatan Kartu Keluarga (KK)"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman20 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/26/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Peringatan Keamanan"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman21 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/21/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Pemeliharaan Infrastruktur"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman22 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/20/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Acara Sosial dan Budaya"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman23 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/11/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Penggalangan Dana"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
//		
//		//TambahPengumuman24 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/20/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Perbaikan Infrastruktur"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman25 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/30/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Kebersihan dan Lingkungan"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman26 - VARIAN 2 : T - T - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/30/2023"); 
//		}
//		@Then("user enter judul") public void user_enter_judul() {
//			driver.findElement(By.id("judul")).sendKeys("Kegiatan Komunitas"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman27 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/30/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Gotong Royong membersihkan lingkungan desa"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman28 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/11/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("bantuan sosial bagi masyarakat merujuk pada program-program "
//					+ "yang dirancang untuk membantu individu atau kelompok dalam masyarakat "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman29 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/09/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Tahun 2023 ini, pelaksana Survei tetap sama seperti "
//					+ "pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp "
//					+ "Blast / email. "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman30 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/12/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("bantuan sosial bagi masyarakat merujuk "
//					+ "pada program-program yang dirancang untuk membantu individu atau "
//					+ "kelompok dalam masyarakat "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman31 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/12/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("UNTUK PENGAJUAN PEMBUATAN SURAT SKU"
//					+ " ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman32 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("11/09/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("KK BARU : Formulir Permohonan KK, FC Surat Nikah/Akta "
//					+ "Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota keluarga, "
//					+ "FC Akta kelahiran semua anggota keluarga"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman33 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/26/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Desa kami sedang menghadapi peningkatan kasus kejahatan. "
//					+ "Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat "
//					+ "desa atau kepolisian setempat."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman34 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/26/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Akan dilakukan pemeliharaan rutin pada jalan dan "
//					+ "jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari "
//					+ "melewati area kerja."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman35 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/20/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Kami mengundang seluruh warga desa untuk menghadiri "
//					+ "acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih "
//					+ "lanjut tentang acara ini akan segera diumumkan. "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman35 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/11/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Desa kami sedang menggalang dana untuk kegiatan"
//					+ " pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk"
//					+ " berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama. "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
//		
//		//TambahPengumuman36 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/20/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Kami ingin menginformasikan bahwa"
//					+ " rencana perbaikan infrastruktur di Desa Ompu Raja Hutapea sudah dimulai.  "); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman37 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/30/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Kami mengingatkan kepada seluruh warga untuk menjaga "
//					+ "kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih "
//					+ "dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman38 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/30/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Kami mengajak seluruh warga untuk aktif "
//					+ "berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea."); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman39 - VARIAN 3 : T - F - T
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("06/01/2023"); 
//		}
//		@Then("user enter deskripsi") public void user_enter_deskripsi() {
//			driver.findElement(By.id("judul")).sendKeys("Gotong Royong membersihkan lingkungan desa"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman40 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("06/01/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman41 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/11/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
		//TambahPengumuman42 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/09/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman43 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/12/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman44 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/20/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman45 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("11/09/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman46 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/26/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman47 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("08/21/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman48 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("07/20/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman49 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/11/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman50 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("09/20/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman51 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("12/30/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
		
//		//TambahPengumuman52 - VARIAN 4 : T - F - F
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
//		@And("user click button pengumuman")
//		public void user_click_button_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		}
//		@And("user click button tambah pengumuman")
//		public void user_click_button_tambah_pengumuman() {
//			 driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//		}
//		@Then("user enter date") public void user_enter_date() {
//			driver.findElement(By.id("exampleInputdate")).sendKeys("10/30/2023"); 
//		}
//		@Then("user click button submit")
//		public void user_click_submit() {
//			 driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		}
}
