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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Dashboard/span_General Settings'), 0)

WebUI.click(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Dashboard/span_General Settings'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Dashboard/span_Finance Setting'), 0)

WebUI.click(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Dashboard/span_Finance Setting'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Dashboard/span_Bank'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Bank/a_Add New'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Add New Bank/input_code'), '457')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Add New Bank/input_name'), 'Uji Bank')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Add New Bank/textarea_description'), ' Deskripsi                   \t\n                    ')

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/Bug List/521/Page_JOM 3.0  Add New Bank/button_Save'))

WebUI.delay(2)

WebUI.setText(findTestObject('Bug List/521/Page_JOM 3.0  Dashboard/search'), 'Uji')

WebUI.delay(1)

WebUI.click(findTestObject('Bug List/521/Page_JOM 3.0  Dashboard/edit button'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Bug List/521/Page_JOM 3.0  Add New Bank/deskripsi'), 2)

WebUI.closeBrowser()

