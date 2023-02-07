abstract sealed class Apartment permits Studio, ApartmentWithRooms {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}