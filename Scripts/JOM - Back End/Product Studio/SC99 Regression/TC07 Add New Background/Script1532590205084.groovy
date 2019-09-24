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

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jonas-beta.stagingapps.net/login')

'Simulasi besarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

'Simulasi input password (P@ssw0rd)'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Sign In'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi scroll ke menu \'Product Studio\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond Category/a_Product Studio'), 
    1)

'Simulasi klik menu \'Product Studio\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond Category/a_Product Studio'))

'Simulasi klik submenu \'Background Setting\''
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/span_Background Setting'))

'Simulasi klik submenu \'Background\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/span_Background'))

'Simulasi klik button \'Add New\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/a_Add New'))

'Simulasi klik dropdown \'Add Category\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/span_Category'))

'Simulasi input pada textbox dropdown'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/input_select2-search__field'), 
    'Plain')

'Simulasi klik Enter pada textbox dropdown'
WebUI.sendKeys(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

'Simulasi input nama Background'
WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/input_name'), 
    'TEST ADD BACKGROUND')

'Simulasi upload file'
WebUI.uploadFile(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/input_background'), 
    'D:\\pictures\\smallest\\1.jpg')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/button_Save'))

'Verifikasi muncul notifikasi data berhasil disimpan'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/div_Data has been successfully'))

'Verifikasi muncul Background baru pada tabel'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/td_TEST ADD BACKGROUND'))

'Simulasi klik icon User'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/a_Administrator'))

'Simulasi klik button Sign Out'
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background/Page_JOM 3.0  Backgrond/a_Sign Out'))

'Simulasi tutup browser'
WebUI.closeBrowser()

