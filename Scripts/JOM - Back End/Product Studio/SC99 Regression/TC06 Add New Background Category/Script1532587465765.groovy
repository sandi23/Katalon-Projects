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

'Simulasi buka browser, input URL, loading webpage'
WebUI.openBrowser('http://jonas-beta.stagingapps.net/login')

'Simulasi besarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

'Simulasi input password (P@ssw0rd)'
WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Sign In'
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi scroll ke menu \'Product Studio\''
WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/a_Product Studio'), 
    1)

'Simulasi klik menu \'Product Studio\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/a_Product Studio'))

'Simulasi klik submenu \'Background Setting\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/span_Background Setting'))

'Simulasi klik \'Background Category\''
WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/span_Background Category'))

'Simulasi klik button \'Add New\''
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/a_Add New'))

'Simulasi input nama Background Category'
WebUI.setText(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/input_name'), 
    'TEST ADD BACKGROUND CATEGORY')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/button_Save'))

'Verifikasi muncul Background Category baru pada tabel'
WebUI.verifyElementVisible(findTestObject('Object Repository/JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/td_TEST ADD BACKGROUND CATEGOR'))

'Verifikasi muncul notifikasi data berhasil ditambahkan'
WebUI.verifyElementVisible(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/div_Data has been successfully'))

'Simulasi klik icon User'
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/a_Administrator'))

'Simulasi klik button Sign Out'
WebUI.click(findTestObject('JOM - Back End/Product Studio/Add New Background Category/Page_JOM 3.0  Backgrond Category/a_Sign Out'))

'Simulasi tutup browser'
WebUI.closeBrowser()

