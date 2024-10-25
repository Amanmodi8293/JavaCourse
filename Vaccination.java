package vaccine;

public class Vaccination {
    public static void main(String[] args) {

        VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");

        user.firstDose();

        boolean firstDoseTaken = true; 

        user.secondDose(firstDoseTaken);

        user.boosterDose();
    }
}