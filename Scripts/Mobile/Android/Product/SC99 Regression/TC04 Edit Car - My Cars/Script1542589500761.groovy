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
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageView9 (1)'), 0)

'Tap menu edit'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout2'), 0)

'Edit car details'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView4 - Edit'), 0)

'Tap car brand'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText0 - Mitsubishi'), 0)

'Select car brand'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap car model'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText1 (3)'), 0)

'Select car model'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Tap model year'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText2 - 2018'), 0)

'Select year'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Menuju ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (11)'), 0)

'Clear text plate number'
Mobile.clearText(findTestObject('Mobile/OR Product/android.widget.EditText0 - D 1 BOS'), 0)

'Input plate number'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 - Exp B 1 XXX (1)'), 'D 03 A', 0)

'Menuju ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (12)'), 0)

'Mengatur jumlah seat'
for (def index : (1..2)) {
    Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageView1'), 0)
}

'Select fuel'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Diesel'), 0)

'Select transmision'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button4 - Automatic'), 0)

'Menuju ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button5 - Next (1)'), 0)

'Menghapus image car'
for (def index : (1..6)) {
    Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageView2 (2)'), 0)
}

'Upload car photo 1'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout3'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 2'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout4'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 3'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout5'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 4'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout6'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 5'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout7 (1)'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 6'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout8 (1)'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Save (4)'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

