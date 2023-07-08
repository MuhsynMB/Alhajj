import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Candidate{
    private String name;
    private String party;

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
    }

    // Getters and setters for name, party, and other candidate details

    public String getName() {
        return name;
    }

    public String getParty(){
        return party;
    }
}