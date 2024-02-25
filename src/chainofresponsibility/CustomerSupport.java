package chainofresponsibility;

public abstract class CustomerSupport {
    protected CustomerSupport nextLevel;

    public void setNextLevel(CustomerSupport nextLevel) {
        this.nextLevel = nextLevel;
    }

    public abstract void handleIssue(String issue);
}
