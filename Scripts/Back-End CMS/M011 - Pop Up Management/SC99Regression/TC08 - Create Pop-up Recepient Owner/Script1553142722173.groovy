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

WebUI.click(findTestObject('Page_Pop-Up Management/a_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Pop-Up Management/td_22'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Pop-Up Management/select_00'), '13', true)

WebUI.selectOptionByValue(findTestObject('Page_Pop-Up Management/select_00                     _1'), '36', true)

WebUI.click(findTestObject('Page_Pop-Up Management/td_22'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Pop-Up Management/select_00                     _2'), '14', true)

WebUI.selectOptionByValue(findTestObject('Page_Pop-Up Management/select_00                     _3'), '15', true)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Pop-Up Management/td_23'))

WebUI.setText(findTestObject('Page_Pop-Up Management/input_Title _title'), 'test pop up owner')

WebUI.selectOptionByValue(findTestObject('Page_Pop-Up Management/select_All'), 'OWNER', true)

WebUI.setText(findTestObject('Page_Pop-Up Management/textarea_characters left_messa'), 'test message pop up owner')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Pop-Up Management/button_Save'))

WebUI.delay(2)

