import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class poll{
     private String title;
    private List<Candidate> candidates;
    private Map<Candidate, Integer> results;

    public Poll(String title, List<Candidate> candidates) {
        this.title = title;
        this.candidates = candidates;
        this.results = new HashMap<>();
    }

    public void vote(Candidate candidate) {
        results.put(candidate, results.getOrDefault(candidate, 0) + 1);
    }

    public Map<Candidate, Integer> getResults() {
        return results;
    }

    // Getter for title and candidates
    public String getTitle() {
        return title;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }



}