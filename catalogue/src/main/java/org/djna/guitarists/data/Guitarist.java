package org.djna.guitarists.data;

public class Guitarist implements Comparable {
    private int id;
    private String name;
    private Object[] albums;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Object[] getAlbums() {
        return albums;
    }

    @Override
    public String toString() {
        return "Guitarist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if ( o == null || (! (o instanceof Guitarist))){
            return 1;
        }
        Guitarist otherGuitarist = (Guitarist) o;
        return getName().compareTo(otherGuitarist.getName());
    }
}
