package test;

import java.io.IOException;

public abstract class Model {
    public String inputPath;
    public String outputPath;

    public Model(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public abstract void start() throws IOException;
}
