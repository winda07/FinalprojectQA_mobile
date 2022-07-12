import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('MP-3 Winda- TC Login Mobile'), [('password') : 'Cem+EfpH8pyspFnCX6ZcKg=='], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Transaction/btn_hamburger'), 0)

Mobile.tap(findTestObject('Transaction/transfer/make_a_transfer'), 0)

Mobile.tap(findTestObject('Transaction/transfer/spinner_sending'), 0)

Mobile.tap(findTestObject('Transaction/transfer/select_dropdown_sending_ts'), 0)

Mobile.tap(findTestObject('Transaction/transfer/input_transfer_amount'), 0)

Mobile.setText(findTestObject('Transaction/transfer/input_transfer_amount'), '50000', 0)

Mobile.tap(findTestObject('Transaction/transfer/spinner_receiving'), 0)

Mobile.tap(findTestObject('Transaction/transfer/select_dropdown_receiving_rey'), 0)

Mobile.tap(findTestObject('Transaction/transfer/confirm_transfer'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[1]')

println('Toast : ' + toast)

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

driver.terminateApp('com.example.mikebanks.bankscorpfinancial')

