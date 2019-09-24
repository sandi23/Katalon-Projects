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

'Open apps on phone'
Mobile.startApplication('C:\\Users\\WGS-LAP199\\Downloads\\Movic apk\\Movic_0.10.0_2018-12-03-staging-debug.apk', false)

'Tap button next'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.ImageView4'), 0)

'Tap button arrow next untuk baca tutorial'
for (def index : (1..2)) {
    Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.ImageView1'), 0)
}

'Tap button skip'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.TextView2 - Skip'), 0)

'Tap button continue with facebook'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.LinearLayout2'), 0)

'Input email facebook'
Mobile.setText(findTestObject('Mobile/OR Registrasi/android.widget.EditText0 (5)'), 'santirihamwahyuni@engineer.com', 0)

'Input password facebook'
Mobile.setText(findTestObject('Mobile/OR Registrasi/android.widget.EditText1 (1)'), 'sr19121992', 0)

'Tap button masuk facebook'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.Button0 - Masuk'), 0)

'Tap button continue facebook'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.Button0 - Continue'), 0)

'Delay agar name dan email facebook terrecord di field first name, last name dan email'
Mobile.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.STOP_ON_FAILURE)

'Input mobile number'
Mobile.setText(findTestObject('Mobile/OR Registrasi/android.widget.EditText0 (2)'), '082117284992', 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.STOP_ON_FAILURE)

'Hide keyboard on phone'
Mobile.hideKeyboard()

'Tap button next'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.Button0 - Next (1)'), 0)

'Delay untuk mengisi verification code'
Mobile.delay(findTestData('Delay Step').getValue(1, 3), FailureHandling.STOP_ON_FAILURE)

'Input password'
Mobile.setText(findTestObject('Mobile/OR Registrasi/android.widget.EditText0 (3)'), 'P@ssword123', 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.STOP_ON_FAILURE)

'Hide keyboard on phone'
Mobile.hideKeyboard()

'Tap button next'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.Button0 - Next (3)'), 0)

'Input referral code'
Mobile.setText(findTestObject('Mobile/OR Registrasi/android.widget.EditText0 (4)'), 'TESTCU983', 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 1), FailureHandling.STOP_ON_FAILURE)

'Hide keyboard on phone'
Mobile.hideKeyboard()

'Check ketersediaan referral code'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.TextView2 - Check'), 0)

'Submit form registrasi dan sistem akan mengirim email verifikasi'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.Button0 - Save'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

