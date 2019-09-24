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

'Tap Add Bank account'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView11 - Add'), 0)

'Select Bank Account \'BCA\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText0 - Select bank account'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.LinearLayout3 (1)'), 0)

'Input Account name \'nandang\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText1 - Account name'), 'nandang', 
    0)

'Input Account number \'12345\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText2 - Account number'), '12345', 
    0)

'Input Branch \'Testing\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText3 - Branch'), 'bandung', 0)

'Tap button Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Next (3)'), 0)

