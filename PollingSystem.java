import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PollingSystem {
   private List<User> users;
    private List<Candidate> candidates;
    private List<Poll> polls;

    public PollingSystem() {
        this.users = new ArrayList<>();
        this.candidates = new ArrayList<>();
        this.polls = new ArrayList<>();
    }

    public void registerUser(String username, String password) {
        User newUser = new User(username, password);
        users.add(newUser);
    }

    public void addCandidate(String name, String party) {
        Candidate newCandidate = new Candidate(name, party);
        candidates.add(newCandidate);
    }

    public void createPoll(String title, List<Candidate> candidates) {
        Poll newPoll = new Poll(title, candidates);
        polls.add(newPoll);
    }

    public void voteInPoll(Poll poll, Candidate candidate) {
        poll.vote(candidate);
    }

    // Getter for users
    public List<User> getUsers() {
        return users;
 }

    // Getter for candidates
    public List<Candidate> getCandidates() {
        return candidates;
    }

    // Getter for polls
    public List<Poll> getPolls() {
        return polls;
    }
 
}
    

