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

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.TextView4 - Edit (2)'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.TextView6 - Add another person insurance'), 
    0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.CheckedTextView0 - Title'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.CheckedTextView1 - Mr.'), 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.EditText0 - Full Name'), 'test nan', 
    0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.EditText3 - Day'), '21', 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.EditText4 - Year'), 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.EditText2 - Year'), '2001', 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Booking/android.widget.Button0 - Save (4)'), 0)

