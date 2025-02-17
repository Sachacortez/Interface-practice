package ExerciseUn.Classes;

import ExerciseUn.Interfaces.PlayableInterface;

public class MovieClass implements PlayableInterface {

    private String name;
    private int length;

    public MovieClass(String _name, int _length) {
        name = _name;
        length = _length;
    }

    @Override
    public void pause() {
        System.out.println(name + ", of " + length + " minutes, paused");
    }

    @Override
    public void play() {
        System.out.println(name + ", of " + length + " minutes, playing");
    }

    @Override
    public void stop() {
        System.out.println(name + ", of " + length + " minutes, stopped");
    }

    public String getName() {
        return name;
    }

}
