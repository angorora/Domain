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
public class DecorTest {
    static Decor decor ;
    static Decor newDecor;
    public DecorTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
         decor=new Decor.Builder("345").providerContact("3").id("4").providername("The DDs").descrip("\"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"").build();
         Assert.assertEquals(decor.getProviderName(), "The DDs");
     }
     @Test
     public void testUpdate(){
         newDecor=new Decor.Builder("345").copier(decor).providername("erDDDDDer").build();
         Assert.assertEquals(newDecor.getProviderName(), "erDDDDDer");
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