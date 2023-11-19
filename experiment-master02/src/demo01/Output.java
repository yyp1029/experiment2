package demo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Output implements Observer {
    private ArrayList<String> kwicList;
    private BufferedWriter outputFile;
    private String filename;
    public Output(ArrayList<String> kwicList,String filename) {
        this.kwicList = kwicList;
        this.filename = filename;
    }

    @Override
    public void toDo(){
        Iterator<String> it = kwicList.iterator();
        System.out.println(kwicList.size());
        try {
            outputFile = new BufferedWriter(new FileWriter(filename));
            while (it.hasNext()) {
                System.out.println("正在写入数据");
                outputFile.write(it.next()+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (outputFile!=null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

