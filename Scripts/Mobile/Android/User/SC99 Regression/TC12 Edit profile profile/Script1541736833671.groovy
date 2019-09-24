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

'Call test case login'
not_run: WebUI.callTestCase(findTestCase('Mobile/Android/User/SC99 Regression/TC04 Login with email'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap icon profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.ImageView0 - icon profile'), 0)

'Tap area name dan view and edit profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.RelativeLayout3 - nama user'), 0)

'Tap textlink edit profile'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView5 - Edit Profile 2'), 0)

'Clear first name'
Mobile.clearText(findTestObject('Mobile/OR Profile/android.widget.EditText0 - Santi Riham'), 0)

'Input new first name'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText0'), 'Quality', 0)

'Clear last name'
Mobile.clearText(findTestObject('Mobile/OR Profile/android.widget.EditText1 - Wahyuni'), 0)

'Input ne last name'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText1'), 'Assurance', 0)

'Menampilkan list gender'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView5 - Female'), 0)

'Pilih gender male'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView0 - Male'), 0)

'Menampilkan kalender default 17 tahun terakhir'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView7 - 19 Dec 1992'), 0)

'Mundur beberapa bulan'
for (def index : (1..5)) {
    Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.ImageButton0'), 0)
}

'Delay untuk memilih tanggal'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Submit tanggal yang telah dipilih'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.Button1 - OK'), 0)

'Input address'
Mobile.setText(findTestObject('Mobile/OR Profile/android.widget.EditText2 - Enter address here'), 'Jl. AH. Nasution No. 54', 
    0)

'Tap arrow left'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.ImageView0 (1)'), 0)

'Tap button save'
Mobile.tap(findTestObject('Mobile/OR Profile/android.widget.TextView3 - SAVE'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

