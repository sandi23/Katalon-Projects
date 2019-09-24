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

WebUI.scrollToElement(findTestObject('JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  Dashboard/span_User Management'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  Dashboard/span_User Management'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  Dashboard/span_User Registration'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  Dashboard/span_User Api'), 
    0)

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  Dashboard/span_User Api'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  User Api/i_fa fa-edit fa-lg'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/User Management/OR Edit User API/Page_JOM 3.0  User Api/button_Save'))

not_run: WebUI.closeBrowser()

