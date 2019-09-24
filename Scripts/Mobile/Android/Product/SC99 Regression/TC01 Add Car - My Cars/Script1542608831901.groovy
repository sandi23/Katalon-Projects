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

'Switch to customer mode'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView31 - Switch to customer'), 0)

'Switch to owner mode'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView17 - Switch to vehicle owner'), 0)

'Tap tab my cars'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Tab - My Cars'), 0)

'Tap add new car'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageButton0'), 0)

'Tap dropdown car brand'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText0'), 0)

'Select brand'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Select - Jeep'), 0)

'Delay untuk select brand'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap dropdown car model'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText1'), 0)

'Select model'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Select - Renegade'), 0)

'Delay untuk select model'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap dropdown model years'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText2'), 0)

'Select years'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Select - 2018'), 0)

'Delay untuk select model years'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next'), 0)

'Input plate number'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 - Exp B 1 XXX'), 'D 4 Y', 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (1)'), 0)

'Looping total seats'
for (def index : (1..2)) {
    Mobile.tap(findTestObject('Mobile/OR Product/android.widget.ImageView2 (1)'), 0)
}

'Select transmision'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button3 - Manual'), 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button5 - Next'), 0)

'Select on jika lokasi sama dengan lokasi profil'
not_run: Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Switch0 - OFF'), 0)

'Set location '
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout4'), 0)

'Confirm location'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Confirm'), 0)

'Menampilkan dropdown list city'
Mobile.tap(findTestObject('Mobile/OR Product/TextInputLayout0'), 0)

'Search city by name'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 - Search city'), 'Bandung', 0)

'Select city'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RadioButton0'), 0)

'Simpan kota yang dipilih'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Save (1)'), 0)

'Input complate address (optional)'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText1 (1)'), 'Jl. Soekarno Hatta No. 55', 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (2)'), 0)

'Delay untuk menentukan tanggal not available'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Untuk menampilkan pengaturan tanggal available'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.TextView50 - Advance edit dates'), 0)

'On jika available setiap minggu'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Switch0 - OFF (1)'), 0)

'On jika available hari kerja'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Switch1 - OFF'), 0)

'Menyimpan pengaturan tanggal available'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button2 - Save'), 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (3)'), 0)

'Input additional car rules'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 (1)'), 'Not using narcotics, Not drink alcohol', 
    0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (4)'), 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (5)'), 0)

'Menampilkan jam pick up (from)'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText0 - 0900'), 0)

'Delay untuk menentukan jam pick up (from)'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Menyimpan jam pick up (from) yang telah ditentukan'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button1 - OK'), 0)

'Menampilkan jam pick up (to)'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText1 - 1100'), 0)

'Delay untuk menentukan jam pick up (to)'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Menyimpan jam pick up (to) yang telah ditentukan'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button1 - OK'), 0)

'Menampilkan jam return (from)'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText2 - 1200'), 0)

'Delay untuk menentukan jam return (from)'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Menyimpan jam return (from) yang telah ditentukan'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button1 - OK'), 0)

'Menampilkan jam return (to)'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.EditText3 - 1400'), 0)

'Delay untuk menentukan jam return (to)'
Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Menyimpan jam return (to) yang telah ditentukan'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button1 - OK'), 0)

'Input additional pick up rules'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText4'), 'Nothing else', 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (6)'), 0)

'Input price per kilometer'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 (2)'), '250000', 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (7)'), 0)

'Input price for weekdays'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 (3)'), '2500000', 0)

'Input price for weekends / national holiday'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText1 (2)'), '3000000', 0)

'Tap add specific facilities'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout9'), 0)

'Input book car only with deposit'
Mobile.setText(findTestObject('Mobile/OR Product/android.widget.EditText0 (4)'), '1000000', 0)

'Select car facility life insurance'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout7'), 0)

'Select car facility trash bin'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout9'), 0)

'Select car facility car seat baby'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout11'), 0)

'Select car facility emergency tools'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout13'), 0)

'Menyimpan specific facilities yang telah di select'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Save (2)'), 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (8)'), 0)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (9)'), 0)

'Upload car photo 1'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout3'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 2'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout4'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 3'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout5'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 4'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout6'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 5'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout7 (1)'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload car photo 6'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout8 (1)'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Upload vehicle registration certificate'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout10'), 0)

'Select upload photo from camera'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.RelativeLayout1'), 0)

'Capture photo'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.LinearLayout3'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

'Tap button next untuk ke form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Next (10)'), 0)

'Menyimpan form add car'
Mobile.tap(findTestObject('Mobile/OR Product/android.widget.Button0 - Save (3)'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

