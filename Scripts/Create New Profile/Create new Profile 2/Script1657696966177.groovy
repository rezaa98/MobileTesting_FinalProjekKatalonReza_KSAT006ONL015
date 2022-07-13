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

Mobile.comment('Start App')

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Landing Screen Page/Body Landing Page/btn_CREATE A PROFILE'), 0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Body Landing Page/btn_CREATE A PROFILE'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Landing Screen Page/Body Landing Page/btn_CREATE A PROFILE'), 0)

Mobile.comment('Verif that object is existing')

Mobile.waitForElementPresent(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - First Name'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - First Name'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Last Name'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Country'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Username'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Password'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Confirm Password'), 
    0)

Mobile.verifyElementVisible(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.TextView - Create Profile'), 
    0)

Mobile.comment('set firstname')

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - First Name'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - First Name'), firstName, 
    0)

Mobile.comment('set lastname')

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Last Name'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Last Name'), LastNama, 
    0)

Mobile.comment('Set Country')

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Country'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Country'), Country, 
    0)

Mobile.comment('set Username')

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Username'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Username'), username, 
    0)

Mobile.comment('setPassword')

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Password'), password, 
    0)

WebUI.comment('setConfirmPass')

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Confirm Password'), 0)

Mobile.setText(findTestObject('Landing Screen Page/Create Profile Page/Body/android.widget.EditText - Confirm Password'), 
    confirmpassword, 0)

Mobile.tap(findTestObject('Landing Screen Page/Create Profile Page/Body/btn_Create Profile'), 0)

Mobile.verifyElementNotExist(findTestObject('Landing Screen Page/Body Landing Page/btn_CREATE A PROFILE'), 0)

Mobile.closeApplication()

