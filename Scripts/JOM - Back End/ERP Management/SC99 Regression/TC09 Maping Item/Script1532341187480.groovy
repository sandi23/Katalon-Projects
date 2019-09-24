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

WebUI.openBrowser('http://jonas-beta.stagingapps.net/login')

WebUI.setText(findTestObject('JOM - Back End/ERP Management/Maping Item/Page_JOM 3.0  Sign In/input_username'), 'admin')

WebUI.setText(findTestObject('JOM - Back End/ERP Management/Maping Item/Page_JOM 3.0  Sign In/input_password'), 'P@ssw0rd')

WebUI.sendKeys(findTestObject('JOM - Back End/ERP Management/Maping Item/Page_JOM 3.0  Sign In/input_password'), Keys.chord(
        Keys.ENTER))

WebUI.scrollToElement(findTestObject('JOM - Back End/ERP Management/Maping Item/Page_JOM 3.0  Dashboard/span_ERP Management'), 
    3)

WebUI.click(findTestObject('JOM - Back End/ERP Management/Maping Item/Page_JOM 3.0  Dashboard/span_ERP Management'))

WebUI.delay(1)

WebUI.click(findTestObject('JOM - Back End/ERP Management/Maping Item/Page_JOM 3.0  Item/span_Item'))

WebUI.delay(1)

WebUI.closeBrowser()

