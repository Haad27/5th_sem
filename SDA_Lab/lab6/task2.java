package lab6;

public class task2 {

    interface Switchable {
        void turnOn();

        void turnOff();
    }

    interface Musicplayable {
        void playMusic();
    }

    interface TemperatureDisplay {
        void displayTemperature();
    }

    class SmartSpeaker implements Switchable, Musicplayable, TemperatureDisplay {
        public void turnOn() {
            System.out.println("Speaker turned on");
        }

        public void turnOff() {
            System.out.println("Speaker turned off");
        }

        public void playMusic() {
            System.out.println("Playing music");
        }

        public void displayTemperature() {
            System.out.println("Temperature: 25°C");
        }
    }

    class SmartLight implements Switchable {
        public void turnOn() {
            System.out.println("Light turned on");
        }

        public void turnOff() {
            System.out.println("Light turned off");
        }

    }

    public void main(String[] argv) {
        Switchable s = new SmartSpeaker();
        Musicplayable m = new SmartSpeaker();
        TemperatureDisplay t = new SmartSpeaker();

        Switchable ss = new SmartLight();

        s.turnOff();
        s.turnOn();
        m.playMusic();
        t.displayTemperature();

        ss.turnOff();
        ss.turnOn();
    }
}
