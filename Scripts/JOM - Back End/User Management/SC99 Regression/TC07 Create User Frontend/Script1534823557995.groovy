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

WebUI.scrollToElement(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Management'), 
    0)

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Management'))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Registration'))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  Dashboard/span_User Frontend'))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/a_Add New'))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/span_Select Employee'))

WebUI.setText(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/input_select2-search__field'), 
    'Ali Saputra')

WebUI.sendKeys(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/span_Select Types'))

WebUI.setText(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/input_select2-search__field'), 
    'Photographer')

WebUI.sendKeys(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/input_username'), 
    'alisaputra+wgs')

WebUI.setText(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/input_email'), 
    'Ali.Saputra+wgs@wgs.co.id')

WebUI.click(findTestObject('JOM - Back End/User Management/OR Create User Front End/Page_JOM 3.0  User Frontend/button_Save'))

