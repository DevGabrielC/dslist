package com.gabrielcdev.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long id;
    private String name;

    public GameList() {}

    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
