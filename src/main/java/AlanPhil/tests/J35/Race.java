package AlanPhil.tests.J35;

import java.util.ArrayList;
import java.util.Arrays;

class Race {
    @SuppressWarnings("CanBeFinal")
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}