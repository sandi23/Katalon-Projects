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

'Tap button next'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.ImageView4'), 0)

'Tap button arrow next untuk baca tutorial'
for (def index : (1..2)) {
    Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.ImageView1'), 0)
}

'Tap button skip'
Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.TextView2 - Skip'), 0)

'Tap button login'
Mobile.tap(findTestObject('Mobile/OR Login/android.widget.TextView0 - Log in'), 0)

'Input email user'
Mobile.setText(findTestObject('Mobile/OR Login/android.widget.EditText0'), 'test.wgs01@gmail.com', 0)

'Tap button next'
Mobile.tap(findTestObject('Mobile/OR Login/android.widget.Button0 - Next'), 0)

'Input password user'
Mobile.tap(findTestObject('Mobile/OR Login/android.widget.TextView3 - Login with SMS'), 0, FailureHandling.STOP_ON_FAILURE)

'Delay untuk mengisi verification code kemudian redirect ke homepage'
Mobile.delay(findTestData('Delay Step').getValue(1, 3), FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

