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

'Call test case my order'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Order/SC99 Regression/TC01 My Order'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap review customer'
Mobile.tap(findTestObject('Mobile/OR Order/android.widget.Button0 - Review Customer'), 0)

'Delay untuk select rating'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Input review untuk customer'
Mobile.setText(findTestObject('Mobile/OR Order/android.widget.EditText0 (1)'), 'Good Customer', 0)

'Mengirim review'
Mobile.tap(findTestObject('Mobile/OR Order/android.widget.Button0 - Send Review'), 0)

'Berhasil melakukan approval'
Mobile.tap(findTestObject('Mobile/OR Order/android.widget.TextView2 - Close'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

