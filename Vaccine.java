package vaccine;

abstract class Vaccine {
    int age;
    String nationality;

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose administered. Please pay 250 Rs.");
        } else {
            System.out.println("Eligibility criteria not met for first dose.");
        }
    }

    public void secondDose(boolean firstDoseTaken) {
        if (firstDoseTaken) {
            System.out.println("Second dose administered.");
        } else {
            System.out.println("You must take the first dose before the second dose.");
        }
    }

    public abstract void boosterDose();
}

VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("Booster dose administered.");
    }
}

class Vaccination {
    public static void main(String[] args) {

        VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");

        user.firstDose();

        boolean firstDoseTaken = true; 

        user.secondDose(firstDoseTaken);

        user.boosterDose();
    }
}