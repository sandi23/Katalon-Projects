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

'Tap Edit Profile'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView5 - Edit Profile'), 0)

'Change Bank account'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView12 - Change'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText0 - BII MAYBANK'), 0)

'Change Account name'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText1 - qwertytest'), 'test name account', 
    0)

'Change Account number'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText2 - 123456'), '12345', 0)

'Change Branch'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText3 - testtest'), 'bandung', 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.CheckBox0 - Make this account as primary'), 
    0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Next (4)'), 0)

