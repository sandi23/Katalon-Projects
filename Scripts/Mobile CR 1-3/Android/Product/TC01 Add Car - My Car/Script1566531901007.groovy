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

'Tap Icon Add Car'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageButton0'), 0)

'Pilih merk kendaraan \'Daihatsu\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView3 - Pilih merek Kendaraan'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.RelativeLayout5'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE'), 0)

'Pilih model kendaraan \'Sigra\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView5 - Pilih model Kendaraan'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.RelativeLayout5'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE'), 0)

'Pilih tempat duduk \'4\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button1 - 4 Seats'), 0)

'Pilih bagasi koper \'4\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button7 - 4 Koper'), 0)

'Klik tombol Next/Lanjutkan'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button11 - NEXT'), 0)

'Input stok kendaraan \'2\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText0 - 0'), '2', 0)

'Pilih varian warna \'biru & coklat\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView5 - Pilih warna kendaraan'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.RelativeLayout4'), 0)

'tap mbol save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - Save'), 0)

'Input stok per warna \'2\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText1 - 0'), '1', 0)

'Upload photo kendaraan'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView10 - Upload foto kendaraan'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView3'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView4'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView5'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView6'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView7'), 0)

'Tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView1 - NEXT'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - NEXT'), 0)

'Pada pop up foto stnk kendaraan tap tombol ok'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.ImageView3'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView1 - NEXT'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView33 - 23'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - Next (2)'), 0)

'Pilih paket car + driver'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.RelativeLayout6'), 0)

'input harga hari kerja \'100000\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText0 - Rp 0'), '100000', 0)

'Input harga hari libur / hari besar \'10000\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText1 - Rp 0'), '10000', 0)

'Tap tombol save \'bagian atas halaman\''
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.TextView0 - SAVE'), 0)

'tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - NEXT (3)'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.RadioButton0'), 0)

'Input weekdays discount \'30\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText0 - Weekdays discount'), '10', 
    0)

'Weekend / national holiday discount \'20\''
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.EditText1 - Weekends  national holiday discount'), 
    '20', 0)

'Klik tombol save'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Product/android.widget.Button0 - SIMPAN DAN MULAI SEWA'), 0)

