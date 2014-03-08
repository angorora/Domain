/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author allen
 */
public final class Conference {
    private String id;
    private String eventName;
    private String eventId;
    private String organisationName;
    private Venue venue;
    private List<Attendee> attendees;
    private String ownerId;
    private Calendar date;
    private int duration;

    public Conference() {
    }

    private Conference(Builder build) {
        id = build.id;
        attendees= build.attendees;
        ownerId= build.ownerId;
        eventId=build.eventId;
        venue=build.venue;
        eventName=build.eventName;
        organisationName=build.organisationName;
        date=build.date;
        duration=build.duration;
    }

    public String getEventId() {
        return eventId;
    }

    public Venue getVenue() {
        return venue;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public String getId() {
        return id;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public Calendar getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public String getEventName() {
        return eventName;
    }

    public String getOwnerId() {
        return ownerId;
    }

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conference other = (Conference) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
    public static class Builder{
        private String id;
        private String eventId;
        private String eventName;
        private String organisationName;
        private Venue venue;
        private List<Attendee> attendees;
        private String ownerId;
        private Calendar date;
        private int duration;


        public Builder(String eventId) {
            this.eventId= eventId;
        }
        public Builder AttendeesList(List<Attendee> attendees){
           this.attendees= attendees;
           return this;
        }
        public Builder id(String id){
            this.id =id;
            return this;
        }
         public Builder duration(int duration){
            this.duration=duration;
            return this;
        }
          public Builder date(Calendar date){
            this.date=date;
            return this;
        }
         public Builder venue(Venue venue){
            this.venue=venue;
            return this;
        }
         public Builder organisationName(String name){
            this.organisationName=name;
            return this;
        }
        public Builder ownerId(String ownerId){
            this.ownerId =ownerId;
            return this;
        }
        public Builder eventName(String evName){
            this.eventName=evName;
            return this;
        }
        public Conference build(){
            return  new Conference(this);
        }
        public Builder copier(Conference conf ){
            this.id =conf.id;
            this.attendees=conf.attendees;
            this.ownerId=conf.ownerId;
            this.eventId=conf.eventId;
            this.venue =conf.venue;
            this.organisationName=conf.organisationName;
            this.eventName=conf.eventName;
            this.duration=conf.duration;
            this.date=conf.date;
            return this;
        }
                
    }
}
