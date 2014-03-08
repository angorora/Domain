/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

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
public class CashPaymentTest {
    static CashPayment cashPay;
    static CashPayment newcashPay;
    static Calendar today;
    static SimpleDateFormat sdf;
    static String date;
    public CashPaymentTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
          sdf=new SimpleDateFormat("dd-MM-yyyy");
          cashPay=new CashPayment.Builder("122").amount(500)
                                  .payeeId("CN389529")
                                  .eventId("M14567")
                                  .date(sdf.format(today.getTime())).build();
          System.out.println(sdf.format(today.getTime()));
          Assert.assertEquals(cashPay.getDate(), "08-03-2014"," Tested!");
     }
    @Test
    public void testUpdate(){
        newcashPay =new CashPayment.Builder("122").copier(cashPay).amount(344).build();
        Assert.assertEquals(newcashPay.getAmount(), 344, 0.01);
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