package org.djna.guitarists.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class GuitaristList {

    @JsonProperty(value = "guitarists")
    Guitarist[] guitaristArray;

    @Override
    public String toString() {
        return "GuitaristList{" +
                "guitaristArray=" + Arrays.toString(guitaristArray) +
                '}';
    }
}
