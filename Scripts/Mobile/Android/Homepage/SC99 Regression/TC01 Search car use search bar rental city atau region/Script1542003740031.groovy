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

'Tap car rental citiy atau region'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView0 - Car Rental CityRegion'), 0)

'Mencari city or region jabodetabek'
Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Search available car for you'), 'Bandung', 0)

'Memilih city or region jabodetabek'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView2 - Jabodetabek'), 0)

'Mencari city or region bandung'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.LinearLayout7 - bandung'), 0)

'Memilih car only'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView1 - Car Only'), 0)

'Memilih car with driver'
Mobile.tap(findTestObject('Mobile/OR Homepage/android.widget.TextView2 - Car With Driver'), 0)

'Next untuk select dates'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Next'), 0)

'Select date'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView38 - 25 update'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Select date'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextView41 - 28 update'), 0)

'Mencari car dengan ketentuan yang telah dipilih'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Button0 - Search'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

