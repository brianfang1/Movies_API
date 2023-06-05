package com.brianfang.Movies_API;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Movie {

    @Id
    private String tconst;

    @Column(name = "titleType")
    private String titleType;

    @Column(name = "primaryTitle")
    private String primaryTitle;

    @Column(name = "originalTitle")
    private String originalTitle;

    @Column(name = "isAdult")
    private boolean isAdult;

    @Column(name = "startYear")
    private int startYear;

    @Column(name = "runtimeMinutes")
    private int runtimeMinutes;

    private Movie() {}

    public Movie(String tconst, String titleType, String primaryTitle, String originalTitle, boolean isAdult, int startYear, int runtimeMinutes) {
        this.tconst = tconst;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.runtimeMinutes = runtimeMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(tconst, movie.tconst) &&
            Objects.equals(titleType, movie.titleType) &&
            Objects.equals(primaryTitle, movie.primaryTitle) &&
            Objects.equals(originalTitle, movie.originalTitle) &&
            Objects.equals(isAdult, movie.isAdult) &&
            Objects.equals(startYear, movie.startYear) &&
            Objects.equals(runtimeMinutes, movie.runtimeMinutes);

    }

    @Override
    public int hashCode() {
        return Objects.hash(tconst, titleType, primaryTitle, originalTitle, isAdult, startYear, runtimeMinutes);
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public boolean getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(Boolean isAdult) {
        this.isAdult = isAdult;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "tconst=" + tconst + 
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult='" + isAdult + '\'' +
                ", startYear='" + startYear + '\'' +
                ", runtimeMinutes='" + runtimeMinutes + '\'' +
                '}';
    }


}
