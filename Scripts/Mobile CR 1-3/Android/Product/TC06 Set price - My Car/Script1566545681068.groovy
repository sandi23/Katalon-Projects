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

'Tap Set price'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView6 - Set price'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView3 - Car Only'), 0)

'Update price'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText0 - Rp 10'), '100000', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText1 - Rp 20'), '20000', 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE (1)'), 0)

'Tap Save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE (2)'), 0)

