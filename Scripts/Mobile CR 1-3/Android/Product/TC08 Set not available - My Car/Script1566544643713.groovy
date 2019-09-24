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

'tap menu Stok Availability'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView8 - Stock Availability'), 0)

'kurangi jumlah stok available'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText0 - 1'), '0', 0)

Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText1 - 1'), '0', 0)

'tap tombol save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button1 - Save'), 0)

