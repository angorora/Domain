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
public final class Meeting {
    private String id;
    private String eventName;
    private String eventId;
    private Venue venue;
    private List<Attendee> attendees;
    private EventOwner owner;
    private String organisationName;
    private Calendar date;
    private int duration;

    private Meeting() {
    }

    private Meeting(Builder build) {
           this.organisationName=build.organisationName;
           this.id=build.id;
           this.eventName = build.eventName;
           this.eventId=build.eventId;
           this.venue=build.venue;
           this.attendees=build.attendees;
           this.owner=build.owner;
           this.date=build.date;
           this.duration=build.duration;
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

    public EventOwner getOwner() {
        return owner;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public Calendar getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }
    
    public static class Builder{
        private String id;
        private String eventName;
        private String eventId;
        private Venue venue;
        private List<Attendee> attendees;
        private EventOwner owner;
        private String organisationName;
        private Calendar date;
        private int duration;

        public Builder(String org) {
            this.organisationName=org;
        }
        public Builder id(String id){
            this.id=id;
            return  this;
        }
        public Builder eventName(String evName){
            this.eventName = evName;
            return  this;
        }
        public Builder eventId(String evId){
            this.eventId=evId;
            return  this;
        }
        public Builder venueId(Venue venue){
            this.venue=venue;
            return this;
        }
        public Builder attendeeList(List<Attendee>  attList){
            this.attendees=attList;
            return this;
        }
        public Builder eventOwner(EventOwner owner){
            this.owner=owner;
            return this;
        }
     
        public Builder date(Calendar date){
            this.date=date;
            return this;
        }
        public Builder duration(int duration){
            this.duration=duration;
            return  this;
        }
        public Meeting build(){
            return new Meeting(this);
        }
        public Builder copier(Meeting meet){
               this.organisationName=meet.organisationName;
               this.id=meet.id;
               this.eventName = meet.eventName;
               this.eventId=meet.eventId;
               this.venue=meet.venue;
               this.attendees=meet.attendees;
               this.owner=meet.owner;
               this.date=meet.date;
               this.duration=meet.duration;
               return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Meeting other = (Meeting) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
