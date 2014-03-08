/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class Address {
    private String id;
    private String hseNum;
    private String street;
    private String town;
    private String postalCode;
    private String country;

    private Address() {
    }

    private Address(Builder build) {
        this.id=build.id;
        this.postalCode=build.postalCode;
        this.hseNum=build.hseNum;
        this.street=build.street;
        this.town=build.town;
        this.country=build.country;
    }

    public String getId() {
        return id;
    }

    public String getHseNum() {
        return hseNum;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }
    
    public static class Builder{
        private String id;
        private String hseNum;
        private String street;
        private String town;
        private String postalCode;
        private String country;

        public Builder(String  post) {
            this.postalCode=post;
        }
        
         public  Builder id(String id){
            this.id=id;
            return this;
         }
         public  Builder hseNum(String hseNum){
            this.hseNum=hseNum;
            return this;
         }
         public  Builder street(String street){
            this.street=street;
            return this;
         }
         public  Builder town(String twn){
            this.town=twn;
            return this;
         }
         public  Builder Country(String country){
            this.country=country;
            return this;
         }
         public Address build(){
             return new Address(this);
         }
         public Builder copier(Address addr){
               this.id=addr.id;
               this.postalCode=addr.postalCode;
               this.hseNum=addr.hseNum;
               this.street=addr.street;
               this.town=addr.town;
               this.country=addr.country;
               return this;
         }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Address other = (Address) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
    
}
