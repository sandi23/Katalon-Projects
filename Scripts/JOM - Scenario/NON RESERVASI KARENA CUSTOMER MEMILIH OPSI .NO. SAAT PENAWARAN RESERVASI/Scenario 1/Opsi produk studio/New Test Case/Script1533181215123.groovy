import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

switch (pilihSkenario) {
    case 1:
        WebUI.callTestCase(findTestCase('JOM - Scenario/NON RESERVASI KARENA CUSTOMER MEMILIH OPSI .NO. SAAT PENAWARAN RESERVASI/Scenario 1/Opsi produk studio/1. Order foto studio - non reservasi'), 
            [:], FailureHandling.OPTIONAL)

        break
    case 2:
        WebUI.callTestCase(findTestCase('JOM - Scenario/NON RESERVASI KARENA CUSTOMER MEMILIH OPSI .NO. SAAT PENAWARAN RESERVASI/Scenario 1/Opsi produk studio/2. Order foto studio - reservasi'), 
            [:], FailureHandling.OPTIONAL)

        break
    case 3:
        WebUI.callTestCase(findTestCase('JOM - Scenario/NON RESERVASI KARENA CUSTOMER MEMILIH OPSI .NO. SAAT PENAWARAN RESERVASI/Scenario 1/Opsi produk studio/3. Order Printing Eceran - diambil di store'), 
            [:], FailureHandling.OPTIONAL)

        break
    case 4:
        WebUI.callTestCase(findTestCase('JOM - Scenario/NON RESERVASI KARENA CUSTOMER MEMILIH OPSI .NO. SAAT PENAWARAN RESERVASI/Scenario 1/Opsi produk studio/4. Order Printing Eceran - dikirim ke alamat customer'), 
            [:], FailureHandling.OPTIONAL)

        break
    case 5:
        WebUI.callTestCase(findTestCase('JOM - Scenario/NON RESERVASI KARENA CUSTOMER MEMILIH OPSI .NO. SAAT PENAWARAN RESERVASI/Scenario 1/Opsi produk studio/5. Order Printing Paket - diambil di store'), 
            [:], FailureHandling.OPTIONAL)

        break
    case 6:
        WebUI.callTestCase(findTestCase('JOM - Scenario/NON RESERVASI KARENA CUSTOMER MEMILIH OPSI .NO. SAAT PENAWARAN RESERVASI/Scenario 1/Opsi produk studio/6. Order Printing Paket - dikirim ke alamat customer'), 
            [:], FailureHandling.OPTIONAL)

        break
}

