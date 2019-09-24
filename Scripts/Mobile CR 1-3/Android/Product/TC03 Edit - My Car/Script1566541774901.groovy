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

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.ImageView9'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView4 - Edit'), 0)

'Ubah tempat duduk "4 Seats"'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button3 - 6 Seats'), 0)

'Ubah bagasi koper "4 koper"'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button9 - 8 Koper'), 0)

'Tap Next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button11 - NEXT'), 0)

'Ubah stok perwarna "2"'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.EditText0 - 2'), '3', 0)

'input stok perwarna "2"'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.EditText1 - 2'), '3', 0)

'tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button0 - NEXT'), 0)

'tap Tambah Foto stnk'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView4 - Tambah Foto STNK'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.ImageView2 (1)'), 0)

'tap tombol next'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView1 - NEXT'), 0)

'tap tombol NEXT di halaman upload STNK'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button0 - NEXT (1)'), 0)

'tap salah satu tanggal "24, 25, 26"'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView38 - 28'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView39 - 29'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView40 - 30'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button0 - Next (2)'), 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView5 - Car  Driver Basic'), 0)

'Ubah Weekday Price "12000"'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.EditText0 - Rp 100.000'), '20000', 
    0)

'Ubah Weekend Price / National Prices"13000"'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.EditText1 - Rp 10.000'), '40000', 0)

Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.TextView0 - SAVE'), 0)

'Tap tombo NEXT'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button0 - NEXT (3)'), 0)

'Ubah Weekdays discount "10"'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.EditText0 - 10'), '5', 0)

'Ubah Weekend / National holiday discount "20"'
Mobile.setText(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.EditText1 - 20'), '10', 0)

'Tap tombol SIMPAN DAN MULAI SEWA'
Mobile.tap(findTestObject('Mobile CR 1-3/SC99 Regression/Homepage/android.widget.Button0 - SIMPAN DAN MULAI SEWA'), 0)

