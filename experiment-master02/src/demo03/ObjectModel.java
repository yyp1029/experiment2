package demo03;

import test.Model;

public class ObjectModel extends Model {
    public ObjectModel(String inputPath, String outputPath) {
        super(inputPath, outputPath);
    }

    public void start() {
        Input input = new Input();
        input.input(inputPath);
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output(outputPath);

    }
}
