package com.nashss.se.musicplaylistservice.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "triathlon")
public class Triathlon {
    private String userId; //the specific user //HASH
    private String workoutId; //Specific workout HASH for GSI???
    private String date; //LocalDateTime converted //SORT
    private String workoutType; //ENUM CLASS OF "RUNNING", "BIKING", "SWIMMING"
    private Integer hours;
    private Integer minutes;
    private Integer seconds;
    private Double distance; //distance traveled

    @DynamoDBIndexHashKey(globalSecondaryIndexName = "user_id-index", attributeName = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @DynamoDBHashKey(attributeName = "workout_id")
    public String getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(String workoutId) {
        this.workoutId = workoutId;
    }

    @DynamoDBIndexHashKey(globalSecondaryIndexName = "date_of_workout-index", attributeName = "date_of_workout")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @DynamoDBIndexHashKey(globalSecondaryIndexName = "workout_type-index", attributeName = "workout_type")
    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    @DynamoDBAttribute(attributeName = "hours")
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @DynamoDBAttribute(attributeName = "minutes")
    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @DynamoDBAttribute(attributeName = "seconds")
    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }
    @DynamoDBAttribute(attributeName = "workout_distance")
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}