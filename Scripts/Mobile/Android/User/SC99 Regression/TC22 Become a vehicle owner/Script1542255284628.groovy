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

not_run: WebUI.callTestCase(findTestCase('Mobile/Android/User/SC99 Regression/TC04 Login with email'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap icon profile'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.ImageView0'), 0)

'Tap menu become a vehicle owner'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.TextView17 - Become a vehicle owner'), 0)

'Tap button get started untuk memulai pendaftaran sebagai owner'
not_run: Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button1 - Get Started'), 0)

'Tap button next'
not_run: Mobile.tap(findTestObject('Mobile/OR Become Owner/android.widget.Button0 - Next (5)'), 0)

'Tap button resend'
not_run: Mobile.tap(findTestObject('Mobile/OR Become Owner/android.widget.Button0 - Resend'), 0)

'Tap button close'
not_run: Mobile.tap(findTestObject('Mobile/OR Become Owner/android.widget.TextView1 - Close'), 0)

'Delay untuk verify email'
not_run: Mobile.delay(findTestData('Delay Step').getValue(1, 4), FailureHandling.STOP_ON_FAILURE)

'Tap button get started untuk memulai pendaftaran sebagai owner'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button1 - Get Started'), 0)

'Tap ok untuk mengambil foto diri bersama kartu identitas'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Ok'), 0)

'Capture image'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.LinearLayout3'), 0)

'Gunakan gambar yang telah diambil'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Use This Photo'), 0)

'Tap ok untuk mengambil foto sim'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Ok (1)'), 0)

'Capture image'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.LinearLayout3'), 0)

'Gunakan gambar yang telah diambil'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Use This Photo'), 0)

'Tap ok untuk mengambil foto ktp'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Ok (1)'), 0)

'Capture image'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.LinearLayout3'), 0)

'Gunakan gambar yang telah diambil'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Use This Photo'), 0)

'Add photo profile rental'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.ImageView1'), 0)

'Capture image'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.LinearLayout3'), 0)

'Tap button next untuk mengisi form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Next'), 0)

'Input car rental name'
Mobile.setText(findTestObject('Mobile/OR Become a vehicle owner/android.widget.EditText0'), 'QA Rentals', 0)

'Check ketersediaan nama rental'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.TextView2 - Check'), 0)

'Tap button next untuk mengisi form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Next'), 0)

'Menentukan lokasi rental'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.LinearLayout3 (1)'), 0)

'Mengkonfirmasi lokasi rental'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Confirm'), 0)

'Menampilkan form city'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.EditText0 (1)'), 0, FailureHandling.STOP_ON_FAILURE)

'Searching city'
Mobile.setText(findTestObject('Mobile/OR Become a vehicle owner/android.widget.EditText0 - Search city'), 'Bandung', 0)

'Select city'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.RelativeLayout3'), 0)

'Tap button save untuk menyimpan pilihan city'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Save'), 0)

'Input alamat lengkap lokasi rental'
Mobile.setText(findTestObject('Mobile/OR Become a vehicle owner/android.widget.EditText1 (1)'), 'Jl. AH. Nasution No. 55', 
    0)

'Tap button next untuk mengisi form selanjutnya'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Next'), 0)

'Input slogan'
Mobile.setText(findTestObject('Mobile/OR Become a vehicle owner/android.widget.EditText0 (3)'), 'Prioritas Qualitas', 0)

'Input description'
Mobile.setText(findTestObject('Mobile/OR Become a vehicle owner/android.widget.EditText1 (2)'), 'Rental Milik QA Group', 
    0)

'Tap button next untuk submit form registrasi owner'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Next'), 0)

'Memulai sebagai owner'
Mobile.tap(findTestObject('Mobile/OR Become a vehicle owner/android.widget.Button0 - Got It'), 0)

Mobile.delay(findTestData('Delay Step').getValue(1, 2), FailureHandling.STOP_ON_FAILURE)

