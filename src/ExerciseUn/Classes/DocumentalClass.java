package ExerciseUn.Classes;

import ExerciseUn.Interfaces.PlayableInterface;

public class DocumentalClass implements PlayableInterface {

    private String topic;

    public DocumentalClass(String _topic) {
        topic = _topic;
    }

    @Override
    public void pause() {
        System.out.println("Documental about " + topic + "paused...");
    }

    @Override
    public void play() {
        System.out.println("Zzz");
    }

    @Override
    public void stop() {
        System.out.println("Documental about " + topic + "stopped!");
    }

    @Override
    public String getName() {
        return topic;
    }
    
}
