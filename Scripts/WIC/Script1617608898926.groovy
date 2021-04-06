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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

String randomalfabet = (('a'..'z') + ('A'..'Z')).join()

String randomsmallalfabet = ('a'..'z').join()

String randomalfabetnomor = ((('a'..'z') + ('A'..'Z')) + ('0'..'9')).join()

String randomnomor = ('0'..'9').join()

String symbol = ('!'..')').join()

Integer lengthp = 12

Integer lengthn = 256

String symbol1 = RandomStringUtils.random(lengthp, symbol.toCharArray())

String Stringalfabetp = RandomStringUtils.random(lengthp, randomalfabet.toCharArray())

String Stringsmallalfabetp = RandomStringUtils.random(lengthp, randomsmallalfabet.toCharArray())

String Stringalfabetnomorp = RandomStringUtils.random(lengthp, randomalfabetnomor.toCharArray())

String Stringnomorp = RandomStringUtils.random(lengthp, randomnomor.toCharArray())

String Stringalfabetn = RandomStringUtils.random(lengthn, randomalfabet.toCharArray())

String Stringalfabetnomorn = RandomStringUtils.random(lengthn, randomalfabetnomor.toCharArray())

String Stringnomorn = RandomStringUtils.random(lengthn, randomnomor.toCharArray())

WebUI.openBrowser('http://goaml.southeastasia.cloudapp.azure.com/goaml/Default.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ALL/Page_Log in/Username'), 'sysadmin')

WebUI.setEncryptedText(findTestObject('ALL/Page_Log in/Password'), 'h1bZaoNZrXJGImBBMGIoZQ==')

WebUI.sendKeys(findTestObject('ALL/Page_Log in/Password'), Keys.chord(Keys.ENTER))

for (def rowNum = 1; rowNum <= findTestData('WIC data files').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('ALL/Page_/Filter'), 'wic')

    WebUI.delay(1)

    WebUI.click(findTestObject('WIC/View'))

    WebUI.click(findTestObject('ALL/Page_/Add New Record'))

    if (findTestData('WIC data files').getValue(1, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/01 WIC No'), Stringnomorp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/01 WIC No'), Stringnomorn)
    }
    
    WebUI.delay(3)

    WebUI.setText(findTestObject('WIC/Individu/01/02 Jenis Kelamin'), 'male')

    WebUI.delay(3)

    WebUI.sendKeys(findTestObject('WIC/Individu/01/02 Jenis Kelamin'), Keys.chord(Keys.ENTER))

    if (findTestData('WIC data files').getValue(2, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/03 Gelar'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/03 Gelar'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(3, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/04 Nama Lengkap'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/04 Nama Lengkap'), Stringalfabetn)
    }
    
    WebUI.sendKeys(findTestObject('WIC/Individu/01/05 Tanggal Lahir'), '4/7/1999')

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('WIC/Individu/01/05 Tanggal Lahir'), Keys.chord(Keys.ENTER))

    if (findTestData('WIC data files').getValue(4, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/06 Tempat Lahir'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/06 Tempat Lahir'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(5, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/07 Nama Ibu Kandung'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/07 Nama Ibu Kandung'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(6, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/08 Nama Alias'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/08 Nama Alias'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(7, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/09 NIK'), Stringnomorp + 9999)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/09 NIK'), Stringnomorn + 9999)
    }
    
    if (findTestData('WIC data files').getValue(8, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/10 No Passport'), 9999 + Stringnomorp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/10 No Passport'), 9999 + Stringnomorn)
    }
    
    if (findTestData('WIC data files').getValue(9, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/12 No Identitas Lain'), Stringnomorp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/01/12 No Identitas Lain'), Stringnomorn)
    }
    
    if (findTestData('WIC data files').getValue(10, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/01 Email 1'), (Stringsmallalfabetp + Stringnomorp) + '@gmail.com')
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/01 Email 1'), (Stringsmallalfabetp + Stringnomorn) + '@gmail.com')
    }
    
    if (findTestData('WIC data files').getValue(11, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/02 Email 2'), (Stringsmallalfabetp + Stringnomorp) + '@gmail.com')
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/02 Email 2'), (Stringsmallalfabetp + Stringnomorn) + '@gmail.com')
    }
    
    if (findTestData('WIC data files').getValue(12, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/03 Email 3'), (Stringsmallalfabetp + Stringnomorp) + '@gmail.com')
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/03 Email 3'), (Stringsmallalfabetp + Stringnomorn) + '@gmail.com')
    }
    
    if (findTestData('WIC data files').getValue(13, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/04 Email 4'), (Stringsmallalfabetp + Stringnomorp) + '@gmail.com')
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/04 Email 4'), (Stringsmallalfabetp + Stringnomorn) + '@gmail.com')
    }
    
    if (findTestData('WIC data files').getValue(14, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/05 Email 5'), (Stringsmallalfabetp + Stringnomorp) + '@gmail.com')
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/05 Email 5'), (Stringsmallalfabetp + Stringnomorn) + '@gmail.com')
    }
    
    if (findTestData('WIC data files').getValue(15, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/06 Pekerjaan'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/06 Pekerjaan'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(16, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/07 Tempat Bekerja'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/04/07 Tempat Bekerja'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(17, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/08/01 NPWP'), Stringnomorp + 111)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/08/01 NPWP'), Stringnomorn + 111)
    }
    
    if (findTestData('WIC data files').getValue(18, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/08/02 Sumber Dana'), Stringalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/08/02 Sumber Dana'), Stringalfabetn)
    }
    
    if (findTestData('WIC data files').getValue(19, rowNum) == 'positive') {
        WebUI.sendKeys(findTestObject('WIC/Individu/08/03 Catatan'), Stringalfabetp + Stringsmallalfabetp)
    } else {
        WebUI.sendKeys(findTestObject('WIC/Individu/08/03 Catatan'), Stringalfabetn + 999)
    }
    
    WebUI.delay(2)

    WebUI.click(findTestObject('ALL/save'))

    WebUI.delay(8)

    WebUI.takeScreenshot(('D:\\screenshot\\goaml\\WIC\\' + findTestData('WIC data files').getValue(20, rowNum)) + '.png')

    WebUI.refresh()

    WebUI.delay(2)
}

