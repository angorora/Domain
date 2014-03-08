/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class Food {
    String id;
    private String eventId;
    private String providerName;
    ContactCard providerCont;
    private String description;

    private Food() {
    }

    private Food(Builder build) {
       this.id=build.id;
        this.eventId=build.eventId;
        this.providerName=build.providerName;
        this.providerCont=build.providerCont;
        this.description= build.description;
    }

    public String getId() {
        return id;
    }

    public String getEventId() {
        return eventId;
    }

    public String getProviderName() {
        return providerName;
    }

    public ContactCard getProviderCont() {
        return providerCont;
    }

    public String getDescription() {
        return description;
    }
    
    public static class Builder{
        String id;
        private String eventId;
        private String providerName;
        ContactCard providerCont;
        private String description;

        public Builder(String eventId) {
            this.eventId=eventId;
        }
        public Builder  providerName(String name){
            this.providerName=name;
            return this;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder providerContact(ContactCard contact){
            this.providerCont=contact;
            return this;
        }
        public Builder description(String description){
            this.description=description;
            return this;
        }
        public Food build(){
            return new Food(this);
        }
        public Builder copier(Food fd){
            this.id=fd.id;
            this.eventId=fd.eventId;
            this.providerName=fd.providerName;
            this.providerCont=fd.providerCont;
            this.description= fd.description;
            return this;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Food other = (Food) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
