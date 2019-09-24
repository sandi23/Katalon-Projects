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

'Open apps on phone'
Mobile.startApplication('C:\\Users\\WGS-LAP199\\Downloads\\Movic apk\\Movic_0.10.0_2018-12-03-staging-debug.apk', false)

'Tap icon profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.ImageView0'), 0)

'Tap area name dan view and edit profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.LinearLayout12'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView8 - Upload'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView1 - Upload photo from Camera'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.LinearLayout3'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView10 - Upload'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView1 - Upload photo from Camera'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.LinearLayout3'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView12 - Upload'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView1 - Upload photo from Camera'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

