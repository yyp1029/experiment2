package demo04;

import test.Model;

import java.io.File;
import java.io.IOException;

public class PipeFilter extends Model {
    public PipeFilter(String inputPath, String outputPath) {
        super(inputPath, outputPath);
    }

    public void start() throws IOException {
        File inFile = new File(inputPath);
        File outFile = new File(outputPath);
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();

    }
}

