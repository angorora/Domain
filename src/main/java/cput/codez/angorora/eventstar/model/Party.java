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
public final class Party {
    private String id;
    private String eventName;
    private String eventId;
    private Venue venue;
    private List<Attendee> attendees;
    private String ownerId;

    private Party() {
    }

    private Party(Builder build) {
         this.id=build.id;
         this.eventId=build.eventId;
         this.eventName=build.eventName;
         this.venue=build.venue;
         this.attendees=build.attendees;
         this.ownerId=build.ownerId;
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

        public Builder( String eventId) {
            this.eventId=eventId;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder eventName(String evName){
            this.eventName=evName;
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
        public Builder owner(String ownerId){
            this.ownerId=ownerId;
            return this;
        }
        public Party build(){
            return new Party(this);
        }
        public Builder copier(Party party){
             this.id=party.id;
             this.eventId=party.eventId;
             this.eventName=party.eventName;
             this.venue=party.venue;
             this.attendees=party.attendees;
             this.ownerId=party.ownerId;
             return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Party other = (Party) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
