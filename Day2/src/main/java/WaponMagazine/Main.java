package WaponMagazine;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(6);
        checkIfGunLoaded(gun);
        gun.loadBullet("Bullet 1");
        gun.loadBullet("Bullet 2");
        gun.loadBullet("Bullet 3");
        gun.loadBullet("Bullet 4");
        gun.loadBullet("Bullet 5");
        gun.loadBullet("Bullet 6");
        gun.loadBullet("Bullet 7");

        System.out.println("Broń naładowana: "+ gun.isLoaded());

        gun.shot();
        gun.shot();
    }

    private static void checkIfGunLoaded(Gun gun) {
        System.out.println("Broń naładowana: "+ gun.isLoaded());
    }

  //  private static void loadWithBullet(Gun gun, int numberOfBullets){
  //      for (int i = 0; i <= numberOfBullets ; i++) {
  //          gun.loadBullet("Bullet" + 1);

    //    }
  //  }
}
