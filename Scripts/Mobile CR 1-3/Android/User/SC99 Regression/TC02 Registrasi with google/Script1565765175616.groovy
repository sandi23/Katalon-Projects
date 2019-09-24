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

Mobile.startApplication('C:\\Users\\WGS-LAP151\\Downloads\\Movic_1.4.0_2019-08-06-00-21-stable-debug.apk', true)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.LinearLayout2'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.TextView2 - Skip'), 
    0)

'Tap button Continue with Google - Sudah login'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.LinearLayout3'), 0)

'Edit First Name \'Nandang\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.EditText0 - Na'), 
    'nandang', 0)

'Edit Last Name \'Sulaeman\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.EditText1 - Sulaima'), 
    'sulaiman', 0)

'Input Mobile Number \'0821286406561\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.EditText3 - No Handphone'), 
    '081286406561', 0)

'Select toggle aggrement receive promotional'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.Switch0 - AKTIF'), 0)

'Tap next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.Button0 - Lanjutkan'), 
    0)

'Input password \'password1\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.EditText0'), 'password1', 
    0)

'Tap hide and unhide icon'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.ImageButton0'), 0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.Button0 - Next'), 0)

'input OTP'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.EditText0 - Referral Code (Optional)'), 
    'TESTMH168', 0)

'Tap button Check'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.TextView2 - Check'), 
    0)

'Tap button Save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC03 Registrasi with google/android.widget.Button0 - Save'), 0)

Mobile.closeApplication()

