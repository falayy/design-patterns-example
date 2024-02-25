package chainofresponsibility;

public class Level1CustomerSupport extends CustomerSupport{
    @Override
    public void handleIssue(String issue) {
        if ("basic".equals(issue)) {
            System.out.println("Level 1 CSR handles the basic issue.");
        } else if (nextLevel != null) {
            nextLevel.handleIssue(issue);
        }
    }
}
