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
Mobile.startApplication('C:\\Users\\WGS-LAP199\\Downloads\\Movic apk\\Movic_0.9.7_2018-10-14-stable-debug.apk', false)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.LinearLayout12'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView5 - Edit Profile'), 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView16 - Change email address'), 0)

Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText0 (4)'), 'santi.wahyuni@wgs.co.id', 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.EditText1 (5)'), 0)

Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText1 (5)'), 'P@ssword789', 0)

Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.Button0 - Save'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

