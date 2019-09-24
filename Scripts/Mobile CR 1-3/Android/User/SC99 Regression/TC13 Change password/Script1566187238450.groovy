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

WebUI.callTestCase(findTestCase('Mobile CR 1-3/Android/User/SC99 Regression/TC03 Login with email'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap icon profile'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageView0'), 0)

'Tap di area view & edit profile'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.RelativeLayout3'), 0)

WebUI.delay(2)

'Tap Edit Profile'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView5 - Edit Profile'), 0)

'Tap Change Password\r\n'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView9 - Change Password'), 0)

'Input Old Password \'password1\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText0 - Old Password'), 'password1', 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageButton0 (1)'), 0)

'Input New Password \'password2\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText1 - New Password (1)'), 'password2', 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageButton1'), 0)

'Input New Password \'password2\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText2 - Re-New Password'), 'password2', 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageButton2'), 0)

'Tap button Save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Save'), 0)

