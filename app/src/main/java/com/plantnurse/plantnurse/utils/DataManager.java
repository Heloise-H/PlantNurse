package com.plantnurse.plantnurse.utils;
import com.plantnurse.plantnurse.Network.GetIndexResponse;
import com.plantnurse.plantnurse.Network.GetMyPlantResponse;
import com.plantnurse.plantnurse.Network.WeatherResponse;
/**
 * Created by Cookie_D on 2016/8/23.
 */
public class DataManager {
    private DataManager(){
    }
    public static WeatherResponse mWeatherResponse;
    public static GetIndexResponse mPlantIndex;
    public static GetMyPlantResponse myPlantResponse;
    public static GetMyPlantResponse getMyPlant() {
        return myPlantResponse;
    }
    public static void setMyPlant(GetMyPlantResponse myPlantResponse) {
        DataManager.myPlantResponse = myPlantResponse;
    }
    public static WeatherResponse getWeatherInfo(){
        return mWeatherResponse;
    }
    public static void setWeatherInfo(WeatherResponse a){
        mWeatherResponse=a;
    }
    public static GetIndexResponse getPlantIndex(){
        return mPlantIndex;
    }
    public static void setPlantIndex(GetIndexResponse a){
        mPlantIndex=a;
    }


}
