/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class VenueOwner {
    private String id;
    private String ownerId;
    private String venueOwnerName;
    private String contId;

    private VenueOwner() {
    }

    private VenueOwner(Builder build) {
        this.id=build.id;
        this.ownerId=build.ownerId;
        this.venueOwnerName=build.venueOwnerName;
        this.contId=build.contId; 
    }

    public String getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getVenueOwnerName() {
        return venueOwnerName;
    }

    public String getCont() {
        return contId;
    }
    
    public static class Builder{
        private String id;
        private String ownerId;
        private String venueOwnerName;
        private String contId;

        public Builder(String ownerId) {
            this.ownerId=ownerId;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder ownerName(String name){
            this.venueOwnerName=name;
            return this;
        }
        public Builder contact(String contact){
            this.contId=contact;
            return this;
        }
        public VenueOwner build(){
            return new VenueOwner(this);
        }
        public Builder copier(VenueOwner vo){
            this.id=vo.id;
            this.ownerId=vo.ownerId;
            this.venueOwnerName=vo.venueOwnerName;
            this.contId=vo.contId;
            return this;
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
        final VenueOwner other = (VenueOwner) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
