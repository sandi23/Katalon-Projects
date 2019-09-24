import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC12 Login Sebagai Owner'), [:], FailureHandling.STOP_ON_FAILURE)

'Klik Menu Kendaraan Saya'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/img'))

WebUI.delay(3)

'Klik Button Tambah Mobil'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_Tambah Mobil'))

WebUI.delay(3)

'Input Merk Mobil Mercedez Benz'
WebUI.selectOptionByValue(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/select_PeugeotDanDaihatsuHonda'), 
    'a85daf47-1a7d-4f00-9f3e-ff1091740832', true)

WebUI.delay(3)

'Input Model Sport Class'
WebUI.selectOptionByValue(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/select_C CLASSSPORT CLASSE CLA'), 
    '033ad234-f6a6-466d-9dca-1f8aa94958b9', true)

WebUI.delay(3)

'Input Tahun 2018'
WebUI.selectOptionByValue(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/select_19901991199219931994199'), 
    '2018', true)

WebUI.delay(3)

'Input Plat Nomor'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/input_Plat Nomor_form-control'), 'D 6446 RA')

WebUI.delay(3)

'Tambah Jumlah Kursi Penumpang'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/button_'))

WebUI.delay(3)

'Tambah Jumlah Kursi Penumpang'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/button_'))

WebUI.delay(3)

'Pilih Bahan Bakar Listrik'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Listrik'))

WebUI.delay(3)

'Pilih Transmisi Manual'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Manual'))

WebUI.delay(3)

'Turn ON Samakan dengan Lokasi Profil saya'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/span_Lokasi_switch switch-medi'))

WebUI.delay(3)

'Input Alamat Lengkap'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/textarea_(Optional)_form-contr'), 'Depan Indomaret Point')

WebUI.delay(3)

'Lanjutkan ke Step Ketersediaan'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_LANJUTKAN'))

'Delay Pilih Tanggal'
WebUI.delay(10)

'Klik Button Pemilihan Tanggal Lanjutan'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/button_Pemilihan Tanggal Lanju'))

WebUI.delay(3)

'Turn ON Tersedia Setiap Weekday'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/small'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

'Klik Status Open'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Open'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Open'), 0)

WebUI.delay(3)

'Klik Lanjutkan pada Pemilihan Tanggal Lanjutan'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_Lanjutkan_Pemilihan_Tanggal'))

WebUI.delay(3)

WebUI.scrollToPosition(680, 820)

WebUI.delay(3)

'Lanjutkan ke Step Aturan & Pembatalan'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_LANJUTKAN'))

WebUI.delay(3)

'Turn ON Merokok di dalam mobil'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/small_1'))

WebUI.delay(3)

'Turn ON Perbolehkan hewan peliharaan'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/small_2'))

WebUI.delay(3)

'Turn ON Pesta didalam mobil'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/small_3'))

WebUI.delay(3)

'Input Aturan Tambahan'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/textarea_Opsional_form-control'), 'Diperbolehkan membawa hewan peliharaan berukuran kecil.')

WebUI.delay(3)

'Pilih Kebijakan'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Strict No Refund'))

WebUI.delay(3)

'Lanjutkan ke Step Pengambilan & Pengembalian'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_LANJUTKAN'))

'Delay Input jam pengambilan Mulai dan Sampai'
WebUI.delay(10)

'Delay Input jam pengembalian Mulai dan Sampai'
WebUI.delay(10)

'Input Peraturan Tambahan'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/textarea_Optional_form-control'), 'Mohon mengembalikan mobil sesuai jam yang telah ditentukan')

WebUI.delay(3)

'Pilih biaya Gratis biaya pengambilan & pengembalian'
WebUI.selectOptionByValue(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/select_Tidak ada'), '5', 
    true)

WebUI.delay(3)

'Tambah Harga'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_Tambah Harga'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/select_Tidak ada'), 0)

WebUI.delay(3)

'Input Harga/Km'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/input_harga_km'), '20000')

WebUI.delay(3)

'Lanjutkan ke Step Harga'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_LANJUTKAN'))

WebUI.delay(3)

'Pilih Driver'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Tanpa driver'))

WebUI.delay(3)

'Input Harga Weekdays'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/input_harga_weekdays'), '110000')

WebUI.delay(3)

'Input Harga Weekends'
WebUI.setText(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/input_harga_weekends'), '125000')

WebUI.delay(3)

'Klik field Fasilitas'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_Select'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Life Insurance'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Trash Bin'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Car Seat Baby'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Emergency Tools'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Tissue'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Wifi'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/label_Car Insurance'))

'Pilih Fasiltias'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_Life Insurance Trash Bin Car'))

WebUI.delay(3)

'Lanjutkan Ke Step Foto & STNK'
WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_LANJUTKAN'))

WebUI.delay(3)

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Foto Mobil_img-wrapper1 up'), 
    'C:\\Users\\Belinnd\\Pictures\\Gambar Contoh\\Jazz1.jpg')

WebUI.delay(10)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Foto Mobil_img-wrapper1 up_1'), 
    'C:\\Users\\Belinnd\\Pictures\\Gambar Contoh\\Jazz2.jpg')

not_run: WebUI.delay(5)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Foto Mobil_img-wrapper1 up_2'), 
    'C:\\Users\\Belinnd\\Pictures\\Gambar Contoh\\Jazz3.jpg')

not_run: WebUI.delay(5)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Foto Mobil_img-wrapper1 up_3'), 
    'C:\\Users\\Belinnd\\Pictures\\Gambar Contoh\\Jazz4.jpg')

not_run: WebUI.delay(5)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Foto Mobil_img-wrapper1 up_4'), 
    'C:\\Users\\Belinnd\\Pictures\\Gambar Contoh\\Jazz5.jpg')

not_run: WebUI.delay(5)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/div_Foto Mobil_img-wrapper1 up_5'), 
    'C:\\Users\\Belinnd\\Pictures\\Gambar Contoh\\Jazz6.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_LANJUTKAN'))

WebUI.delay(3)

WebUI.click(findTestObject('Front-End/OR Product/OR Tambah data mobil Tanpa Driver/a_SIMPAN'))

