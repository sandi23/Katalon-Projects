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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Dashboard/span_Employee Management'), 
    1)

WebUI.click(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Dashboard/span_Employee Management'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Dashboard/span_Employee'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/a_Add New'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_staff_id'), '1211')

WebUI.setText(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_name'), 'User Testing')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/span_Select Position'))

WebUI.setText(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_select2-search__field'), 'Cash')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/span_Select Grade'))

WebUI.setText(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_select2-search__field'), '3')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Bug List/519/Page_JOM 3.0  Employee/input_join_date'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Bug List/519/Page_JOM 3.0  Employee/input_join_date'), Keys.chord(Keys.ENTER))

WebUI.uploadFile(findTestObject('Bug List/519/Page_JOM 3.0  Employee/upload'), 'C:\\Users\\Sandi\\Pictures\\jom.png')

WebUI.delay(1)

WebUI.click(findTestObject('Bug List/519/Page_JOM 3.0  Employee/save button'))

WebUI.delay(2)

WebUI.closeBrowser()

