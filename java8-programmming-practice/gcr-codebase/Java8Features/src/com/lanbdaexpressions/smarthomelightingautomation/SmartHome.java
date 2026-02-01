package com.lanbdaexpressions.smarthomelightingautomation;

public class SmartHome {
	public static void main(String [] args) {
		LightAction motionTrigger=()->
			System.out.println("Motion detected: Turning ON bright white lights");
		
		LightAction timeTrigger=()->
		System.out.println("Time detected: Turning ON dim lights");
		
		LightAction voiceTrigger=()->
		System.out.println("Voice Detected");
		
		motionTrigger.activate();
		timeTrigger.activate();
		voiceTrigger.activate();
	}
}
