package com.example.spongetoobog.technomancer.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.example.spongetoobog.technomancer.AlignmentType;
import com.example.spongetoobog.technomancer.ClassType;
import com.example.spongetoobog.technomancer.RaceType;

@Entity
public class Character {

    @PrimaryKey(autoGenerate = true)
    private int characId;

    @ColumnInfo(name="name")
    private String name;

    @ColumnInfo(name="cClass")
    private ClassType characClass;

    @ColumnInfo(name="level")
    private int level;

    @ColumnInfo(name="race")
    private RaceType race;

    @ColumnInfo(name="size")
    private String size;

    @ColumnInfo(name="gender")
    private String gender;

    @ColumnInfo(name="age")
    private int age;

    @ColumnInfo(name="height")
    private int height;

    @ColumnInfo(name="weight")
    private String weight;

    @ColumnInfo(name="alignment")
    private AlignmentType alignment;
}
