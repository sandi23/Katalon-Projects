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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://jom-demo-backend.stagingapps.net/login')

not_run: WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Sign In/input_username'), 
    'admin')

not_run: WebUI.setText(findTestObject('JOM - Back End/Employee Management/OR Add new Position/Page_JOM 3.0  Sign In/input_password'), 
    'P@ssw0rd')

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Sign In/button_Sign In'))

WebUI.scrollToElement(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Dashboard/span_Employee Management'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Dashboard/span_Employee Management'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Dashboard/span_Employee'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/a_Add New'))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/input_staff_id'), 
    '040792')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/input_name'), 
    'Ali Saputra')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/span_Select Position'))

WebUI.setText(findTestObject('JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/Entry Position'), 
    'Tester')

WebUI.sendKeys(findTestObject('JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/Entry Position'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/span_Select Grade'))

WebUI.setText(findTestObject('JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/Entry Grade'), 
    '1')

WebUI.sendKeys(findTestObject('JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/Entry Grade'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/input_join_date'), 
    '2018-07-24')

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/input_image'), 
    'D:\\Important Data\\Photo.jpg')

WebUI.click(findTestObject('Object Repository/JOM - Back End/Employee Management/OR add new Employee/Page_JOM 3.0  Employee/button_Save'))

