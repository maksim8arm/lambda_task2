package rabotagi;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;


    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callError) {
        this.callback = callback;
        this.error = callError;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                error.onError("Task " + i + " isn't done!!!");
            } else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }

}
