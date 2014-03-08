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
public class AddressTest {
     Address addr;
     Address newAddr;
    public AddressTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
          addr= new Address.Builder("7925").id("2").hseNum("10")
                                           .street("Dorset")
                                           .town("Cape Town")
                                           .Country("South Africa").build();
         Assert.assertEquals(addr.getCountry(), "South Africa", "Tested! ");
     }
     @Test
     public void testUpdate(){
          newAddr=new Address.Builder("7925").copier(addr).hseNum("23").build();
          Assert.assertEquals(newAddr.getHseNum(), "23", "Tested!");
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
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