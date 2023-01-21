package Task8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10, 100 ,30,30, true);
        Parcel parcel2 = new Parcel(12, 20, 50, 10,true);
        Parcel parcel3 = new Parcel(12, 20, 50, 10,false);
        Parcel parcel4 = new Parcel(12, 20, 50, 10,false);

        Validator validator = new Validator();

        validator.validate(parcel1);
        System.out.println();
        validator.validate(parcel2);
        System.out.println();
        validator.validate(parcel3);
        System.out.println();
        validator.validate(parcel4);
        System.out.println();

    }
}
