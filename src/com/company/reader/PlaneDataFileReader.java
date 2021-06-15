package com.company.reader;

import com.company.entity.Pilot;
import com.company.entity.Plane;
import com.company.exaption.EmtySourceFile;
import com.company.util.planeUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlaneDataFileReader {

        private String filepath;

        public PlaneDataFileReader(String filepath) {
            this.filepath = filepath;
        }
        public List<Plane> read(){
            List<Plane> planes = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
                checkFile();
                String line;
                while ((line = reader.readLine())!=null){
                    Plane plane = planeUtil.toObject(line);
                    planes.add(plane);
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (EmtySourceFile emtySourceFile) {
                emtySourceFile.printStackTrace();
            }
            return planes;
        }
        private  void checkFile() throws EmtySourceFile {
            File sourceFile = new File(filepath);
            if (sourceFile.length()==0){
                throw  new EmtySourceFile("Файл Пуст");
            }
        }
    }

