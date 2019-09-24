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
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Booking/SC99 Regression/TC12 Search - My Booking'), [:], FailureHandling.STOP_ON_FAILURE)

'Select my bookings'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.RelativeLayout7 (1)'), 0)

'View status details'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextLink - See detail status'), 0)

'Tap arrow left untuk back ke booking details'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageView0'), 0)

'Scroll to payment'
Mobile.scrollToText('payment with', FailureHandling.STOP_ON_FAILURE)

'Tap price details'
Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Dropdown'), 0)

'Scroll to total price'
Mobile.scrollToText('Total Price', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap arrow left untuk back ke page my bookings'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageView0'), 0)

'Tab history my booking'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Tab - History'), 0)

not_run: Mobile.clearText(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Chevrolet'), 0)

'Search history my bookings'
not_run: Mobile.setText(findTestObject('Mobile/OR Booking/android.widget.EditText0 - Search my booking'), 'Isuzu', 0)

'Tap icon search'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageView4'), 0)

'Select my bookings'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.RelativeLayout7 (1)'), 0)

'View status details'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.TextLink - See detail status'), 0)

'Tap arrow left untuk back ke booking details'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.ImageView0'), 0)

'Scroll to payment'
not_run: Mobile.scrollToText('payment with', FailureHandling.STOP_ON_FAILURE)

'Tap price details'
not_run: Mobile.tap(findTestObject('Mobile/OR Booking/android.widget.Dropdown'), 0)

'Scroll to total price'
not_run: Mobile.scrollToText('Total Price', FailureHandling.STOP_ON_FAILURE)

