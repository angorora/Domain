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
public class AttendeeTest {
    static Attendee att;
    static Attendee newAtt;
    public AttendeeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
         att = new Attendee.Builder("CN389529")
                           .id("9").
                            firstName("Allen")
                           .lastName("Ngorora")
                           .ticket("T23")
                           .contact("12")
                           .age(19).build();
         Assert.assertEquals(att.getAge(), 19);
     }
    @Test
     public void testUpdate(){
        newAtt=new Attendee.Builder("CN389529").copier(att).age(23).build();
         Assert.assertEquals(newAtt.getAge(), 23);
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