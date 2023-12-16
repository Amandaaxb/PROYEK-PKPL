Feature: Test for PA2 (http://127.0.0.1:8000)
		Scenario: Test Tambah Penduduk with valid Credentials
			Given open chrome and start application
			When I success login
			Then i click kelola pengumuman dan tambah pengumuman
			When i enter valid tanggal, judul dan deskripsi
			Then I click tombol submit 