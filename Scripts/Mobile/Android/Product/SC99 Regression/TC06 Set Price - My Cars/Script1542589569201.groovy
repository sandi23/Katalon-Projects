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

'Call test case search car - my cars'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Product/SC99 Regression/TC02 Search Car - My Cars'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap tab my cars'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Tab - My Cars'), 0)

'Tap icon menu titik 3'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageView9 - 3 dots 1'), 0)

'Select menu set price'
Mobile.tap(findTestObject('Mobile/OR Order/android.widget.TextView6 - Set price 2'), 0)

'Clear price for weekdays (package price 1)'
Mobile.clearText(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Rp 100.000'), 0)

'Input new price for weekdays (package price 1)'
Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText0 (2)'), '1000000', 0)

'Clear price for weekends/national holiday (package price 1)'
Mobile.clearText(findTestObject('Mobile/OR Booking/android.widget.EditText1 - Rp 200.000'), 0)

'Input new price for weekends/national holiday (package price 1)'
Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText1'), '1250000', 0)

not_run: Mobile.scrollToText('Add Package Price', FailureHandling.STOP_ON_FAILURE)

'Clear price for weekdays (package price 2)'
not_run: Mobile.clearText(findTestObject('Mobile/OR Product/android.widget.EditText0 - Rp 1.000.000'), 0)

'Input new price for weekdays (package price 2)'
not_run: Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 (6)'), '1250000', 0)

'Clear price for weekends/national holiday (package price 2)'
not_run: Mobile.clearText(findTestObject('Mobile/OR Product/android.widget.EditText1 - Rp 1.250.000'), 0)

'Input new price for weekends/national holiday (package price 2)'
not_run: Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText1 (5)'), '1500000', 0)

'Menyimpan perubahan price'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Save (5)'), 0)

not_run: Mobile.delay(findTestData('Delay Step').getValue(1, 2))

