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

'Call test case login'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/User/SC99 Regression/TC04 Login with email'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap tab icon chat '
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.Tab - Chat'), 0)

Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.RelativeLayout9 (1)'), 0)

'Tap kolom untuk menulis chat'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Write something here...'), 0)

'Input chat'
Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Write something here...'), 'Chat Automation Test', 
    0)

'Mengirim chat'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageButton1'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

