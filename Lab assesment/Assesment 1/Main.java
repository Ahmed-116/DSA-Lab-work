public class Main {
    public static void main(String[] args) {

        Station station = new Station();
        station.addStationAtStart("Islamabad",3300);
        station.addStationAtStart("Karachi",400);
        station.addStationAtStart("Rawalpindi",220);
        station.insertStationAtLast("Jhang",500);
        station.insertAtSpecificPosition("Lahore",310,3);
        station.insertAtSpecificPosition("multan",330,1);
        station.displayRoute();
        station.removeFirstStart();
        station.removeLastStation();
       // station.removeSpecificStation(2);
        station.displayRoute();
    }
}
