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

'Tap button Log in'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView0 - Log in'), 0)

'input Email \'\'user@mail.com\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText0 - No Mobile atau Email'), 
    '081919868812', 0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Lanjutkan'), 0)

'Tap button Next'
not_run: Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Next'), 0)

'Tap button Login with SMS'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView3 - Login with SMS'), 0)

