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

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.TextView8 - estes balga'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.Button1 - Add Driver'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.ImageView2 (3)'), 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.EditText0 (2)'), 'nandang', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.EditText1 (1)'), '08123123123', 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Angpur/android.widget.Button0 - Submit'), 0)

