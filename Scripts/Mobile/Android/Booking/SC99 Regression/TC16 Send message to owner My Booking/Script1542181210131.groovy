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
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Booking/SC99 Regression/TC14 Booking Details - My Booking'), [:], 
    FailureHandling.STOP_ON_FAILURE)

'Tap button message to owner dan menampilkan page chatting'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Message Owner'), 0)

Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Write something here...'), 0)

Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Write something here...'), 'Chat Automation Test', 
    0)

Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageButton1'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

