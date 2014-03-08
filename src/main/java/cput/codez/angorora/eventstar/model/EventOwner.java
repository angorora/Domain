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
public final class EventOwner {
    private String id;
    private String eventId;
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerId;
    private String contId;
    private List<OwnerStaff> staff;

    private EventOwner() {
    }

    private EventOwner(Builder build) {
        this.id=build.id;
        this.ownerId=build.ownerId;
        this.eventId=build.eventId;
        this.ownerFirstName=build.ownerFirstName;
        this.ownerLastName=build.ownerLastName;
        this.contId=build.contId;
        this.staff=build.staff;
    }

    public String getId() {
        return id;
    }

    public String getEventId() {
        return eventId;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getCont() {
        return contId;
    }

    public List<OwnerStaff> getStaff() {
        return staff;
    }
    
    public static class Builder{
        private String id;
        private String eventId;
        private String ownerFirstName;
        private String ownerLastName;
        private String ownerId;
        private String contId;
        private List<OwnerStaff> staff;

        public Builder(String owner) {
            this.ownerId=owner;
        }
        public Builder id(String id){
            this.id=id;
            return  this;
        }
        public Builder eventId(String evId){
            this.eventId= evId;
            return this;
        }
        public Builder owneFirstname(String fname){
            this.ownerFirstName=fname;
            return  this;
        }
        public Builder ownerLastName(String lname){
            this.ownerLastName=lname;
            return this;
        }
        public Builder contactCard(String contId){
            this.contId=contId;
            return this;
        }
        public Builder staffList(List<OwnerStaff> staff){
            this.staff=staff;
            return this;
        }
        public EventOwner build(){
            return new EventOwner(this);
        }
        public Builder copier(EventOwner owner){
            this.id=owner.id;
            this.ownerId=owner.ownerId;
            this.eventId=owner.eventId;
            this.ownerFirstName=owner.ownerFirstName;
            this.ownerLastName=owner.ownerLastName;
            this.contId=owner.contId;
            this.staff=staff;
            return  this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final EventOwner other = (EventOwner) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
