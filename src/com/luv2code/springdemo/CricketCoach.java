package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	
	private String team;
	
	
	//create a noarg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Pratice fast bowling for 15 min";
	}


	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter emailAddress method");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter team method");

		this.team = team;
	}

	@Override
	public String getDaiyFortune() {
		return fortuneService.getFortune();
	}
	

}
