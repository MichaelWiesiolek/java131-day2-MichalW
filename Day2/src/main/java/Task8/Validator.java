package Task8;

public class Validator {
    public void isDimensionViable(Parcel parcel) {
        if (parcel.getxLenght() + parcel.getyLenght() + parcel.getzlenght() <= 300) {
            System.out.println("Paczka: "+ parcel.toString() + " jest dobrych rozmiarów");
        } else {
            System.out.println("Paczka jest złych rozmiarów");
        }
    }
    public void isWeightAlright(Parcel parcel){
        if (parcel.getWeight() <= 30 && !parcel.isExpress()){
            System.out.println("Paczka: " +parcel+ " jest dobrej wagi i nie jest ekspresowa");
    } else if (parcel.getWeight() <= 15 && !parcel.isExpress()){
            System.out.println("Paczka: " +parcel+ " jest dobrej wagi i nie jest ekspresowa");
        }else {
            System.out.println("Paczka: " +parcel+ " jest złej wagi");
        }
}
public void validate(Parcel parcel){
        isDimensionViable(parcel);
        isWeightAlright(parcel);
}
}
