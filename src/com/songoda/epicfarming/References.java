package com.songoda.epicfarming;

public class References {

    private String prefix = null;

    public References() {
        prefix = Lang.PREFIX.getConfigValue() + " ";
    }

    public String getPrefix() {
        return this.prefix;
    }
}
