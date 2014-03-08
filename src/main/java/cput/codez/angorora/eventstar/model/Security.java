/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class Security {
    private String id;
    private String eventId;
    private String providerName;
    private String providerContId;
    private String description;

    private Security() {
    }

    private Security(Builder build) {
        this.id=build.id;
        this.providerContId=build.providerContId;
        this.eventId=build.eventId;
        this.providerName=build.providerName;
        this.description=build.description;
        
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

    public String getProviderCont() {
        return providerContId;
    }

    public String getDescription() {
        return description;
    }
    
    public static class Builder{
        private String id;
        private String eventId;
        private String providerName;
        private String providerContId;
        private String description;
        
        public Builder( String eventId) {
            this.eventId=eventId;
        }

        public Builder id(String id){
            this.id=id;
            return this;
        }
         public Builder providerContact(String cont){
            this.providerContId=cont;
            return this;
        }
         public Builder providername(String provName){
             this.providerName=provName;
             return  this;
         }
         public Builder descrip(String descrip){
             this.description=descrip;
             return  this;
         }
         public Security build(){
             return new Security(this);
         }
         public  Builder copier(Security secure){
             this.id=secure.id;
             this.providerContId=secure.providerContId;
             this.eventId=secure.eventId;
             this.providerName=secure.providerName;
             this.description=secure.description;
             return this;
        }
   
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Security other = (Security) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
