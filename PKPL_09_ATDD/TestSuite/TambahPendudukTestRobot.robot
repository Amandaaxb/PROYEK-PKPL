*** Settings ***
Library    SeleniumLibrary
    
*** Test Cases ***
# Varian 1 - True-True- True

 TambahPenduduk1
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1278123770940012
    Input Text    nama    Brunella Hutapea
    Input Password    password    Brunella123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    5
    Close Browser   
    Log       Test Completed   
    
 TambahPenduduk2
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1143789900200111
    Input Text    nama    Elvaretta Ambarita
    Input Password    password    Elva1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk3
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1434388979608401
    Input Text    nama    Austin Anzel Rambe
    Input Password    password    Austin1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk4
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2415375999208612
    Input Text    nama    Hoshi Ibad Simarmata
    Input Password    password    Hoshi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk5
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2388851236263516
    Input Text    nama    Gwen Fay Marpaung
    Input Password    password    Gwen12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed   
    
TambahPenduduk6
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2162436032894631
    Input Text    nama    Jazman Irvin Lubis
    Input Password    password    Jazman123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk7
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1334135529429465
    Input Text    nama    Mehram Limbong
    Input Password    password    Mehram123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk8
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2377557901127510
    Input Text    nama    Delvin Charil Habeahan
    Input Password    password    Delvin123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk9
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1373666866805331
    Input Text    nama    Luthfi Rania Mahulae
    Input Password    password    Luthfi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk10
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2126352813135682
    Input Text    nama    Carlton Faiq Nababan
    Input Password    password    Carlton1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk11
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1022742320122844
    Input Text    nama    Tavisha Yamina Pakpahan
    Input Password    password    Tavisha123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk12
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    3251613963976820
    Input Text    nama    Ezhar Gandhi Situmorang
    Input Password    password    Ezhar123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk13
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2223142062211479
    Input Text    nama    Hanna Puri Sihite
    Input Password    password    Hanna123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 
    
# Varian 2 - True-True-False

 TambahPenduduk14
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1278123770940030
    Input Text    nama    Brunella Sari Hutapea
    Input Password    password    Brun
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed  

 TambahPenduduk15
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1143789900200112
    Input Text    nama    Tera Ambarita
    Input Password    password    Ter
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk16
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1434388979608458
    Input Text    nama    Aurel Anzel Rambe
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk17
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2415375999208621
    Input Text    nama    Hoshi Budi Simarmata
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk18
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2388851236263566
    Input Text    nama    Squilaa Sitinjak
    Input Password    password    Sq
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed   
    
TambahPenduduk19
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2162436032894612
    Input Text    nama    Jeroya sai
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk20
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1334135529429456
    Input Text    nama    Rysha Limbong
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk21
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2377557901127501
    Input Text    nama    Calvin Siagian
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk22
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1373666866805313
    Input Text    nama    Joy Marbun
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk23
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2126352813135628
    Input Text    nama    Karina Hutapea
    Input Password    password    KR
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk24
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1022742320122814
    Input Text    nama    Yasmin Jebua
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk25
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    3251613963976802
    Input Text    nama    Pintar Gulo
    Input Password    password    Pin
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk26
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2223142062211497
    Input Text    nama    Chenle Cai Purba
    Input Password    password    Cai
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
# Varian 3 - TRUE-FALSE-TRUE

TambahPenduduk27
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1278123770940030
    Input Text    nama    Brunella78
    Input Password    password    Brunella123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk28
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1143789900200112
    Input Text    nama    Teraa Ke 4
    Input Password    password    Tera12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk29
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1434388979608458
    Input Password    password    Aurel1234    
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk30
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2415375999208621
    Input Text    nama    Hoshi125
    Input Password    password    Hoshi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk31
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2388851236263566
    Input Text    nama    Squilaa Ke 6
    Input Password    password    Squilla123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed   
    
TambahPenduduk32
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2162436032894612
    Input Password    password    Jeroya123    
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk33
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1334135529429456
    Input Text    nama    Rysha678
    Input Password    password    Rysha1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk34
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2377557901127510
    Input Text    nama    Calvin Ke 12
    Input Password    password    Calvin1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk35
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1373666866805313
    Input Password    password    Joy12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk36
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2126352813135628
    Input Text    nama    Karina890
    Input Password    password    Karina1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk37
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1022742320122814
    Input Text    nama    Yasmin Ke 1
    Input Password    password    Yasmin12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk38
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    3251613963976802
    Input Password    password    Pintar1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 

 TambahPenduduk39
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2223142062211497
    Input Text    nama    Chenle12
    Input Password    password    Chenle12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
   
# VARIAN 4 - TRUE-FALSE-FALSE

TambahPenduduk40
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1278123770940030
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk41
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1143789900200112
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk42
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nik          1434388979608458
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk43
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2415375999208621
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
TambahPenduduk44
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2388851236263566
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk45
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2388851236263566
    Input Text    nama    Squilaa Ke 6
    Input Password    password    Squ
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
TambahPenduduk46
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2162436032894612
    Input Text    nama    Jeroya6
    Input Password    password    J12   
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk47
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1334135529429456
    Input Text    nama    Rysha678
    Input Password    password    Rys
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk48
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2377557901127510
    Input Text    nama    Calvin Ke 12
    Input Password    password    Cal
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk49
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1373666866805313
    Input Password    password    Joy
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk50
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    2126352813135628
    Input Password    password    Krn1
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk51
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    1022742320122814
    Input Password    password    Ysmn
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    

 TambahPenduduk52
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    3251613963976802
    Input Text    nama    Pintarr12
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
# VARIAN 5 - FALSE-TRUE-TRUE

 TambahPenduduk53
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    12781237709400031
    Input Text    nama    Brunella Hutapea
    Input Password    password    Brunella123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed   
    
 TambahPenduduk54
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    11437899002001212
    Input Text    nama    Elvaretta Ambarita
    Input Password    password    Elva1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk55
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    14343889796084852
    Input Text    nama    Austin Anzel Rambe
    Input Password    password    Austin1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk56
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    24153759992086121
    Input Text    nama    Hoshi Ibad Simarmata
    Input Password    password    Hoshi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk57
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    238885123626351
    Input Text    nama    Gwen Fay Marpaung
    Input Password    password    Gwen12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
TambahPenduduk58
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    216243603289463
    Input Text    nama    Jazman Irvin Lubis
    Input Password    password    Jazman123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk59
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    133413552942946
    Input Text    nama    Mehram Limbong
    Input Password    password    Mehram123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk60
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    237755790112751
    Input Text    nama    Delvin Charil Habeahan
    Input Password    password    Delvin123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk61
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Luthfi Rania Mahulae
    Input Password    password    Luthfi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk62
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Carlton Faiq Nababan
    Input Password    password    Carlton1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk63
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Tavisha Yamina Pakpahan
    Input Password    password    Tavisha123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk64
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Ezhar Gandhi Situmorang
    Input Password    password    Ezhar123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
# VARIAN 6 - FALSE-TRUE-FALSE

 TambahPenduduk65
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    12781237709400031
    Input Text    nama    Brunella Hutapea
    Input Password    password    Br1
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk66
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    11437899002001212
    Input Text    nama    Elvaretta Ambarita
    Input Password    password    Elv
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk67
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    14343889796084852
    Input Text    nama    Austin Anzel Rambe
    Input Password    password    Aus
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk68
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    24153759992086121
    Input Text    nama    Hoshi Ibad Simarmata
    Input Password    password    Hos
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    

 TambahPenduduk69
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Gwen Fay Marpaung
    Input Password    password    Gw12
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
TambahPenduduk70
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Jazman Irvin Lubis
    Input Password    password    Jaz
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk71
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Mehram Limbong
    Input Password    password    Mehr
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 Tambah Penduduk72
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Delvin Charil Habeahan
    Input Password    password    Delv
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk73
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Luthfi Rania Mahulae
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk74
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Carlton Faiq Nababan
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk75
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nik    32516139639768201
    Input Text    nama    Tavisha Yamina Pakpahan
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk76
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nik    10227423201228441
    Input Text    nama    Ezhar Gandhi Situmorang
    Input Password    password    Ezhar123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
# VARIAN 7 - FALSE-FALSE-TRUE

 TambahPenduduk77
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    12781237709400031
    Input Text    nama    Brunella236
    Input Password    password    Brunella123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed   
    
 TambahPenduduk78
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    11437899002001212
    Input Text    nama    Elvaretta1
    Input Password    password    Elva1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk79
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    14343889796084852
    Input Text    nama    Austin44
    Input Password    password    Austin1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk80
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    24153759992086121
    Input Text    nama    Hoshi08
    Input Password    password    Hoshi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk81
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Password    password    Gwen12345
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
TambahPenduduk82
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Password    password    Jazman123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk83
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Password    password    Mehram123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk84
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Password    password    Delvin123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk85
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Luthfi145
    Input Password    password    Luthfi1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk86
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Carlton99
    Input Password    password    Carlton1234
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk87
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    102274232012284
    Input Password    password    Tavisha123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk88
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    325161396397682
    Input Password    password    Ezhar123
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
# VARIAN 8 - FALSE-FALSE-FALSE

 TambahPenduduk89
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    12781237709400031
    Input Text    nama    Brunella11
    Input Password    password    Bru
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    2
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk90
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    11437899002001212
    Input Text    nama    Elvaretta100
    Input Password    password    Elv
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk91
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    14343889796084852
    Input Text    nama    Austin109
    Input Password    password    Aus
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed  
    
 TambahPenduduk92
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    24153759992086121
    Input Text    nama    Hoshi177
    Input Password    password    Hosh
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk93
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
TambahPenduduk94
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk95
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    133413552942946
    Input Password    password    Mehr
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk96
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nik    237755790112751
    Input Password    password    Dlv
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk97
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Luthfi111
    Input Password    password    Luth1
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed
    
 TambahPenduduk98
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a    
    Input Text    nama    Carlton15
    Input Password    password    Carl
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk99
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
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nik    102274232012284
    Input Text    nama    Tavisha55
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    3
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk100
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nik    325161396397682    
    Input Text    nama    Ezhar Gandhi Situmorang
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 
    
 TambahPenduduk101
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020006
    Input Password    password    12345678
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nik    	1098790046540001  
    Input Text    nama    Pu
    Click Element    //*[@id="penduduk_form"]/button[1]
    Sleep    10
    Close Browser   
    Log       Test Completed 