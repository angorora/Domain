/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

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
public class ContactCardTest {
    static ContactCard cont;
    static ContactCard newCont;
    static Address addr;
    public ContactCardTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
         cont= new ContactCard.Builder("allen.ngorora@gmail.com").address("2").cellNumber("0840472266")
                                                                .id("3").website("coolProject@mkoma.ac.za")
                                                                .telNo("02068242").build();
         Assert.assertEquals(cont.getCellNumber(), "0840472266");
         Assert.assertEquals(cont.getWebsite(), "coolProject@mkoma.ac.za");
     }
    @Test
    public void testUpdate(){
        newCont=new ContactCard.Builder("allen.ngorora@gmail.com").copier(cont).telNo(null).build();
        Assert.assertNull(newCont.getTelNo());
        System.out.println(newCont.getCellNumber());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        addr= new Address.Builder("7925").id("2").hseNum("10").street("Dorset").town("Cape Town").Country("South Africa").build();
        
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