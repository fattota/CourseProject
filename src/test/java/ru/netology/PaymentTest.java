package ru.netology;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import lombok.val;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.mode.DBHelper;
import ru.netology.mode.DataHelper;
import ru.netology.web.page.OrderPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PaymentTest {
    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }


    @BeforeEach
    void setUp() {
        open("http://localhost:8080");
    }

    @BeforeEach
    void deletingDataFromTheDb() {
        DBHelper.deletingData();
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }


    // №1
    @Test
    public void shouldPaymentApprovedCard() {
        val cardInfo = new DataHelper().getValidCardInfo();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getButtonSendARequest();
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val creditStatus = DBHelper.getCreditStatus();
        val paymentID = DBHelper.getPaymentId();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }


    // №2
    @Test
    public void shouldPaymentApprovedCardOwnerNameWithoutSpace() {
        val cardInfo = new DataHelper().getInfoWithNameWithoutSpace();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getButtonSendARequest();
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №3
    @Test
    public void shouldPaymentApprovedCardOwnerNameInLatinWithAHyphen() {
        val cardInfo = new DataHelper().getInfoNameInLatinWithAHyphen();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getButtonSendARequest();
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №4
    @Test
    public void shouldPaymentApprovedCardOwnerNameInLatinWithADot() {
        val cardInfo = new DataHelper().getInfoNameInLatinWithADot();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getButtonSendARequest();
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №5
    @Test
    public void shouldPaymentApprovedCardOwnerNameToUpperCase() {
        val cardInfo = new DataHelper().getInfoNameToUpperCase();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getButtonSendARequest();
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №6
    @Test
    public void shouldGetAnErrorApprovedCardOwnerNameToLowerCase() {
        val cardInfo = new DataHelper().getInfoNameToLowerCase();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }


    // №7
    @Test
    public void shouldRefuseToSubmitAnEmptyForm() {
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.clickButtonContinue();
        val paymentStatus = DBHelper.getPaymentStatus();
        val creditStatus = DBHelper.getCreditStatus();
        paymentPage.getErrorNotificationCardNumberRequired();
        paymentPage.getErrorNotificationMonthRequired();
        paymentPage.getErrorNotificationYearRequired();
        paymentPage.getErrorNotificationOwnerRequired();
        paymentPage.getErrorNotificationCVCRequired();
        assertNull(paymentStatus);
        assertNull(creditStatus);
    }

    // №8
    @Test
    public void shouldGetErrorApprovedCardEmptyCVC() {
        val cardInfo = new DataHelper().getInfoEmptyCVC();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationCVCRequired();
        paymentPage.notGetErrorNotificationCardNumberRequired();
        paymentPage.notGetErrorNotificationMonthRequired();
        paymentPage.notGetErrorNotificationYearRequired();
        paymentPage.notGetErrorNotificationOwnerRequired();
        paymentPage.notGetWrongFormatMonthField();
        paymentPage.notGetWrongFormatOwnerField();
        paymentPage.notGetWrongFormatYearField();
        val transactionId = DBHelper.getTransactionId();
        val creditStatus = DBHelper.getCreditStatus();
        val paymentID = DBHelper.getPaymentId();
        assertNull(transactionId);
        assertNull(creditStatus);
    }

    // №9
    @Test
    public void shouldGetErrorApprovedCardEmptyOwner() {
        val cardInfo = new DataHelper().getInfoEmptyOwner();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationOwnerRequired();
        paymentPage.notGetErrorNotificationCardNumberRequired();
        paymentPage.notGetErrorNotificationMonthRequired();
        paymentPage.notGetErrorNotificationYearRequired();
        paymentPage.notGetErrorNotificationCVCRequired();
        paymentPage.notGetWrongFormatYearField();
        paymentPage.notGetWrongFormatMonthField();
        val transactionId = DBHelper.getTransactionId();
        val creditStatus = DBHelper.getCreditStatus();
        val paymentID = DBHelper.getPaymentId();
        assertNull(transactionId);
        assertNull(creditStatus);
    }

    // №10
    @Test
    public void shouldGetErrorApprovedCardEmptyMonth() {
        val cardInfo = new DataHelper().getInfoEmptyMonth();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationMonthRequired();
        paymentPage.notGetErrorNotificationCardNumberRequired();
        paymentPage.notGetErrorNotificationOwnerRequired();
        paymentPage.notGetErrorNotificationYearRequired();
        paymentPage.notGetErrorNotificationCVCRequired();
        paymentPage.notGetWrongFormatYearField();
        paymentPage.notGetWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val creditStatus = DBHelper.getCreditStatus();
        val paymentID = DBHelper.getPaymentId();
        assertNull(transactionId);
        assertNull(creditStatus);
    }

    // №11
    @Test
    public void shouldGetErrorApprovedCardEmptyYear() {
        val cardInfo = new DataHelper().getInfoEmptyYear();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationYearRequired();
        paymentPage.notGetErrorNotificationCardNumberRequired();
        paymentPage.notGetErrorNotificationOwnerRequired();
        paymentPage.notGetErrorNotificationMonthRequired();
        paymentPage.notGetErrorNotificationCVCRequired();
        paymentPage.notGetWrongFormatMonthField();
        paymentPage.notGetWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val creditStatus = DBHelper.getCreditStatus();
        val paymentID = DBHelper.getPaymentId();
        assertNull(transactionId);
        assertNull(creditStatus);
    }

    //Тест №12
    @Test
    public void shouldGetAnErrorApprovedCardNameInCyrillic() {
        val cardInfo = new DataHelper().getInfoNameInCyrillic();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №13
    @Test
    public void shouldGetAnErrorApprovedCardNameInHieroglyphs() {
        val cardInfo = new DataHelper().getInfoHieroglyphsName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №14
    @Test
    public void shouldGetAnErrorApprovedCardNameNumbers() {
        val cardInfo = new DataHelper().getInfoNumbersName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №15
    @Test
    public void shouldGetAnErrorApprovedCardNameNonNumericNonAlphabetic() {
        val cardInfo = new DataHelper().getInfoNonNumericNonAlphabeticName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №16
    @Test
    public void shouldPaymentApprovedCardNameBeginningSpace() {
        val cardInfo = new DataHelper().getInfoLatinNameBeginningSpace();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        val actualValueOwner = paymentPage.getValueOwner();
        val expectedValueOwner = cardInfo.getOwner().trim();

        paymentPage.getNotificationOk();

        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals(expectedValueOwner, actualValueOwner);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №17
    @Test
    public void shouldPaymentApprovedCardNameWith3Letter() {
        val cardInfo = new DataHelper().getInfoWithLatin3LetterName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №18
    @Test
    public void shouldErrorOwnerFieldApprovedCardNameWith2Letter() {
        val cardInfo = new DataHelper().getInfoWithLatin2LetterName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatOwnerField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №19
    @Test
    public void shouldPaymentApprovedCardNameWith4Letter() {
        val cardInfo = new DataHelper().getInfoWithLatin4LetterName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №20
    @Test
    public void shouldPaymentApprovedCardNameWith21Letter() {
        val cardInfo = new DataHelper().getInfoWithLatin21LetterName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №21
    @Test
    public void shouldPaymentApprovedCardNameWith22Letter() {
        val cardInfo = new DataHelper().getInfoWithLatin22LetterName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        val actualValueOwner = paymentPage.getValueOwner();
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("Vladisolav Pozsharskiy", actualValueOwner);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    //Тест №22
    @Test
    public void shouldPaymentApprovedCardNameWith20Letter() {
        val cardInfo = new DataHelper().getInfoWithLatin20LetterName();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №23
    @Test
    public void shouldErrorApprovedCardLastMonth() {
        val cardInfo = new DataHelper().getInfoLastMonth();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatMonthField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №24
    @Test
    public void shouldPaymentApprovedCardCurrentMonth() {
        val cardInfo = new DataHelper().getInfoCurrentMonth();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №25
    @Test
    public void shouldErrorApprovedCardNonExistentMonth() {
        val cardInfo = new DataHelper().getInfoNonExistentMonth();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatMonthField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №26
    @Test
    public void shouldErrorApprovedCard00Month() {
        val cardInfo = new DataHelper().getInfo00Month();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatMonthField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №27
    @Test
    public void shouldPaymentApprovedCardNegativeMonth() {
        val cardInfo = new DataHelper().getInfoNegativeMeaningMonth();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val actualValueMonth = paymentPage.getValueMonth();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("01", actualValueMonth);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №28
    @Test
    public void shouldPaymentApprovedCardMonthBeginningSpace() {
        val cardInfo = new DataHelper().getInfoMonthBeginningSpace();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val actualValueMonth = paymentPage.getValueMonth();
        val expectedValueMonth = cardInfo.getMonth().trim();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals(expectedValueMonth, actualValueMonth);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №29
    @Test
    public void shouldPaymentApprovedCardMonthWithASpaceInTheMiddle() {
        val cardInfo = new DataHelper().getInfoMonthSpaceInTheMiddle();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val actualValueMonth = paymentPage.getValueMonth();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("07", actualValueMonth);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №30
    @Test
    public void shouldErrorApprovedCardMonthNonAlphabeticCharacters() {
        val cardInfo = new DataHelper().getInfoMonthNonAlphabetic();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationMonthRequired();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №31
    @Test
    public void shouldErrorApprovedCardMonthLetters() {
        val cardInfo = new DataHelper().getInfoMonthLetters();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №32
    @Test
    public void shouldErrorApprovedCardLastYear() {
        val cardInfo = new DataHelper().getInfoLastYear();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongCardExpiredYearField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №33
    @Test
    public void shouldErrorApprovedCardUnrealYear() {
        val cardInfo = new DataHelper().getInvalidCardInfoUnrealYear();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatYearField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №34
    @Test
    public void shouldErrorApprovedCard00Year() {
        val cardInfo = new DataHelper().getInfo00Year();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongCardExpiredYearField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №35
    @Test
    public void shouldPaymentApprovedCardNegativeNumberYear() {
        val cardInfo = new DataHelper().getInfoNegativeNumberYear();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val actualValueYear = paymentPage.getValueYear();
        val expectedValueYear = cardInfo.getYear().substring(1);
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals(expectedValueYear, actualValueYear);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №36
    @Test
    public void shouldErrorApprovedCardPlus6Year() {
        val cardInfo = new DataHelper().getInfoYearPlus6();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getWrongFormatYearField();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // № 37
    @Test
    public void shouldPaymentApprovedCardPlus5Year() {
        val cardInfo = new DataHelper().getInfoYearPlus5();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №38
    @Test
    public void shouldPaymentApprovedCardPlus4Year() {
        val cardInfo = new DataHelper().getInfoYearPlus4();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №39
    @Test
    public void shouldErrorApprovedCardNonAlphabeticYear() {
        val cardInfo = new DataHelper().getInfoYearNonAlphabetic();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationYearRequired();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №40
    @Test
    public void shouldErrorApprovedCardAlphabeticYear() {
        val cardInfo = new DataHelper().getInfoLettersYear();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationYearRequired();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №41
    @Test
    public void shouldErrorApprovedCardNonAlphabeticCVC() {
        val cardInfo = new DataHelper().getInfoCVCNonAlphabetic();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationCVCRequired();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №42
    @Test
    public void shouldErrorApprovedCardWithLettersCVC() {
        val cardInfo = new DataHelper().getInfoWithLettersCVC();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationCVCRequired();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №43
    @Test
    public void shouldErrorApprovedCard2NumbersCVC() {
        val cardInfo = new DataHelper().getInfoWith2NumbersCVC();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getErrorNotificationCVCRequired();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertNull(transactionId);
        assertNull(paymentID);
        assertNull(creditStatus);
    }

    // №44
    @Test
    public void shouldPaymentApprovedCard4NumbersCVC() {
        val cardInfo = new DataHelper().getInfoWith4NumbersCVC();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationOk();
        val actualValueCVC = paymentPage.getValueCVC();
        val expectedValueCVC = paymentPage.removeLastChar(cardInfo.getCvc());
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val paymentID = DBHelper.getPaymentId();
        val creditStatus = DBHelper.getCreditStatus();
        assertEquals(expectedValueCVC, actualValueCVC);
        assertEquals("APPROVED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }

    // №45
    @Test
    public void shouldDeniedPurchaseDeclinedCard() {
        val cardInfo = new DataHelper().getInvalidCardInfo();
        val paymentPage = new OrderPage().getPaymentPage();
        paymentPage.fillingOutTheForm(cardInfo);
        paymentPage.getNotificationError();
        val paymentStatus = DBHelper.getPaymentStatus();
        val transactionId = DBHelper.getTransactionId();
        val creditStatus = DBHelper.getCreditStatus();
        val paymentID = DBHelper.getPaymentId();
        assertEquals("DECLINED", paymentStatus);
        assertEquals(transactionId, paymentID);
        assertNull(creditStatus);
    }
}
