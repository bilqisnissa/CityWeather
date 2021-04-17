package com.muflihunnisa.cityweather.model

import com.google.gson.annotations.SerializedName
import com.muflihunnisa.cityweather.model.all.City
import com.muflihunnisa.cityweather.model.all.Clouds
import com.muflihunnisa.cityweather.model.all.Main
import com.muflihunnisa.cityweather.model.all.Rain
import com.muflihunnisa.cityweather.model.all.Sys
import com.muflihunnisa.cityweather.model.all.Wind

data class ForecastResponse(

	@field:SerializedName("city")
	val city: City? = null,

	@field:SerializedName("cnt")
	val cnt: Int? = null,

	@field:SerializedName("cod")
	val cod: String? = null,

	@field:SerializedName("message")
	val message: Int? = null,

	@field:SerializedName("list")
	val list: List<ListItem?>? = null
)

data class ListItem(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("pop")
	val pop: Double? = null,

	@field:SerializedName("rain")
	val rain: Rain? = null,

	@field:SerializedName("visibility")
	val visibility: Int? = null,

	@field:SerializedName("dt_txt")
	val dtTxt: String? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherItem?>? = null,

	@field:SerializedName("main")
	val main: Main? = null,

	@field:SerializedName("clouds")
	val clouds: Clouds? = null,

	@field:SerializedName("sys")
	val sys: Sys? = null,

	@field:SerializedName("wind")
	val wind: Wind? = null
)




