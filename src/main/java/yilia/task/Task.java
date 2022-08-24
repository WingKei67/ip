package yilia.task;

/**
 * Represents an abstract task.
 */
public class Task {
    private boolean isDone = false;
    private final String content;
    public Task(String content) {
        this.content = content;
    }
    /**
     * Class constructor specifying the content and whether it is done.
     */
    public Task(String content, boolean isDone) {
        this(content);
        this.isDone = isDone;
    }
    public void check() {
        isDone = true;
    }
    public void uncheck() {
        isDone = false;
    }
    public boolean status() {
        return isDone;
    }
    @Override
    public String toString() {
        return "[" + (isDone ? 'X' : ' ') + "] " + content;
    }
    public String parse() {
        return content;
    }
}
