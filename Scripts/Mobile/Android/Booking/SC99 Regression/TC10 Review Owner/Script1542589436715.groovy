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

'Call test case my booking'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Booking/SC99 Regression/TC01 My Booking'), [:], FailureHandling.STOP_ON_FAILURE)

'Tab history my booking'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Tab - History'), 0)

'Select history complate'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.RelativeLayout7 (2)'), 0)

'Tap button review car'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Review Car'), 0)

'Delay untuk select rating star'
Mobile.delay(findTestData('Delay Step').getValue(1, 3), FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.EditText0 (1)'), 0)

'Inpu deskripsi review'
Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText0 (1)'), 'Good People Automation Test', 0)

Mobile.hideKeyboard()

'Mengirimkan review'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Send Review'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

