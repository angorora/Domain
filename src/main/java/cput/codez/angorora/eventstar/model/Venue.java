/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class Venue {
    private String id;
    private String venueName;
    private double cost;
    private Address address;
    private Location loc;
    private VenueOwner venOwner;

    private Venue() {
    }

    private Venue(Builder build) {
         this.venueName=build.venueName;
         this.id=build.id;
         this.venueName= build.venueName;
         this.cost=build.cost;
         this.address=build.address;
    }

    public String getId() {
        return id;
    }

    public String getVenueName() {
        return venueName;
    }

    public double getCost() {
        return cost;
    }

    public Address getAddress() {
        return address;
    }

    public Location getLoc() {
        return loc;
    }

    public VenueOwner getVenOwner() {
        return venOwner;
    }
    
    public static class Builder{
        private String id;
        private String venueName;
        private double cost;
        private Address address;
        private VenueOwner venOwner;

        public Builder(String venueName) {
            this.venueName=venueName;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder venueName(String venueName){
            this.venueName= venueName;
            return this;
        }
        public Builder cost(double cost){
            this.cost=cost;
            return this;
        }
        public Builder adress(Address adr){
            this.address=adr;
            return this;
        }
        public Venue build(){
            return  new Venue(this);
        }
        public Builder copier(Venue ven){
             this.venueName=ven.venueName;
             this.id=ven.id;
             this.venueName= ven.venueName;
             this.cost=ven.cost;
             this.address=ven.address;
             return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Venue other = (Venue) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
