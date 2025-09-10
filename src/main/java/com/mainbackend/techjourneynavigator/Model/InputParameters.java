package com.mainbackend.techjourneynavigator.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class InputParameters {
    @Id
    private int id;
    private int NumberOfDays;
    private Date StartDate;
    private Date EndDate;
    private String Intrests;
    private String Travellingwith;
    private int Budget;
    private String TravelPace;
    private String MustSeeAttraction;
    private String TingsToAvoid;
    private String AnySpecialInstructions;
    private String Country;
    private String PreferedModeOfTransport;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfDays() {
        return NumberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        NumberOfDays = numberOfDays;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getIntrests() {
        return Intrests;
    }

    public void setIntrests(String intrests) {
        Intrests = intrests;
    }

    public String getTravellingwith() {
        return Travellingwith;
    }

    public void setTravellingwith(String travellingwith) {
        Travellingwith = travellingwith;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

    public String getTravelPace() {
        return TravelPace;
    }

    public void setTravelPace(String travelPace) {
        TravelPace = travelPace;
    }

    public String getMustSeeAttraction() {
        return MustSeeAttraction;
    }

    public void setMustSeeAttraction(String mustSeeAttraction) {
        MustSeeAttraction = mustSeeAttraction;
    }

    public String getTingsToAvoid() {
        return TingsToAvoid;
    }

    public void setTingsToAvoid(String tingsToAvoid) {
        TingsToAvoid = tingsToAvoid;
    }

    public String getAnySpecialInstructions() {
        return AnySpecialInstructions;
    }

    public void setAnySpecialInstructions(String anySpecialInstructions) {
        AnySpecialInstructions = anySpecialInstructions;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPreferedModeOfTransport() {
        return PreferedModeOfTransport;
    }

    public void setPreferedModeOfTransport(String preferedModeOfTransport) {
        PreferedModeOfTransport = preferedModeOfTransport;
    }

    @Override
    public String toString() {
        return "InputParameters{" +
                "id=" + id +
                ", NumberOfDays=" + NumberOfDays +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", Intrests='" + Intrests + '\'' +
                ", Travellingwith='" + Travellingwith + '\'' +
                ", Budget=" + Budget +
                ", TravelPace='" + TravelPace + '\'' +
                ", MustSeeAttraction='" + MustSeeAttraction + '\'' +
                ", TingsToAvoid='" + TingsToAvoid + '\'' +
                ", AnySpecialInstructions='" + AnySpecialInstructions + '\'' +
                ", Country='" + Country + '\'' +
                ", PreferedModeOfTransport='" + PreferedModeOfTransport + '\'' +
                '}';
    }
}
