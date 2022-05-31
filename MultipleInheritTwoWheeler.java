package com;           //MultipleInheritance

public class MultipleInheritTwoWheeler implements MultipleInheritMotor, MultipleInheritCycle {

	 int totalDistance;
	 int avgSpeed;
	 public void totalDistance()
	 {
		 totalDistance = speed*distance;
		 System.out.println("Total Distance Travelled: "+totalDistance);
	 }
	 public void speed()
	 {
		 int avgSpeed = totalDistance/speed;
		 System.out.println("Average speed maintained: "+avgSpeed);
	 }
}
