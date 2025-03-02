/*
 * TravelLog Class.
 */

import javax.sound.midi.Sequence;

import components.sequence.Sequence1L;

public class TravelLog {
    private Sequence<TripEntry> log;

    public TravelLog() {
        log = new Sequence1L<>();
    }

    public void addEntry(String description, String location, String date) {
        TripEntry entry = new TripEntry(description, location, date);
        log.add(log.length(), entry);
    }

    public TripEntry removeEntry(int index) {
        return log.remove(index);
    }

    public int size() {
        return log.length();
    }

    public void clearLog() {
        log.clear();
    }
}