package com.example.spongetoobog.technomancer.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.example.spongetoobog.technomancer.AlignmentType;
import com.example.spongetoobog.technomancer.ClassType;
import com.example.spongetoobog.technomancer.RaceType;
import com.example.spongetoobog.technomancer.SizeType;

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
    private SizeType size;

    @ColumnInfo(name="gender")
    private String gender;

    @ColumnInfo(name="age")
    private int age;

    @ColumnInfo(name="height")
    private int height;

    @ColumnInfo(name="weight")
    private int weight;

    @ColumnInfo(name="alignment")
    private AlignmentType alignment;

    @ColumnInfo(name="strength")
    private int strength;

    @ColumnInfo(name="dexterity")
    private int dexterity;

    @ColumnInfo(name="constitution")
    private int constitution;

    @ColumnInfo(name="intelligence")
    private int intelligence;

    @ColumnInfo(name="wisdom")
    private int wisdom;

    @ColumnInfo(name="charisma")
    private int charisma;

    @ColumnInfo(name="hp")
    private int hp;

    @ColumnInfo(name="fortitude")
    private int fortitude;

    @ColumnInfo(name="reflex")
    private int reflex;

    @ColumnInfo(name="will")
    private int will;

    @ColumnInfo(name="BAB")
    private int bab;

    @ColumnInfo(name="speed")
    private int speed;

    @ColumnInfo(name="gold")
    private double gold;
}
