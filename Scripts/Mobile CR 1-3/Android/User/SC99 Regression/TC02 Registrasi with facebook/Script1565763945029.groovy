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

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.LinearLayout2'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.LinearLayout2'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.TextView2 - Skip'), 
    0)

'Tap button Continue with Facebook - sudah login'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.LinearLayout2 (1)'), 
    0)

'(Optional) Edit First Name'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.EditText0 - Nan'), 
    'Nandang', 0)

'(Optional) Edit Last Name'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.EditText1 - Sulaiman'), 
    'Mulyana', 0)

'Input Mobile Number \'081286406561\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.EditText3 - Mobile Number'), 
    '081286406561', 0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.Button0 - Next'), 0)

'Input Password \'Password1\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.EditText0'), 'password1', 
    0)

'Tap Hide and Unhide icon'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.ImageButton0'), 0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.Button0 - Next (1)'), 
    0)

'Input Referral Code (Optional) \'TESTMH168\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.EditText0 - Referral Code (Optional)'), 
    'TESTMH168', 0)

'Tap button Check'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.TextView2 - Check'), 
    0)

'Tap button Save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC02 Register with facebook/android.widget.Button0 - Save'), 0)

