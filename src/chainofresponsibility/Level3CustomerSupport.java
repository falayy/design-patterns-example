package chainofresponsibility;

public class Level3CustomerSupport extends CustomerSupport{
    @Override
    public void handleIssue(String issue) {
        if ("complex".equals(issue)) {
            System.out.println("Level 3 CSR handles the complex issue.");
        } else {
            System.out.println("This issue cannot be handled.");
        }
    }
}
