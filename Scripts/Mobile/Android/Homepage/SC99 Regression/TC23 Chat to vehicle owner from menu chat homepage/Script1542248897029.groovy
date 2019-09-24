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

'Tap kolom search chat'
not_run: Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.Search'), 0)

'Delay untuk input history chat'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Input chat history'
not_run: Mobile.setText(findTestObject('Mobile/OR Homepage/android.widget.Search'), 'Yolo test', 0)

'Tap icon search'
not_run: Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.ImageView4'), 0)

'Delay untuk select history chat'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Select chat'
not_run: Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.RelativeLayout8'), 0)

'Tap kolom untuk menulis chat'
Mobile.tap(findTestObject('Mobile/OR Chat/android.widget.EditText0 - Search chat'), 0)

'Input chat'
Mobile.setText(findTestObject('Mobile/OR Chat/android.widget.EditText0 - Search chat'), 'Chat Automation Test', 0)

'Mengirim chat'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageButton1'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

