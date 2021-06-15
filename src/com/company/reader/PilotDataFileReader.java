package com.company.reader;

import com.company.entity.Pilot;
import com.company.exaption.EmtySourceFile;
import com.company.util.pilotUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PilotDataFileReader {
    private String filepath;

    public PilotDataFileReader(String filepath) {
        this.filepath = filepath;
    }
    public List<Pilot> read(){
        List<Pilot> pilots = new ArrayList<>();
      try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
          checkFile();
       String line;
       while ((line = reader.readLine())!=null){
           Pilot pilot = pilotUtil.toObject(line);
           pilots.add(pilot);
       }


      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (EmtySourceFile emtySourceFile) {
          emtySourceFile.printStackTrace();
      }
      return pilots;
    }
    private  void checkFile() throws EmtySourceFile {
        File sourceFile = new File(filepath);
        if (sourceFile.length()==0){
            throw  new EmtySourceFile("Файл Пуст");
        }
    }
}
