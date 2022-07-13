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

Mobile.comment('call test case')

Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Menu Page/btn_Left menu'), GlobalVariable.timeOut)

Mobile.tap(findTestObject('Menu Page/Menu Left Side Bar/Body/android.widget.CheckedTextView - Make a Transfer'), GlobalVariable.timeOut)

Mobile.verifyElementVisible(findTestObject('Transfer Page/Body Page/Sending account/android.widget.TextView - Select Sending Account'), 
    0)

Mobile.verifyElementVisible(findTestObject('Transfer Page/Body Page/Sending account/spinner_Sending account'), 0)

Mobile.verifyElementVisible(findTestObject('Transfer Page/Body Page/btn_Confirm Transfer'), 0)

Mobile.tap(findTestObject('Transfer Page/Body Page/Sending account/android.widget.EditText - Transfer Amount'), 0)

Mobile.setText(findTestObject('Transfer Page/Body Page/Sending account/android.widget.EditText - Transfer Amount'), ValuetoTransfer, 
    0)

//======================
// Before transfer money
//======================
String receiver = Mobile.getText(findTestObject('Transfer Page/Body Page/Receiving account Page/text_Spinner receiving acccount'), 
    0)

String sender = Mobile.getText(findTestObject('Transfer Page/Body Page/Sending account/spinner_Sending account'), 0)

//======================
// After transfer money
//======================
Mobile.tap(findTestObject('Transfer Page/Body Page/btn_Confirm Transfer'), 0, FailureHandling.STOP_ON_FAILURE)

