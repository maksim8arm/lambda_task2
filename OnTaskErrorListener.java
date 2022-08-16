package rabotagi;

@FunctionalInterface
public interface OnTaskErrorListener {

    void onError(String result);

}
