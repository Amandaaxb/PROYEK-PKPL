package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_TambahPengumuman {

	
WebDriver driver;
	//==========================================================================================================================
	//False-True-True
									// Testcase 1
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
//	@Then("^i click kelola pengumuman dan tambah pengumuman$")
//	public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	}
//
//	@When("^i enter valid tanggal, judul dan deskripsi$")
//	public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Gotong Royong");
//		driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Membersihkan Seluruh lingkungan");
//	}
//
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}

												//Testcase 2
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bantuan Sosial");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 3
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/30/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Tahun 2023 ini, pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp Blast / email.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 4
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/28/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bantuan Sosial");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 5
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("UNTUK PENGAJUAN PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 6
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Persyaratan Pembuatan Kartu Keluarga (KK)");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("KK BARU : Formulir Permohonan KK, FC Surat Nikah/Akta Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota keluarga, FC Akta kelahiran semua anggota keluarga");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 7
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Peringatan Keamanan");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Desa kami sedang menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat desa atau kepolisian setempat.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 8
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Pemeliharaan Infrastruktur");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Akan dilakukan pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari melewati area kerja.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 9
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Acara Sosial dan Budaya");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengundang seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 10
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Penggalangan Dana");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Desa kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 11
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("11/12/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kebersihan dan Lingkungan");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 12
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("10/21/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kegiatan Komunitas");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

//==========================================================================================================================
//False-False-False
								// Testcase 1
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Gotong Royong");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 2
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bantuan Sosial");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

										//Testcase 3
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/30/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 4
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/28/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Bantuan Sosial");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 5
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 6
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Persyaratan Pembuatan Kartu Keluarga (KK)");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 7
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Peringatan Keamanan");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 8
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Pemeliharaan Infrastruktur");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 9
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Acara Sosial dan Budaya");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 10
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Penggalangan Dana");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 11
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("11/12/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kebersihan dan Lingkungan");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 12
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("10/21/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("Kegiatan Komunitas");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

//==========================================================================================================================
	//False-False-True
									// Testcase 1
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
//	@Then("^i click kelola pengumuman dan tambah pengumuman$")
//	public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	}
//
//	@When("^i enter valid tanggal, judul dan deskripsi$")
//	public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Membersihkan Seluruh lingkungan");
//	}
//
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}

												//Testcase 2
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 3
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/30/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Tahun 2023 ini, pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp Blast / email.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 4
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/28/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 5
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("UNTUK PENGAJUAN PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 6
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("KK BARU : Formulir Permohonan KK, FC Surat Nikah/Akta Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota keluarga, FC Akta kelahiran semua anggota keluarga");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 7
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Desa kami sedang menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat desa atau kepolisian setempat.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 8
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Akan dilakukan pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari melewati area kerja.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 9
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengundang seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 10
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Desa kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 11
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("11/12/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan.");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 12
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("10/21/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

//==========================================================================================================================
	//False-False-False
									// Testcase 1
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
//	@Then("^i click kelola pengumuman dan tambah pengumuman$")
//	public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//	}
//
//	@When("^i enter valid tanggal, judul dan deskripsi$")
//	public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//		driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//	}
//
//	@Then("^I click tombol submit$")
//	public void I_click_tombol_submit() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//	}

												//Testcase 2
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

											//Testcase 3
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/30/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 4
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/28/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 5
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 6
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 7
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

												//Testcase 8
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 9
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 10
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("05/27/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys(");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 11
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("11/12/2023");
//driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}

													//Testcase 12
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
//@Then("^i click kelola pengumuman dan tambah pengumuman$")
//public void i_click_kelola_pengumuman_dan_tambah_pengumuman() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"iq-sidebar-toggle\"]/li[6]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a")).click();
//}
//
//@When("^i enter valid tanggal, judul dan deskripsi$")
//public void i_enter_valid_tanggal_judul_dan_deskripsi() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"exampleInputdate\"]")).sendKeys("10/21/2023");
//	driver.findElement(By.xpath("//*[@id=\"judul\"]")).sendKeys("");
//	driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("");
//}
//
//@Then("^I click tombol submit$")
//public void I_click_tombol_submit() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"create-pengumuman-form\"]/button[1]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/button[1]")).click();
//}
}
