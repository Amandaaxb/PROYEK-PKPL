*** Settings ***
Library    SeleniumLibrary
    
*** Test Cases ***
# Varian 1 - True-True

 TambahPerangkat1
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
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Brunella Hutapea
    Input Text    jabatan    Kepala Desa
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    2
    Close Browser
    Log       Test Completed   
    
 TambahPerangkat2
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Elvaretta Ambarita
    Input Text    jabatan    Sekretaris Desa
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed   
    
 TambahPerangkat3
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Austin Anzel Rambe
    Input Text    jabatan    Sekretaris Desa 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed   
    
 TambahPerangkat4
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Hoshi Ibad Simarmata
    Input Text    jabatan    Badan Permusyawaratan Desa 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed  
    
 TambahPerangkat5
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Gwen Fay Marpaung
    Input Text    jabatan    Badan Permusyawaratan Desa 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed  
    
 TambahPerangkat6
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jazman Irvin Lubis
    Input Text    jabatan    Badan Permusyawaratan Desa 6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed  
    
 TambahPerangkat7
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Mehram Limbong
    Input Text    jabatan    Badan Permusyawaratan Desa 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 

 TambahPerangkat8
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Delvin Charil Habeahan
    Input Text    jabatan    Badan Permusyawaratan Desa 4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat9
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Luthfi Rania Mahulae
    Input Text    jabatan    Badan Permusyawaratan Desa 5
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat10
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Carlton Faiq Nababan
    Input Text    jabatan    Badan Permusyawaratan Desa 5
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat11
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Tavisha Yamina Pakpahan
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat12
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Ezhar Gandhi Situmorang
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat13
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Hanna Puri Sihite
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat14
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jazmi Mahendra 
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat15
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Kenan Imran Rumapea 
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 5
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat16
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Ghava Eisa  
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 

 TambahPerangkat18
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Yasmin Faizah  
    Input Text    jabatan    Koordinasi Pemerintahan 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat17
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Nafi Pradipa Tambun  
    Input Text    jabatan    Koordinasi Pemerintahan 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat19
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Raka Saad  
    Input Text    jabatan    Koordinasi Pemerintahan 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat20
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Inggrid Simorangkir  
    Input Text    jabatan    Koordinasi Pelayanan 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed 
    
 TambahPerangkat21
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jahida Myria  
    Input Text    jabatan    Koordinasi Pelayanan 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat22
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Caera Sia   
    Input Text    jabatan    Koordinasi Pelayanan 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed  
    
 TambahPerangkat23
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Taufiq Ulwan Lubis   
    Input Text    jabatan    Koordinasi Kesejahteraan 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed  
    
 TambahPerangkat24
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Sarisha Tara   
    Input Text    jabatan    Koordinasi Kesejahteraan 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat25
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    1212021711020002
    Input Password    password    yoas12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Jihan Dyra Harahap  
    Input Text    jabatan    Koordinasi Kesejahteraan 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Click Element    //*[@id="app"]/div[2]/div/div[6]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed   
    
# Varian 2 - True-False
 TambahPerangkat26
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
        Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Jihan Dyra Harahap  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed   

 TambahPerangkat27
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Elvaretta Ambarita  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed   
    
 TambahPerangkat28
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Austin Anzel Rambe  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed   
    
 TambahPerangkat29
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Hoshi Ibad Simarmata  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat30
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Gwen Fay Marpaung  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat31
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Jazman Irvin Lubis  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat32
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Mehram Limbong  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat33
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Delvin Charil Habeahan  
    Input Text    jabatan    Badan Permusyawaratan Desa#4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat34
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Luthfi Rania Mahulae 
    Input Text    jabatan    Badan Permusyawaratan Desa_5
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat35
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Carlton Faiq Nababan  
     Input Text    jabatan    Badan Permusyawaratan Desa@6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat36
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Tavisha Yamina Pakpahan  
    Input Text    jabatan    Lembaga Kemasyarakatan Desa+1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat37
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Ezhar Gandhi Situmorang  
    Input Text    jabatan    Lembaga Kemasyarakatan Desa&2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat38
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Hanna Puri Sihite  
    Input Text    jabatan    Lembaga Kemasyarakatan Desa-3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat39
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Jazmi Mahendra   
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat40
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Kenan Imran Rumapea   
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat41
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Ghava Eisa   
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat42
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Yasmin Faizah   
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat43
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Nafi Pradipa Tambun   
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat44
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama     Raka Saad   
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat45
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Inggrid Simorangkir  
    Input Text    jabatan    Koordinasi_Pelayanan_1  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat46
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jahida Myria  
    Input Text    jabatan    Koordinasi-Pelayanan-2  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat47
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Caera Sia    
    Input Text    jabatan    Koordinasi@Pelayanan-3  
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat48
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Taufiq Ulwan Lubis    
    Input Text    jabatan    Koordinasi Kesejahteraan-1 
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat49
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Sarisha Tara    
    Input Text    jabatan    Koordinasi Kesejahteraan_2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat50
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jihan Dyra Harahap     
    Input Text    jabatan    Koordinasi Kesejahteraan@3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
# Varian 3 - False-True
 TambahPerangkat51
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
        Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Brunella-Hutapea     
    Input Text    jabatan    Kepala Desa
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    2
    Close Browser
    Log       Test Completed
    
 TambahPerangkat52
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Elvaretta_Ambarita     
    Input Text    jabatan    Sekretaris Desa
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed

 TambahPerangkat53
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Austin-Anzel-Rambe     
    Input Text    jabatan    Sekretaris Desa 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat54
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama      Hoshi Ibad-Simarmata
    Input Text    jabatan    Badan Permusyawaratan Desa 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat55
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama      Gwen Fay_Marpaung
    Input Text    jabatan    Badan Permusyawaratan Desa 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed

 TambahPerangkat56
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama      Jazman#Irvin Lubis
    Input Text    jabatan    Badan Permusyawaratan Desa 6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat57
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama      Mehram Limbong__
    Input Text    jabatan    Badan Permusyawaratan Desa 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat58
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama      Delvin-Charil-Habeahan
    Input Text    jabatan    Badan Permusyawaratan Desa 4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat59
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Badan Permusyawaratan Desa 5
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat60
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Badan Permusyawaratan Desa 6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat61
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat62
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat63
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat64
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat65
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 5
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat66
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa 6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
 TambahPerangkat67
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Yasmin Faizah_12  
    Input Text    jabatan    Koordinasi Pemerintahan 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    

 TambahPerangkat68
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Yasmin Faizah_12  
    Input Text    jabatan    Koordinasi Pemerintahan 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat69
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Nafi Pradipa Tambun_01  
    Input Text    jabatan    Koordinasi Pemerintahan 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat70
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Raka_Saad07  
    Input Text    jabatan    Koordinasi Pemerintahan 4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat71
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Inggrid Simorangkir009
    Input Text    jabatan    Koordinasi Pelayanan 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat72
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    InggridSimorangkir026
    Input Text    jabatan    Koordinasi Pelayanan 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat73
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Caera Sia67
    Input Text    jabatan    Koordinasi Pelayanan 3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat74
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Taufiq Ulwan Lubis 008
    Input Text    jabatan    Koordinasi Kesejahteraan 1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat75
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    	1132149087654216
    Input Password    password    sio123456
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Sarisha Tara 769
    Input Text    jabatan    Koordinasi Kesejahteraan 2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
# Varian 4 - False-False

TambahPerangkat76
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password    putra12345
    Click Element    //*[@id="login_form"]/button
        Sleep    2
    CLick Element    xpath=/html/body/div[2]/div/div[6]/button[1]
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat77
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1278123770940003
    Input Password    password    Brunella123
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat78
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1143789900200121
    Input Password    password    Elva1234
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat79
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1434388979608485
    Input Password    password    Austin1234
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat80
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		2415375999208612
    Input Password    password    Hoshi1234
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat81
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		2388851236263516
    Input Password    password    Gwen12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat82
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		2162436032894631
    Input Password    password    Jazman123
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat83
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1334135529429465
    Input Password    password    Mehram123
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat84
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		2377557901127510
    Input Password    password   Delvin123
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat85
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1373666866805331
    Input Password    password   Luthfi1234
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat86
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1022742320122844
    Input Password    password   Tavisha123
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed

TambahPerangkat87
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		3251613963976820
    Input Password    password   Ezhar123
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat88
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Brunella Hutapea09
    Input Text    jabatan    Kepala Desa-1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat89
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Elvaretta_Ambarita
    Input Text    jabatan    Sekretaris-Desa
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat90
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Austin Anzel Rambe_09
    Input Text    jabatan    Sekretaris-Desa-2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat91
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Hoshi Ibad Simarmata 00
    Input Text    jabatan    Badan Permusyawaratan Desa_1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat92
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Gwen Fay Marpaung_9999
    Input Text    jabatan    Badan Permusyawaratan Desa_2
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat93
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jazman Irvin Lubis0001
    Input Text    jabatan    Badan Permusyawaratan Desa_6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat94
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Badan Permusyawaratan Desa_3
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat95
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa-1
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat96
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    jabatan    Lembaga Kemasyarakatan Desa-6
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat97
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Ezhar Gandhi Situmorang_890
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat98
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Hanna Puri Sihite 234
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat99
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jazmi Mahendra - 132
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed
    
TambahPerangkat100
    # Login
        Open Browser    http://127.0.0.1:8000/login    chrome
    Set Selenium Implicit Wait     5
    Sleep    2
    Input Text    nik    		1134327689990001
    Input Password    password   putra12345
    Click Element    //*[@id="login_form"]/button
    # Tambah Penduduk
    Click Element    //*[@id="iq-sidebar-toggle"]/li[3]/a    
    Click Element    //*[@id="iq-sidebar-toggle"]/li[4]/a  
    Click Element    //*[@id="app"]/div/div[4]/div/div/div/div[1]/div[2]/div/div/a
    Input Text    nama    Jazmi Mahendra - 132
    Input Text    jabatan    Lembaga Kemasyarakatan Desa*4
    Click Element    //*[@id="perangkat_form"]/button[1]
    Sleep    6
    Close Browser
    Log       Test Completed