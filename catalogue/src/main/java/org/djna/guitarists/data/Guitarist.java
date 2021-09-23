package org.djna.guitarists.data;

public class Guitarist {
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


}
