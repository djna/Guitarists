package org.djna.guitarists.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.stream.Stream;

public class GuitaristList {

    @JsonProperty(value = "guitarists")
    Guitarist[] guitaristArray;

    @Override
    public String toString() {
        return "GuitaristList{" +
                "guitaristArray=" + Arrays.toString(guitaristArray) +
                '}';
    }

    public Stream<Guitarist> getGuitarists() {
        return Arrays.stream(guitaristArray);
    }
}
