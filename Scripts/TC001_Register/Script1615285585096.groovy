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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('automationpractice.com/index.php')

WebUI.click(findTestObject('Landing_screen/sign_in_button'))

WebUI.setText(findTestObject('Login_screen/input_field_Email'), 'katalonatuomationtest98765@gmail.com')

WebUI.click(findTestObject('Login_screen/create_an_registration_button'))

WebUI.click(findTestObject('Registration_screen/input_Mr._id_gender'), FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Registration_screen/input_Mrs._id_gender'))
WebUI.setText(findTestObject('Registration_screen/input__field_customer_firstname'), 'Liton')

WebUI.setText(findTestObject('Registration_screen/input__field_customer_lastname'), 'Hossen')

WebUI.click(findTestObject('Registration_screen/input__email'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registration_screen/input__password'), 'abc12345')

WebUI.selectOptionByValue(findTestObject('Registration_screen/select_date'), '10', false)

WebUI.selectOptionByIndex(findTestObject('Registration_screen/select_month'), 8, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Registration_screen/year_list_selection'), '1985', false)

WebUI.click(findTestObject('Registration_screen/input_-_newsletter'))

//WebUI.setText(findTestObject('Registration_screen/input__firstname'), GlobalVariable.FirstName)
//WebUI.setText(findTestObject('Registration_screen/input_Last name'), GlobalVariable.LastName)
WebUI.setText(findTestObject('Registration_screen/input_CompanyName'), 'Daraz')

WebUI.setText(findTestObject('Registration_screen/input__address1'), 'tornento')

WebUI.setText(findTestObject('Registration_screen/input_Address (Line 2)_address2'), 'ABC1210, USA')

WebUI.setText(findTestObject('Registration_screen/input__city'), 'Nework')

WebUI.selectOptionByIndex(findTestObject('Registration_screen/select_state_statelist'), 3)

WebUI.selectOptionByIndex(findTestObject('Registration_screen/select_Country'), 1)

WebUI.setText(findTestObject('Registration_screen/input__postalcode'), '11111')

WebUI.setText(findTestObject('Registration_screen/input_Additional information_field'), 'This is an additional Information')

WebUI.setText(findTestObject('Registration_screen/input__phone_mobile_field'), '01521147504')

WebUI.click(findTestObject('Registration_screen/submit_Register_button'))

WebUI.verifyElementPresent(findTestObject('Succesful_Registraion_screen/My account_text_field'), 0)

WebUI.verifyElementText(findTestObject('Succesful_Registraion_screen/Welcome_Message'), 'Welcome to your account. Here you can manage all of your personal information and orders.')

WebUI.comment('Registration Successful')

