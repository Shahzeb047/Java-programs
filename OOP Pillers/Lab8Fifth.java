// Third-party Library Class
class Music {

    void initialize() {
        System.out.println("Music system initialized");
    }

    void play() {
        System.out.println("Playing music from Music library");
    }
}

// Sony Class
class Sony extends Music {

    // Sony overrides play() and disables it
    @Override
    void play() {
        System.out.println("Sony does not use play() method anymore");
    }
}

// Panasonic Class
class Panasonic extends Music {
    // No override → uses original play() method
}

// Main Class
public class Lab8Fifth {
    public static void main(String[] args) {

        Sony sony = new Sony();
        Panasonic panasonic = new Panasonic();

        System.out.println("Sony Output:");
        sony.initialize();
        sony.play();

        System.out.println("\nPanasonic Output:");
        panasonic.initialize();
        panasonic.play();
    }
}