public class PetHospital {

    public void helpForCat(Cat cat) {
        System.out.println("Сейчас оказывается помощь кошке");
        cat.born();
    }


    

    public void helpForDog(Dog dog) {
        System.out.println("Сейчас оказывается помошь собаке");
        dog.born();
        System.out.println("Вух, отлично");

    }
}


