/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

import static cput.codez.angorora.eventstar.model.CashPaymentTest.today;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author allen
 */
public class CardPaymentTest {
    static CardPayment cardPay;
    static CardPayment newcardPay;
    static Calendar today;
    static SimpleDateFormat sdf;
    public CardPaymentTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
         sdf= new SimpleDateFormat("dd MM yyyy");
         cardPay=new CardPayment.Builder("123456789").id("5")
                                .amount(600)
                                .date(sdf.format(today.getTime()))
                                .eventId("Me345")
                                .payeeId("CN389529").build();
         Assert.assertEquals(cardPay.getPayeeId(), "CN389529", "Tested!");
     }
    @Test
     public void testUpdate(){
      newcardPay=new CardPayment.Builder("123456789").copier(cardPay).eventId("Co345").build();
      Assert.assertEquals(newcardPay.getEventId(),"Co345", "! Tested");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
           today=new GregorianCalendar();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}