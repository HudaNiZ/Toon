package com.mycompany.project3ap;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class players implements java.io.Serializable {
    
    @Id
    @Column(name = "player_id")
    private int id;
    @Column(name = "player_name")
    private String playername;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "ProfilePicture")
    private String ProfilePicture;

    public players() { }
    
    public players(String email) {
        this.email = email;
    }
    
    public players(String playerName, String email, String password) {
	this.playername = playerName;
	this.email = email;
	this.password = password;
    }
    
    public players(int id, String playerName, String email, String password) {
	this.id = id;
	this.playername = playerName;
	this.email = email;
	this.password = password;
    }
    
    public players(int id, String playerName, String email, String password, String picture) {
	this.id = id;
	this.playername = playerName;
	this.email = email;
	this.password = password;
        this.ProfilePicture = picture;
    }
    
    public int getId() {
	return id;
    }
    public void setId(int id) {
	this.id = id;
    }

    public String getPlayerName() {
	return playername;
    }
    public void setPlayerName(String playerName) {
	this.playername = playerName;
    }
    
    public String getEmail() {
	return email;
    }
    public void setEmail(String email) {
	this.email = email;
    }
    
    public String getPassword() {
	return password;
    }
    public void setPassword(String password) {
	this.password = password;
    }
    
    public String getProfilePicture() {
	return ProfilePicture;
    }
    public void setProfilePicture(String picture) {
	this.ProfilePicture = picture;
    }
    
}
