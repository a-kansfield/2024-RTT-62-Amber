package pa_303_5_1;

public class QuestionThree {
    //Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
    //In how many years will the tuition be doubled?
    public static void main(String[] args) {
        //Init
        double startTuition = 10000;
        double targetTuition = startTuition * 2;
        double tuition = startTuition;
        double inc = 1.07;
        int count = 0;
        while (tuition < targetTuition) {
            tuition = tuition * inc;
            count++;
        }
        System.out.println("Years: " + count);

    }
}
