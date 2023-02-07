public class UnitUpgrader {
    public void upgrade(ApartmentWithRooms apartment) {
        apartment.squareFootage += 40;
        apartment.numberOfBedrooms += 1;
    }
    
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;
    }
}
