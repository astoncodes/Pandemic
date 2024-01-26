package upei.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import upei.cities.*;

/**
 * A class defining the variables of the game.
 */
public class Variables {
    /* FINAL VARIABLES REPRESENTING THE GAME */
    public static final int MAX_TURNS = 52;                 // Player cards
    public static int INFECTION_RATE = 2;                   // Infection Rate
    public static int OUTBREAK_MARKER = 0;                  // Outbreak_marker
    public static int neededForCure = 4;                    // Number of cards needed to discover a cure
    public static final int NUM_CITIES = 48;                // Infection cards
    public static final int MAX_INFECTION_OF_CITY = 3;      // If already 3 spread an infection
    public static final int NUM_INITIALLY_INFECTED = 9;     // Random initially infected cities
    public static final int NUM_ACTIONS_PER_TURN = 7;        // Possible different actions per turn
    public static final int MAX_NUMBER_OF_OUTBREAK = 8;     // Max number of outbreaks
    public static final int RESEARCH_STATIONS = 6;          // Max number of research stations

    // 96 Disease cubes
    public static final int RED_CUBES = 24;                 // Red disease Cubes
    public static final int YELLOW_CUBES = 24;              // Yellow disease Cubes
    public static final int BLUE_CUBES = 24;                // Blue disease Cubes
    public static final int BLACK_CUBES = 24;               // Black disease Cubes

    // 48 cities
    // Used as a lookup table for each Red Cities
    public static final List<CityList> CITY_RED_LIST =
            new ArrayList<>(Arrays.asList(
                    CityList.BANGKOK,
                    CityList.BEIJING,
                    CityList.HO_CHI_MINH_CITY,
                    CityList.HONG_KONG,
                    CityList.JAKARTA,
                    CityList.MANILA,
                    CityList.OSAKA,
                    CityList.SEOUL,
                    CityList.SHANGHAI,
                    CityList.SYDNEY,
                    CityList.TAIPEI,
                    CityList.TOKYO));

    // Used for each Black cities
    public static final List<CityList> CITY_BLACK_LIST =
            new ArrayList<>(Arrays.asList(
                    CityList.ALGIERS,
                    CityList.BAGHDAD,
                    CityList.CAIRO,
                    CityList.CHENNAI,
                    CityList.DELHI,
                    CityList.ISTANBUL,
                    CityList.KARACHI,
                    CityList.KOLKATA,
                    CityList.MOSCOW,
                    CityList.MUMBAI,
                    CityList.RIYADH,
                    CityList.TEHRAN));

    // Used for each Yellow cities
    public static final List<CityList> CITY_YELLOW_LIST =
            new ArrayList<>(Arrays.asList(
                    CityList.BOGOTA,
                    CityList.BUENOS_AIRES,
                    CityList.JOHANNESBURG,
                    CityList.KHARTOUM,
                    CityList.KINSHASA,
                    CityList.LAGOS,
                    CityList.LIMA,
                    CityList.LOS_ANGELES,
                    CityList.MEXICO_CITY,
                    CityList.MIAMI,
                    CityList.SANTIAGO,
                    CityList.SAO_PAULO));

    // Used for each Blue cities
    public static final List<CityList> CITY_BLUE_LIST =
            new ArrayList<>(Arrays.asList(
                    CityList.ATLANTA,
                    CityList.CHICAGO,
                    CityList.ESSEN,
                    CityList.LONDON,
                    CityList.MADRID,
                    CityList.MILAN,
                    CityList.MONTREAL,
                    CityList.NEW_YORK,
                    CityList.PARIS,
                    CityList.ST_PETERSBURG,
                    CityList.WASHINGTON));

    // A list containing all cities in alphabetical order
    public static final List<CityList> CITY_ALPHA_ORDER_LIST =
            new ArrayList<>(Arrays.asList(CityList.ALGIERS,
                    CityList.ATLANTA, CityList.BAGHDAD, CityList.BANGKOK,
                    CityList.BEIJING, CityList.BOGOTA, CityList.BUENOS_AIRES,
                    CityList.CAIRO, CityList.CHENNAI, CityList.CHICAGO,
                    CityList.DELHI, CityList.ESSEN, CityList.HO_CHI_MINH_CITY,
                    CityList.HONG_KONG, CityList.ISTANBUL, CityList.JAKARTA,
                    CityList.JOHANNESBURG, CityList.KARACHI, CityList.KHARTOUM,
                    CityList.KINSHASA, CityList.KOLKATA, CityList.LAGOS,
                    CityList.LIMA, CityList.LONDON, CityList.LOS_ANGELES,
                    CityList.MADRID, CityList.MANILA, CityList.MEXICO_CITY,
                    CityList.MIAMI, CityList.MILAN, CityList.MONTREAL,
                    CityList.MOSCOW, CityList.MUMBAI, CityList.NEW_YORK,
                    CityList.OSAKA, CityList.PARIS, CityList.RIYADH,
                     CityList.SANTIAGO,
                    CityList.SAO_PAULO, CityList.SEOUL, CityList.SHANGHAI,
                    CityList.ST_PETERSBURG, CityList.SYDNEY, CityList.TAIPEI,
                    CityList.TEHRAN, CityList.TOKYO, CityList.WASHINGTON));

    public static List<City> CITY_WITH_RESEARCH_STATION = new ArrayList<>();

    // Return a list with research station
    public static List<City> GET_CITIES_WITH_RESEARCH_STATION() {
        return CITY_WITH_RESEARCH_STATION;
    }

    // Function which implements the addition of a research station if it is a legal move
    public static boolean ADD_CITY_WITH_RESEARCH_STATION(City city) {
        if (!CITY_WITH_RESEARCH_STATION.contains(city) && (CITY_WITH_RESEARCH_STATION.size() < RESEARCH_STATIONS)) {
            CITY_WITH_RESEARCH_STATION.add(city);
            return true;
        }
        return false;
    }

    // Static cities for any valid uses
    public static Madrid madrid = new Madrid(0, 0, 0, 0, 0);
    public static London london = new London(0, 0, 0, 0, 0);
    public static Paris paris = new Paris(0, 0, 0, 0, 0);
    public static Essen essen = new Essen(0, 0, 0, 0, 0);
    public static Milan milan = new Milan(0, 0, 0, 0, 0);

    public static Bogota bogota = new Bogota(0, 0, 0, 0, 0);

    public static BuenosAires buenosaires = new BuenosAires(0, 0, 0, 0, 0);
    public static SaoPaulo saopaulo = new SaoPaulo(0, 0, 0, 0, 0);
    public static Lagos lagos = new Lagos(0, 0, 0, 0, 0);

    public static Algiers algiers = new Algiers(0, 0, 0, 0, 0);
    public static Istanbul istanbul = new Istanbul(0, 0, 0, 0, 0);
    public static Cairo cairo = new Cairo(0, 0, 0, 0, 0);
    public static Moscow moscow = new Moscow(0, 0, 0, 0, 0);
    public static Baghdad baghdad = new Baghdad(0, 0, 0, 0, 0);

    public static HongKong hongkong = new HongKong(0, 0, 0, 0, 0);

    public static Beijing beijing = new Beijing(0, 0, 0, 0, 0);
    public static Seoul seoul = new Seoul(0, 0, 0, 0, 0);
    public static Tokyo tokyo = new Tokyo(0, 0, 0, 0, 0);
    public static Osaka osaka = new Osaka(0, 0, 0, 0, 0);
    public static Taipei taipei = new Taipei(0, 0, 0, 0, 0);

    public static boolean isEpidemic = true;  // Events cards

    public static List<City> CITY_LIST = new ArrayList<>(Arrays.asList(osaka,
            tokyo, seoul, beijing, hongkong,
            baghdad, moscow, cairo, istanbul,
            algiers, lagos, saopaulo, buenosaires,
            bogota, milan, essen, paris, london, madrid
    ));
}
