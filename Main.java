import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        PollingSystem system = new PollingSystem();

        // Register users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        system.registerUser(username, password);

        // Add candidates
        System.out.print("Enter candidate name: ");
        String candidateName = scanner.nextLine();
        System.out.print("Enter candidate party: ");
        String candidateParty = scanner.nextLine();
        system.addCandidate(candidateName, candidateParty);

        // Create a poll
        List<Candidate> pollCandidates = system.getCandidates();
        system.createPoll("Presidential Poll 2023", pollCandidates);

        // Users participate in the poll
        Poll poll = system.getPolls().get(0);
        System.out.print("Select a candidate: ");
        int candidateIndex = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character
        Candidate selectedCandidate = pollCandidates.get(0);
        system.voteInPoll(poll, selectedCandidate);

        // Get and display poll results
        Map<Candidate, Integer> pollResults = poll.getResults();
        for (Entry<Candidate, Integer> entry : pollResults.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue() + " votes");
        }

        // Close the scanner
        scanner.close();
    }
}
