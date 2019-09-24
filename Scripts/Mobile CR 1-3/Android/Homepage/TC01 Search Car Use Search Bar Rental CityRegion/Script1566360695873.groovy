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

not_run: Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageView0 (4)'), 0)

not_run: Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView10 - Homepage'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView4 - Find in Movic'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView0 - City Area Destination'), 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.EditText0 - City Area Destination'), 
    'bandung', 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView2 - Bandung'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Next (6)'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView30 - 21'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.TextView39 - 30'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Select Pickup Time'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/OP CR 1-3/android.widget.Button0 - Search'), 0)

