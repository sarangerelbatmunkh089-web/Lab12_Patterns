public class Home {
    public static void main(String[] args){
       Pet[] p = new Pet[3];

        p[0] = PetFactory.createPet("Dog", "Nohoi");
        p[1] = PetFactory.createPet("Cat", "Muur");
        p[2] = PetFactory.createPet("Bird", "Shuvuu");

        for (int i = 0; i < p.length; i++) {
            System.out.println("Pet: " + p[i].getName() + ": " + p[i].speak());
        }
    }
}
