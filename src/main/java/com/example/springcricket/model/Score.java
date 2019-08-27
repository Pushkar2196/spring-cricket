package com.example.springcricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Score {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "team1")
    private String team1;
    @Column(name = "team2")
    private String team2;
    @Column(name = "innings_no")
    private int inningsNo;
    @Column(name = "over_no")
    private int overNo;
    @Column(name = "first_inn_score")
    private int firstInnScore;
    @Column(name = "target")
    private int target;
    @Column(name = "second_inn_score")
    private int secondInnScore;
    @Column(name = "striker")
    private String striker;
    @Column(name = "non_striker")
    private String nonStriker;
    @Column(name = "current_bowler")
    private String currentBowler;

    public Score() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getInningsNo() {
        return inningsNo;
    }

    public void setInningsNo(int inningsNo) {
        this.inningsNo = inningsNo;
    }

    public int getOverNo() {
        return overNo;
    }

    public void setOverNo(int overNo) {
        this.overNo = overNo;
    }

    public int getFirstInnScore() {
        return firstInnScore;
    }

    public void setFirstInnScore(int firstInnScore) {
        this.firstInnScore = firstInnScore;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getSecondInnScore() {
        return secondInnScore;
    }

    public void setSecondInnScore(int secondInnScore) {
        this.secondInnScore = secondInnScore;
    }

    public String getStriker() {
        return striker;
    }

    public void setStriker(String striker) {
        this.striker = striker;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public String getCurrentBowler() {
        return currentBowler;
    }

    public void setCurrentBowler(String currentBowler) {
        this.currentBowler = currentBowler;
    }
}
