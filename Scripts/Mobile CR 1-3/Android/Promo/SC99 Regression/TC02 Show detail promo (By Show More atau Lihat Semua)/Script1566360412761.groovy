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

'Show more info & promo'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.TextView6 - Show more'), 0)

'Tab info'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.Tab(0)'), 0)

'Select info'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.LinearLayout4'), 0)

'Delay untuk back ke page info & promo'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tab promo'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.Tab(1)'), 0)

'Select promo'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.LinearLayout4'), 0)

'Salin code promo'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.TextView3 - Salin Kode'), 0)

'Tab terms and conditions'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.Tab'), 0)

'Gunakan kode promo (copy code)'
Mobile.tap(findTestObject('Mobile/OR Promo/android.widget.Button0 - Copy'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

