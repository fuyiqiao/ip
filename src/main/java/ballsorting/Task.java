package ballsorting;
public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String markDone() {
        this.isDone = true;
        return this.toString();
    }

    public String markNotDone() {
        this.isDone = false;
        return this.toString();
    }
    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }
    public String toStorageString() {
        return "Task";
    }
}