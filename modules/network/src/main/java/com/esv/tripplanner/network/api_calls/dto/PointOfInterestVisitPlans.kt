package com.esv.tripplanner.network.api_calls.dto

data class PointOfInterestVisitPlans (

	var poiVisitPlanId : Int,
	var poiId : Int,
	var isStartPoint : Boolean,
	var location : Location,
	var workingHours : WorkingHours,
	var visitTimeHrs : Double?
)