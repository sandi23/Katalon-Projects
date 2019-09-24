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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jonas-beta.stagingapps.net/login')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('JOM - Back End/Product Studio/OR Add New Component Preview/Page_JOM 3.0  Dashboard/span_Product Studio'), 
    0)

WebUI.click(findTestObject('JOM - Back End/Product Studio/OR Add New Component Preview/Page_JOM 3.0  Dashboard/span_Product Studio'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Dashboard/span_Component Setting'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Dashboard/span_Component Group'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/a_Add New'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/input_name'), 
    'Test Component Group')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/span_Select'))

WebUI.setText(findTestObject('JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/Field Select Product'), 
    '999004000003 - Fr 10x10 Min 188TM Hitam')

WebUI.sendKeys(findTestObject('JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/Field Select Product'), 
    Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/input_image'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\pictures\\icon\\component icon\\8R.png')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Product Studio/OR Add New Component Group/Page_JOM 3.0  Component Group/button_Save'))

