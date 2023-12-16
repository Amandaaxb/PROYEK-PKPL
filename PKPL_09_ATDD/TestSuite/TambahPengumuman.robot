*** Settings ***
Library    SeleniumLibrary
    
*** Test Cases ***
# Varian 1 - True-True- True

 TambahPengumuman1
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/01/2023
    Input Text    judul    Gotong Royong
    Input Text    //*[@id="exampleFormControlTextarea1"]    Membersihkan Seluruh lingkungan
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman2
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2r
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    Bantuan Sosial  
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman3
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/30/2023
    Input Text    judul    SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023 
    Input Text    //*[@id="exampleFormControlTextarea1"]    Tahun 2023 ini, pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp Blast / email.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman4
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/28/2023
    Input Text    judul    Bantuan Sosial  
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman5
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )  
    Input Text    //*[@id="exampleFormControlTextarea1"]    UNTUK PENGAJUAN PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman6
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    Persyaratan Pembuatan Kartu Keluarga (KK) 
    Input Text    //*[@id="exampleFormControlTextarea1"]    KK BARU : Formulir Permohonan KK, FC Surat Nikah/Akta Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota keluarga, FC Akta kelahiran semua anggota keluarga
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman7
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    Peringatan Keamanan  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat desa atau kepolisian setempat. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman8
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    Pemeliharaan Infrastruktur  
    Input Text    //*[@id="exampleFormControlTextarea1"]     Akan dilakukan pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari melewati area kerja.
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman9
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    Acara Sosial dan Budaya  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengundang seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman10
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    judul    Penggalangan Dana  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman11
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    11/12/2023
    Input Text    judul    Kebersihan dan Lingkungan  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman12
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/21/2023
    Input Text    judul    Kegiatan Komunitas  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman13
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/04/2024
    Input Text    judul    Perbaikan Infrastruktur  
    Input Text    //*[@id="exampleFormControlTextarea1"]     Kami ingin menginformasikan bahwa rencana perbaikan infrastruktur di Desa Ompu Raja Hutapea sudah dimulai.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
# Variasi 2 - T-T-F
 TambahPengumuman14
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/27/2023
    Input Text    judul    Gotong Royong
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    2
    Close Browser
    Log       Test Completed
    
 TambahPengumuman15
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/29/2023
    Input Text    judul    Bantuan Sosial
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman16
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/09/2023
    Input Text    judul    SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman17
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/28/2023
    Input Text    judul    Bantuan Sosial  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman18
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/11/2023
    Input Text    judul    PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman19
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    11/09/2023
    Input Text    judul    Persyaratan Pembuatan Kartu Keluarga (KK)
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman20
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    11/01/2024
    Input Text    judul    Peringatan Keamanan
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman21
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/22/2023
    Input Text    judul    Pemeliharaan Infrastruktur 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman22
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/01/2023
    Input Text    judul    Kebersihan dan Lingkungan
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman23
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    08/14/2023
    Input Text    judul    Kegiatan Komunitas 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman24
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/22/2023
    Input Text    judul    Perbaikan Infrastruktur 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman25
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/22/2023
    Input Text    judul    Penggalangan Dana  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman26
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/22/2023
    Input Text    judul    Acara Sosial dan Budaya  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
# Varian 3: T-F-T
    
 TambahPengumuman27
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/27/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Membersihkan Seluruh lingkungan
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman28
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/27/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman29
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/30/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Tahun 2023 ini, pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp Blast / email. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman30
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/28/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    UNTUK PENGAJUAN PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATANsosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman31
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/09/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    KK BARU : Formulir Permohonan KK, FC Surat Nikah/Akta Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota keluarga, FC Akta kelahiran semua anggota keluarga 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman32
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    11/08/2024
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat desa atau kepolisian setempat. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman33
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    15/06/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Akan dilakukan pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari melewati area kerja. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman34
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/12/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengundang seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman35
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/10/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman36
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    12/28/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman37
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/18/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea.   
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman38
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/24/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea.   
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman39
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/10/2023
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami ingin menginformasikan bahwa rencana perbaikan infrastruktur di Desa Ompu Raja Hutapea sudah dimulai.     
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
# varian 4 : T-F-F
 TambahPengumuman40
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/10/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman41
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/29/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman42
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/30/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman43
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/28/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman44
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    08/17/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman45
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/11/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman46
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/10/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman47
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/12/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman48
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    01/30/2024 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman49
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    03/01/2024/    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman50
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    07/17/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman51
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    09/09/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman52
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    12/08/2023    
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
# Variasi 5 ; F - T - T

 TambahPengumuman53
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/05/2023    
    Input Text    judul    Gotong Royong
    Input Text    //*[@id="exampleFormControlTextarea1"]    Membersihkan Seluruh lingkungan
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman54
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/29/2023    
    Input Text    judul    Bantuan Sosial  
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman55
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    03/31/2023    
    Input Text    judul    SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023 
    Input Text    //*[@id="exampleFormControlTextarea1"]    Tahun 2023 ini, pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp Blast / email.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman56
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    02/17/2023    
    Input Text    judul    Bantuan Sosial  
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman57
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    06/11/2022    
    Input Text    judul    PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )  
    Input Text    //*[@id="exampleFormControlTextarea1"]    UNTUK PENGAJUAN PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman58
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    04/10/2023    
    Input Text    judul    Peringatan Keamanan  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat desa atau kepolisian setempat.
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman59
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a   
    Input Text    judul    Pemeliharaan Infrastruktur  
    Input Text    //*[@id="exampleFormControlTextarea1"]     Akan dilakukan pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari melewati area kerja.
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman60
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Acara Sosial dan Budaya  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengundang seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman61
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Penggalangan Dana  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman62
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Kebersihan dan Lingkungan  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman63
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Kegiatan Komunitas  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman64
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Perbaikan Infrastruktur  
    Input Text    //*[@id="exampleFormControlTextarea1"]     Kami ingin menginformasikan bahwa rencana perbaikan infrastruktur di Desa Ompu Raja Hutapea sudah dimulai.
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
#Varian 6 : F - T - F
    
 TambahPengumuman65
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Perbaikan Infrastruktur  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman66
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Gotong Royong  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    

 TambahPengumuman67
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Bantuan Sosial  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman68
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    04/30/2023
    Input Text    judul    SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman69
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/12/2023
    Input Text    judul    PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )   
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman70
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    01/30/2023
    Input Text    judul    Persyaratan Pembuatan Kartu Keluarga (KK)  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman71
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    03/27/2023
    Input Text    judul    Peringatan Keamanan   
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman72
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/13/2023
    Input Text    judul    Acara Sosial dan Budaya  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed


 TambahPengumuman73
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/19/2023
    Input Text    judul    Penggalangan Dana  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman74
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/10/2022
    Input Text    judul    Gotong Royong  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman75
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    04/11/2023
    Input Text    judul    Kegiatan Komunitas  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman76
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1134327689990001	
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    01/16/2023
    Input Text    judul    Perbaikan Infrastruktur  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

# Variasi 7 : F - F - T
 TambahPengumuman77
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Gotong Royong
    Input Text    //*[@id="exampleFormControlTextarea1"]    Membersihkan Seluruh lingkungan
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman78
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Bantuan Sosial  
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman79
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    SURVEY PENILAIAN INTEGRITAS (SPI) KPK 2023 
    Input Text    //*[@id="exampleFormControlTextarea1"]    Tahun 2023 ini, pelaksana Survei tetap sama seperti pada tahun 2022 yakni Frontier sebagai mitra survei yang, akan mengirimkan Whatsapp Blast / email.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman80
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    Bantuan Sosial  
    Input Text    //*[@id="exampleFormControlTextarea1"]    bantuan sosial bagi masyarakat merujuk pada program-program yang dirancang untuk membantu individu atau kelompok dalam masyarakat 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman81
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    judul    PERSYARATAN PEMBUATAN SKU ( SURAT KETERANGAN USAHA )  
    Input Text    //*[@id="exampleFormControlTextarea1"]    UNTUK PENGAJUAN PEMBUATAN SURAT SKU ( SURAT KETERANGAN USAHA ) YANG BERSANGKUTAN HARUS MEMBAWA/MEMILIKI PERSYARATAN 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman82
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a

    Input Text    judul    Persyaratan Pembuatan Kartu Keluarga (KK) 
    Input Text    //*[@id="exampleFormControlTextarea1"]    KK BARU : Formulir Permohonan KK, FC Surat Nikah/Akta Perkawinan/Akta Cerai, FC Ijazah terakhir semua anggota keluarga, FC Akta kelahiran semua anggota keluarga
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman83
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/21/2023
    Input Text    judul    Peringatan Keamanan  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menghadapi peningkatan kasus kejahatan. Mohon tingkatkan kewaspadaan Anda dan laporkan segala kejadian mencurigakan kepada aparat desa atau kepolisian setempat. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman84
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    01/24/2023
    Input Text    judul    Pemeliharaan Infrastruktur  
    Input Text    //*[@id="exampleFormControlTextarea1"]     Akan dilakukan pemeliharaan rutin pada jalan dan jembatan utama di desa. Harap bersabar selama proses ini berlangsung dan hindari melewati area kerja.
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman85
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    02/20/2023
    Input Text    judul    Acara Sosial dan Budaya  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengundang seluruh warga desa untuk menghadiri acara sosial dan budaya yang akan diselenggarakan dalam waktu dekat. Informasi lebih lanjut tentang acara ini akan segera diumumkan. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman86
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/02/2022
    Input Text    judul    Penggalangan Dana  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Desa kami sedang menggalang dana untuk kegiatan pembangunan infrastruktur dan sosial. Kami menghimbau warga desa yang mampu untuk berpartisipasi dalam penggalangan dana ini demi kemajuan dan kesejahteraan bersama. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman87
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    11/12/2022
    Input Text    judul    Kebersihan dan Lingkungan  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengingatkan kepada seluruh warga untuk menjaga kebersihan lingkungan sekitar kita. Mari kita bersama-sama menjaga desa kita tetap bersih dan indah. Gunakan fasilitas sampah yang tersedia dan hindari pembuangan sampah sembarangan. 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman88
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    03/21/2023
    Input Text    judul    Kegiatan Komunitas  
    Input Text    //*[@id="exampleFormControlTextarea1"]    Kami mengajak seluruh warga untuk aktif berpartisipasi dalam kegiatan komunitas yang diadakan di Desa Ompu Raja Hutapea.  
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
# variasi 8 : F - F - F
    
 TambahPengumuman89
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman90
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman91
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman92
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman93
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman94
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
    
 TambahPengumuman95
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    05/21/2023
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman96
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    01/24/2023
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman97
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    02/20/2023 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman98
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    10/02/2022 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed
    
 TambahPengumuman99
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    01/02/2023
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed

 TambahPengumuman100
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a
    Click Element    //*[@id="iq-sidebar-toggle"]/li[6]/a
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    exampleInputdate    04/01/2023 
    Click Element    //*[@id="create-pengumuman-form"]/button[1]
    Sleep    5
    Close Browser
    Log       Test Completed