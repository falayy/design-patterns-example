package chainofresponsibility;

public class Level2CustomerSupport extends CustomerSupport{
    @Override
    public void handleIssue(String issue) {
        if ("intermediate".equals(issue)) {
            System.out.println("Level 2 CSR handles the intermediate issue.");
        } else if (nextLevel != null) {
            nextLevel.handleIssue(issue);
        }
    }
}
