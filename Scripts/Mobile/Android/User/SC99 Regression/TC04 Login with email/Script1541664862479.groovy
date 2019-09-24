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
Mobile.startApplication('C:\\Users\\WGS-LAP151\\Downloads\\Movic_1.2.0_2019-02-04-stable-debug.apk', false)

Mobile.tap(findTestObject('Mobile/OR Homepage/OBJ-Login/android.widget.TextView2 - English'), 0)

'Tap button next'
Mobile.tap(findTestObject('Mobile/OR Homepage/OBJ-Login/android.widget.ImageView4'), 0)

'Tap button arrow next untuk baca tutorial'
for (def index : (1..2)) {
    Mobile.tap(findTestObject('Mobile/OR Registrasi/android.widget.ImageView1'), 0)
}

'Tap button skip'
Mobile.tap(findTestObject('Mobile/OR Homepage/OBJ-Login/android.widget.TextView2 - Skip'), 0)

'Tap button login'
Mobile.tap(findTestObject('Mobile/OR Homepage/OBJ-Login/android.widget.TextView0 - Log in'), 0)

'Input email user'
Mobile.setText(findTestObject('Mobile/OR Login/android.widget.EditText0'), 'nansulaiman5@gmail.com', 0)

'Tap tombol lanjutkan seharusnya next Eng'
Mobile.tap(findTestObject('Mobile/OR Login 2/android.widget.Button0 - Lanjutkan 03'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Input password user'
Mobile.setText(findTestObject('Mobile/OR Login 2/android.widget.EditText0 - field password'), 'password8', 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Hide keyboard on phone'
Mobile.hideKeyboard()

'Submit form dan redirect ke homepage'
Mobile.tap(findTestObject('Mobile/OR Login 2/android.widget.Button0 - Start Movic 01'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

