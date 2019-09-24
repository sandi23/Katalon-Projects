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

not_run: Mobile.startApplication('C:\\Users\\WGS-LAP199\\Downloads\\Movic apk\\Movic_0.10.0_2018-12-03-staging-debug.apk', 
    true)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap icon profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.ImageView0'), 0)

'Tap area name dan view and edit profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.LinearLayout12'), 0)

'Tap textlink edit profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView5 - Edit Profile'), 0)

'Scroll to text bank account'
Mobile.scrollToText('Bank account', FailureHandling.STOP_ON_FAILURE)

'Tap add untuk menampilkan form input add bank account'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView18 - Add'), 0)

'Menampilkan dropdown select bank account'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.EditText0 - Select bank account'), 0)

'Delay untuk select bank account'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Input account name'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText1 (7)'), 'Santi Riham Wahyuni', 0)

'Input account number'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText2 (2)'), '0088008800', 0)

'Input branch'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText3'), 'Gold Card', 0)

'Input password account user'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText4'), 'P@ssword123', 0)

'Tap button next untuk submit form'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.Button0 - Next (1)'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

