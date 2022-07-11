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

Mobile.startExistingApplication(GlobalVariable.AppID, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Authentication/btn_create_a_profile'), 0)

Mobile.tap(findTestObject('Authentication/first_name'), 0)

Mobile.setText(findTestObject('Authentication/first_name'), 'akunnn', 0)

Mobile.tap(findTestObject('Authentication/last_name'), 0)

Mobile.setText(findTestObject('Authentication/last_name'), 'testtt', 0)

Mobile.tap(findTestObject('Authentication/country'), 0)

Mobile.setText(findTestObject('Authentication/country'), 'Indonesia', 0)

Mobile.tap(findTestObject('Authentication/username'), 0)

Mobile.setText(findTestObject('Authentication/username'), 'akuntestlagi', 0)

Mobile.tap(findTestObject('Authentication/password'), 0)

Mobile.setEncryptedText(findTestObject('Authentication/password'), password, 0)

Mobile.tap(findTestObject('Authentication/confirm_password'), 0)

Mobile.setEncryptedText(findTestObject('Authentication/confirm_password'), confirm_password, 0)

Mobile.tap(findTestObject('Authentication/btn_create_profile'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementByXPath('//android.widget.Toast[@text=\'Account Successfully Created\']')

println('Toast : ' + toast)

if (toast == null) {
    KeywordUtil.markFailed('ERROR: Toast object not found!')
}

