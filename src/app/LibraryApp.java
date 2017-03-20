package app;


/**
 * Created by VADMIN on 2017-03-20.
 */
public class LibraryApp {
    private static void main(String[] args) {
        final String APP_NAME = "Biblioteka v0.7";
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
