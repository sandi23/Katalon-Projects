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

WebUI.openBrowser('jonas-beta.stagingapps.net/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Dashboard/span_Product Merchandise'), 
    1)

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Dashboard/span_Product Merchandise'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Dashboard/span_Merchandise Categorizatio'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Dashboard/span_Merchandise Category'))

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/a_Add New'))

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/input_name'), 
    'Food and Beverages')

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/span_Type'))

WebUI.setText(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/input_Type'), 
    'Non Frame')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/input_Type'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.sendKeys(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/span_Type'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/btn_Save'))

not_run: WebUI.click(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/a_2'))

not_run: WebUI.verifyElementVisible(findTestObject('JOM - Back End/Product Merchandise/Add new Merchandise category/Page_JOM 3.0  Merchandise Category/td_Food_and_Bev'))

not_run: WebUI.closeBrowser()

