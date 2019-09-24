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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Front-End/User/SC99 Regression/TC04 Login Biasa with email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.refresh()

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Home/a_Bergabung menjadi Vehicle Ow'))

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/Page_Become Owner/a_Bergabung Menjadi Pemilik Mo'))

WebUI.delay(50)

WebUI.click(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/button_LANJUTKAN'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

CustomKeywords.'WebUICustomKeyword.uploadFile'(findTestObject('Front-End/OR User/OR Login sebagai Owner/Upload Photo Rental'), 
    'C:\\Users\\ALIMSAPUTRA\\Downloads\\Pictures\\JOM\\People\\images.jpg')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche (1)'), 'Belinda Rental')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche_1'), 'slogan')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control'), 'deskripsi')

WebUI.setText(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control_1'), 'ban')

WebUI.sendKeys(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control_1'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Front-End/OR Upload menggunakan Gallery/step 3/input_form-control ng-untouche_2'), 
    0)

WebUI.click(findTestObject('Front-End/OR User/OR Login sebagai Owner/Submit'))

