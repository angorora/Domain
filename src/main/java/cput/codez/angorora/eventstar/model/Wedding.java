/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

import java.util.List;

/**
 *
 * @author allen
 */
public final class Wedding {
    private String id;
    private String eventName;
    private String eventId;
    private Venue venue;
    private List<Attendee> attendees;
    private String ownerId;

    private Wedding() {
    }

    private Wedding(Builder buid) {
         this.id=buid.id;
         this.eventId=buid.eventId;
         this.eventName=buid.eventName;
         this.venue=buid.venue;
         this.attendees=buid.attendees;
         this.ownerId=buid.ownerId;
   }

    public String getId() {
        return id;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventId() {
        return eventId;
    }

    public Venue getVenue() {
        return venue;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public String getOwnerId() {
        return ownerId;
    }
    
    public static class Builder{
        private String id;
        private String eventName;
        private String eventId;
        private Venue venue;
        private List<Attendee> attendees;
        private String ownerId;

        public Builder(String eventId) {
            this.eventId=eventId;
        }
        
        public  Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder eventName(String name){
            this.eventName=name;
            return this;
        }
        public Builder venue(Venue venue){
            this.venue=venue;
            return this;
        }
        public Builder attendees(List<Attendee> attList){
            this.attendees=attList;
            return this;
        }
        public Builder  ownerId(String ownerId){
            this.ownerId=ownerId;
            return this;
        }
        public Wedding build(){
            return new Wedding(this);
        }
        public Builder copier(Wedding wed){
             this.id=wed.id;
             this.eventId=wed.eventId;
             this.eventName=wed.eventName;
             this.venue=wed.venue;
             this.attendees=wed.attendees;
             this.ownerId=wed.ownerId;
             return  this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Wedding other = (Wedding) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
