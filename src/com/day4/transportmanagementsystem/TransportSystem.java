package com.day4.transportmanagementsystem;

class Transport {
    String source, destination;
    
    public Transport(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    void travelTime() {
        System.out.println("Travel time depends on the mode of transport.");
    }
}

class Bus extends Transport {
    int seats;

    public Bus(String source, String destination, int seats) {
        super(source, destination);
        this.seats = seats;
    }

    @Override
    void travelTime() {
        System.out.println("🚌 Bus from " + source + " to " + destination + " takes approx 8 hours.");
    }
}

class Train extends Transport {
    String trainName;

    public Train(String source, String destination, String trainName) {
        super(source, destination);
        this.trainName = trainName;
    }

    // Method Overloading
    void travelTime(int stops) {
        System.out.println("🚆 Train " + trainName + " with " + stops + " stops from " +
                source + " to " + destination + " takes approx 6 hours.");
    }

    @Override
    void travelTime() {
        System.out.println("🚆 Train " + trainName + " from " + source + " to " + destination + " takes approx 5.5 hours.");
    }
}

public class TransportSystem {
    public static void main(String[] args) {
        Bus bus = new Bus("Delhi", "Jaipur", 45);
        Train train = new Train("Mumbai", "Pune", "Deccan Express");

        Transport t1 = bus;  // polymorphism
        Transport t2 = train;

        t1.travelTime();
        t2.travelTime();

        train.travelTime(4);  // Overloaded method
    }
}
