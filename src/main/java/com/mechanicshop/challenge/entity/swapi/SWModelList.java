package com.mechanicshop.challenge.entity.swapi;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SWModelList<T> implements Serializable {
    public int count;
    public String next;
    public String previous;
    public List<T> results;

    public boolean hasMore() {
        return (next != null && !next.isEmpty());
    }
}
