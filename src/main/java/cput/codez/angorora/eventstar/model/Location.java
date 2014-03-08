/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventstar.model;

/**
 *
 * @author allen
 */
public final class Location {
    String id;
    private String locCity;
    private String locArea;

    private Location(Builder build) {
        this.id=build.id;
        this.locArea=build.locArea;
        this.locCity=build.locCity;
        
    }

    private Location() {
    }
    
    public static class Builder{
        String id;
        private String locCity;
        private String locArea;

        public Builder(String city) {
            this.locCity=city;
        }
        public Builder id(String id){
            this.id=id;
            return this;
        }
        public Builder locArea(String locArea){
            this.locArea=locArea;
            return this;
        }
        public Location build(){
            return new Location(this);
        }
        public Builder copier(Location loc){
            this.id=loc.id;
            this.locArea=loc.locArea;
            this.locCity=loc.locCity;
            return this;
        }
    }
}
