package com.example.basedul.houserent.Home;
/* Details of homes information */
public class HomeDetails {

    /* private fields */
    private int photoOfHome;
    private String nameOfHome;
    private String location;
    private int numberOfGuests;
    private int numberOfBeds;
    private int numberOfBedroomsAndNumberOfKitchen;
    private int numberOfBaths;
    private int ratingValue;


    /* Constructor field */

    public HomeDetails() {
    }

    public HomeDetails(int photoOfHome) {
        this.photoOfHome = photoOfHome;
    }

    public HomeDetails(int photoOfHome, String nameOfHome) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
    }

    public HomeDetails(int photoOfHome, String nameOfHome, String location) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
        this.location = location;
    }

    public HomeDetails(int photoOfHome, String nameOfHome, String location, int numberOfGuests) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
        this.location = location;
        this.numberOfGuests = numberOfGuests;
    }

    public HomeDetails(int photoOfHome, String nameOfHome, String location, int numberOfGuests, int numberOfBeds) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
        this.location = location;
        this.numberOfGuests = numberOfGuests;
        this.numberOfBeds = numberOfBeds;
    }

    public HomeDetails(int photoOfHome, String nameOfHome, String location, int numberOfGuests, int numberOfBeds, int numberOfBedroomsAndNumberOfKitchen) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
        this.location = location;
        this.numberOfGuests = numberOfGuests;
        this.numberOfBeds = numberOfBeds;
        this.numberOfBedroomsAndNumberOfKitchen = numberOfBedroomsAndNumberOfKitchen;
    }

    public HomeDetails(int photoOfHome, String nameOfHome, String location, int numberOfGuests, int numberOfBeds, int numberOfBedroomsAndNumberOfKitchen, int numberOfBaths) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
        this.location = location;
        this.numberOfGuests = numberOfGuests;
        this.numberOfBeds = numberOfBeds;
        this.numberOfBedroomsAndNumberOfKitchen = numberOfBedroomsAndNumberOfKitchen;
        this.numberOfBaths = numberOfBaths;
    }

    public HomeDetails(int photoOfHome, String nameOfHome, String location, int numberOfGuests, int numberOfBeds, int numberOfBedroomsAndNumberOfKitchen, int numberOfBaths, int ratingValue) {
        this.photoOfHome = photoOfHome;
        this.nameOfHome = nameOfHome;
        this.location = location;
        this.numberOfGuests = numberOfGuests;
        this.numberOfBeds = numberOfBeds;
        this.numberOfBedroomsAndNumberOfKitchen = numberOfBedroomsAndNumberOfKitchen;
        this.numberOfBaths = numberOfBaths;
        this.ratingValue = ratingValue;
    }

    /* Setter method of private varriable */

    public void setPhotoOfHome(int photoOfHome) {
        this.photoOfHome = photoOfHome;
    }

    public void setNameOfHome(String nameOfHome) {
        this.nameOfHome = nameOfHome;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setNumberOfBedroomsAndNumberOfKitchen(int numberOfBedroomsAndNumberOfKitchen) {
        this.numberOfBedroomsAndNumberOfKitchen = numberOfBedroomsAndNumberOfKitchen;
    }

    public void setNumberOfBaths(int numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    /* Getter method for private fields */

    public int getPhotoOfHome() {
        return photoOfHome;
    }

    public String getNameOfHome() {
        return nameOfHome;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getNumberOfBedroomsAndNumberOfKitchen() {
        return numberOfBedroomsAndNumberOfKitchen;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public int getRatingValue() {
        return ratingValue;
    }
}
