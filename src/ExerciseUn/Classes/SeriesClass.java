package ExerciseUn.Classes;

import ExerciseUn.Interfaces.PlayableInterface;

public class SeriesClass implements PlayableInterface {

    private int episodes;
    private String name;

    public SeriesClass(int _episodes, String _name) {
        name = _name;
        episodes = _episodes;
    }

    @Override
    public void pause() {
        System.out.println(name + ", of " + episodes + " episodes, paused");
    }

    @Override
    public void play() {
        System.out.println(name + ", of " + episodes + " episodes, playing");
    }

    @Override
    public void stop() {
        System.out.println(name + ", of " + episodes + " episodes, playing stopped");
    }

    public String getName() {
        return name;
    }
    
}
