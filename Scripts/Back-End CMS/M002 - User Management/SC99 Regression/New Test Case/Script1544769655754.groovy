import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_Subscribe List'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR User Management/Subscriber/select_Email'), 'name', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Backend/OR User Management/Subscriber/select_Email'), 'email', 
    true)

WebUI.setText(findTestObject('Object Repository/Backend/OR User Management/Subscriber/input_List User_searchValue'), 'agus')

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/button_List User_filterBtn'))

WebUI.setText(findTestObject('Object Repository/Backend/OR User Management/Subscriber/input_Search_form-control inpu'), 
    'bagus')

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_Export'))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_Subscribed_btn btn-danger bt'))

WebUI.rightClick(findTestObject('Object Repository/Backend/OR User Management/Subscriber/button_Ok'))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_2'))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_1'))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_Next'))

WebUI.click(findTestObject('Object Repository/Backend/OR User Management/Subscriber/a_Previous'))

