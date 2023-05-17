package com.example.GetApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepositoryInfo {
    private long id;
    private String node_id;
    private String name;
    private String full_name;
    private boolean is_private;
    private Owner owner;


    public long getId() {
        return id;
    }

    public String getNode_id() {
        return node_id;
    }

    public String getName() {
        return name;
    }

    public String getFull_name() {
        return full_name;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "RepositoryInfo{" +
                "id=" + id +
                ", node_id='" + node_id + '\'' +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", is_private=" + is_private +
                ", owner=" + owner +
                '}';
    }
}
