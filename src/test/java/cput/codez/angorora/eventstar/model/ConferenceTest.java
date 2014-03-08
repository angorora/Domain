/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

import cput.codez.angorora.eventstar.model.Attendee;
import cput.codez.angorora.eventstar.model.Conference;
import cput.codez.angorora.eventstar.model.EventOwner;
import java.util.ArrayList;
import java.util.List;
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
public class ConferenceTest {
    static  Conference conf;
    static Conference newConf;
    static Attendee att;
    static String eventId;
    static List<Attendee> attList= new ArrayList<Attendee>();;
    public ConferenceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCreation() {
          att=new Attendee.Builder("CN389529").id("6")
                .firstName("Allen")
                .lastName("Ngorora").ticket("Ct33333")
                .age(19).contact(null).build();
          attList.add(att);
         eventId="C389529";
         conf= new Conference. Builder(eventId).AttendeesList(attList).organisationName("Microsoft").build();
         Assert.assertEquals(conf.getEventId(), "C389529", "result");
         Assert.assertEquals(conf.getAttendees().size(), 1, "was received");
         Assert.assertEquals(conf.getOrganisationName(), "Microsoft", "Tested!");
     }
    @Test
    public void testUpdate(){
       newConf= new Conference.Builder("C389529").copier(conf).organisationName("CPUT").build();
       Assert.assertEquals(newConf.getOrganisationName(), "CPUT", "Tested!");
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