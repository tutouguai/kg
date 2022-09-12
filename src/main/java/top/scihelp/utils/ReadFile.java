package top.scihelp.utils;

import top.scihelp.pojo.Kg;

import java.io.*;

public class ReadFile {
    public static Kg readFileData(String filepath){
        try {
            //open the file
            FileReader file = new FileReader(filepath);
            BufferedReader buffer = new BufferedReader(file);
            //read the 1st line
            Kg kgData = new Kg();
            String line ;
            String[] split;
            while((line = buffer.readLine())!=null){
                split = line.split("\t");
                kgData.addTriplet(split[0], split[1], split[2]);
            }
            return kgData;
        } catch (IOException e) {
            e.printStackTrace();
            return new Kg();
        }
    }
}
