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
WebUI.openBrowser('jonas-beta.stagingapps.net/login')

'Simulasi membesarkan window'
WebUI.maximizeWindow()

'Simulasi input username'
WebUI.setText(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

'Simulasi input password (P@ssw0rd)'
WebUI.setText(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

'Simulasi klik button Sign In'
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Sign In/button_Sign In'))

'Simulasi scroll ke menu \'Marketing Management\''
WebUI.scrollToElement(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Dashboard/span_Marketing Management'), 
    1)

'Simulasi klik menu \'Marketing Management\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Dashboard/span_Marketing Management'))

'Simulasi klik submenu \'Product Sub Category\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Dashboard/span_Product Sub Category'))

'Simulasi klik button \'Add New\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/a_Add New'))

'Simulasi klik dropdown \'Select Product Category\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/span_Select Product Category'))

'Beri jeda dropdown loading'
WebUI.delay(1)

'Simulasi input pada textbox dropdown'
WebUI.setText(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/input_select2-search__field'), 
    'Basic Studio')

'Simulasi klik Enter pada textbox dropdown'
WebUI.sendKeys(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

'Simulasi input nama Product Sub Category'
WebUI.setText(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/input_sub_category_name'), 
    'TEST_PRODUCT_SUB_CATEGORY')

'Simulasi klik button \'Save\''
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/button_Save'))

'Simulasi klik page 4 pada tabel'
not_run: WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/a_4'))

'Verifikasi Product Sub Category \'Casual\' berhasil dibuat'
not_run: WebUI.verifyElementVisible(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Product Sub Category/td_Casual'))

'Simulasi klik icon User'
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Dashboard/span_Administrator'))

'Simulasi klik button Log Out'
WebUI.click(findTestObject('JOM - Back End/Marketing Management/Add new Product Sub Category Product Studio/Page_JOM 3.0  Dashboard/a_Sign Out'))

'Simulasi menutup browser'
not_run: WebUI.closeBrowser()

