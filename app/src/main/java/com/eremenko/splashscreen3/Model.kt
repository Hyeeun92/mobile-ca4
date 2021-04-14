package com.eremenko.splashscreen3

class Stations(val bikestations: List<bikeStation>)

class bikeStation(val number:Int, val contract_name: String, val name: String, val address: String,
                  val position: position, val banking: Boolean, val bonus: Boolean,
                  val bike_stands: Int, val available_bike_stands: String, val available_bikes: String,
                  val status: String, val last_update: String)

class position(val lat: Double, val lng: Double)

