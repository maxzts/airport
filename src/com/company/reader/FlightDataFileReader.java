package com.company.reader;

import com.company.entity.Flight;
import com.company.entity.Plane;
import com.company.exaption.EmtySourceFile;
import com.company.util.flightUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDataFileReader {
    private String filepath;

    public FlightDataFileReader(String filepath) {
        this.filepath = filepath;
    }
    public List<Flight> read(){
        List<Flight> flights = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            checkFile();
            String line;
            while ((line = reader.readLine())!=null){
                Flight flight = flightUtil.toObject(line);
                flights.add(flight);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmtySourceFile emtySourceFile) {
            emtySourceFile.printStackTrace();
        }
        return flights;
    }
    private  void checkFile() throws EmtySourceFile {
        File sourceFile = new File(filepath);
        if (sourceFile.length()==0){
            throw  new EmtySourceFile("Файл Пуст");
        }
    }
}

