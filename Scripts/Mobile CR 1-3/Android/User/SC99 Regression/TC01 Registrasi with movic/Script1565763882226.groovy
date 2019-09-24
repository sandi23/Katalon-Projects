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

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.LinearLayout2'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.ImageView1'), 0)

'tap tombol create new'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Create New Account'), 
    0)

'Input First Name \'Aghie Hamdan dua\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText0 - Nama Depan'), 
    'Aghie Hamdan', 0)

'Input Last Name (Optional) \'Ramdani\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText1 - Nama Belakang (Optional)'), 
    'Ramdani', 0)

'Tap tombol lanjutkan'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Lanjutkan'), 
    0)

'Input email \'aghie hamdan@mailinator.com'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText0 - Email'), 
    'aghiehamdan@mailinator.com', 0)

'Tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Next'), 0)

'Input mobile number \'081286406561\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText0 - Mobile Number'), 
    '081286406561', 0)

'Tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Next (1)'), 0)

'Input Verification Code \'137493\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText0'), '1', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText2'), '7', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText3'), '9', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText3 - 9'), '0', 
    0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText4'), '9', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText5'), '5', 0)

'tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Next (2)'), 0)

'Input password \'password1\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText0 (1)'), 'password1', 
    0)

'Tap Hide and unhide icon'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.ImageButton0'), 0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Next (3)'), 0)

'Input Referral Code (Optional) \'TESTMH168\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.EditText0 - Referral Code (Optional)'), 
    'TESTMH168', 0)

'Tap button Check'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.TextView2 - Check'), 0)

'Tap button Save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/TC01 Register with Movic/android.widget.Button0 - Save'), 0)

