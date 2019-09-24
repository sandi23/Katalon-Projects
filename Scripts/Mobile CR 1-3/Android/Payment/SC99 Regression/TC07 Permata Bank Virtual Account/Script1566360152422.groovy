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

'Call test case select payment method'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/Payment/SC99 Regression/TC04 Select payment method'), [:], FailureHandling.STOP_ON_FAILURE)

'Select payment via permatabank'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.FrameLayout4'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

'Scroll to hubungi kami'
Mobile.scrollToText('Hubungi kami.', FailureHandling.STOP_ON_FAILURE)

'Tap button i have sent payment'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.Button0 - I have sent payment'), 0)

'Close information'
Mobile.tap(findTestObject('Mobile/OR Payment/android.widget.ImageView0'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

