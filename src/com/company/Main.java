package com.company;

import com.company.db.joiner.DataJoiner;
import com.company.entity.JoinedDataItem;
import com.company.writer1.JoinedDataFileWriter;


import java.util.List;

public class Main {

    public static void main(String[] args) {
//        PilotDataFileReader dataFileReader = new PilotDataFileReader("data\\pilot.csv");
////        List<Pilot> pilots = dataFileReader.read();
////        pilotDbWriter.insert(pilots);
//        System.out.println(dataFileReader.read());



//        PlaneDataFileReader dataPlaneFileReader = new PlaneDataFileReader("data\\plane.csv");
//        List<Plane> planes = dataPlaneFileReader.read();
//        planeDbWriter.insert(planes);
//////        System.out.println(dataPlaneFileReader.read());


//        FlightDataFileReader dataFlightFileReader = new FlightDataFileReader("data\\flight.csv");
//        List<Flight> flights = dataFlightFileReader.read();
//        flightDbWriter.insert(flights);

//        System.out.println(DataJoiner.getJoinedData());
//        System.out.println(dataFlightFileReader.read());
        List<JoinedDataItem> items  = DataJoiner.getJoinedData();

        System.out.println(items);

        JoinedDataFileWriter dataFileWriter = new JoinedDataFileWriter("data\\result.csv");
       dataFileWriter.write(items);

    }

}
