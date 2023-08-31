import java.util.ArrayList;

public class TaskList {
    ArrayList<Task> tasks;
    public TaskList() {
        this.tasks = new ArrayList<>();
    }
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task t) {
        tasks.add(t);
        System.out.println("Got it. I've added this task:");
        System.out.println(t.toString());
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
        System.out.println(Ballsorter.line);
    }
    public void addTaskSilent(Task t) {
        tasks.add(t);
    }
    public void deleteTask(int target) {
        if (target >= tasks.size()) {
            System.out.println("☹ OOPS!!! This task does not exist");
            System.out.println(Ballsorter.line);
        } else {
            System.out.println("Noted. I've removed this task:");
            System.out.println(tasks.get(target).toString());
            tasks.remove(target);
            System.out.println("Now you have " + tasks.size() + " tasks in the list.");
            System.out.println(Ballsorter.line);
        }
    }
    public void markTask(int target) {
        if (target >= tasks.size()) {
            System.out.println("☹ OOPS!!! This task does not exist");
            System.out.println(Ballsorter.line);
        } else {
            System.out.println("Nice! I've marked this task as done:");
            System.out.println(tasks.get(target).markDone());
            System.out.println(Ballsorter.line);
        }
    }
    public void unmarkTask(int target) {
        if (target >= tasks.size()) {
            System.out.println("☹ OOPS!!! This task does not exist");
            System.out.println(Ballsorter.line);
        } else {
            System.out.println("OK, I've marked this task as not done yet:");
            System.out.println(tasks.get(target).markNotDone());
            System.out.println(Ballsorter.line);
        }
    }
    public int getNumOfTasks() {
        return tasks.size();
    }
    public void printList() {
        if (tasks.size() == 0) {
            System.out.println("You do not have any tasks yet ☹");
        }
        for (int i = 0; i < tasks.size(); i++) {
            int temp = i + 1;
            System.out.println(temp + ". " + tasks.get(i).toString());
        }
    }
    public String storeList() {
        StringBuilder store = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {
            store.append(String.format(tasks.get(i).toStorageString() + "%n"));
        }
        return store.toString();
    }
}
