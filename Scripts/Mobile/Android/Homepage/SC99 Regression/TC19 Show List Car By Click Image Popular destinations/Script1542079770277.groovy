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

'Scroll to text popular destinations'
Mobile.scrollToText('Popular Destinations', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.STOP_ON_FAILURE)

'Select location destination and show list of cars'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widgetBandung'), 0)

'Select location destinations'
not_run: Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.RelativeLayout10'), 0)

'Select car'
not_run: Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.RelativeLayout2 (1)'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

