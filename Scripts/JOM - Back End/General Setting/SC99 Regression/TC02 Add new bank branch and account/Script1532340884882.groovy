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

WebUI.callTestCase(findTestCase('JOM - Back End/Login/Login'), [:], FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('JOM - Back End/General Setting/Add new branch/span_General Settings'), 2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/span_General Settings'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('JOM - Back End/General Setting/Add new branch/span_Finance Setting'), 2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/span_Finance Setting'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/span_Bank Branch  Account'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/a_Add New'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/span_Select Bank_1'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/span_Select Bank'))

WebUI.sendKeys(findTestObject('JOM - Back End/General Setting/Add new branch/span_Select Bank'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/input_name'), 'Branch Testing')

WebUI.setText(findTestObject('JOM - Back End/General Setting/Add new branch/textarea_description'), 'Deskripsi')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/input_bank_account_number'), 
    '08685645344333543')

WebUI.setText(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/input_bank_account_name'), 
    'Testing')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/a_add_bank_account'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/a_btn btn-primary btn-block bt'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/a_Close'))

WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/button_Save'))

not_run: WebUI.click(findTestObject('Object Repository/JOM - Back End/General Setting/Add new branch/a_Close_1'))

