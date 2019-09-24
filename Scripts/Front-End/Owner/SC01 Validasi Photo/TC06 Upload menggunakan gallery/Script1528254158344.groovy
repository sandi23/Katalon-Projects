import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC04 Login Biasa with email'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(10)

not_run: WebUI.refresh()

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Home/a_Bergabung menjadi Vehicle Ow'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner/a_Bergabung Menjadi Pemilik Mo'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 400)

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner Register/span_Upload Gambar'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\Pictures\\JOM\\People\\images.jpg')

WebUI.delay(10)

WebUI.scrollToPosition(0, 1100)

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner Register/span_Upload Gambar (1)'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\Pictures\\JOM\\People\\images.jpg')

WebUI.delay(10)

WebUI.scrollToPosition(0, 1600)

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner Register/span_Upload Gambar (2)'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\Pictures\\JOM\\People\\images.jpg')

WebUI.delay(10)

not_run: CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner Register/span_Upload Gambar (2)'), 
    '"C:\\Users\\Sandi\\Pictures\\Screenshots\\qa\\QA-Tester-meme-02.jpg"')

not_run: WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/button_LANJUTKAN'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner/div_Ukuran File Terlalu Besar.'), 
    5)

not_run: WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/button_LANJUTKAN'))

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche (1)'), 'alirental')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche_1'), 'slogan')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control'), 'deskripsi')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control_1'), 'ban')

WebUI.sendKeys(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control_1'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche_2'), 'alamat')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche_3'), 'kota')

WebUI.closeBrowser()

