package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Store {
    private Map<Manufacture, CarSpeaker> carSpeakers = new TreeMap<Manufacture, CarSpeaker>();
    private Map<Manufacture, homeSpeaker> homeSpeakers = new TreeMap<Manufacture, homeSpeaker>();

    private List<String> storeOwners = new ArrayList<String>(100);
    private List<Byte> keySig = new ArrayList<Byte>(256);

    public void addCarSpeaker(Manufacture at, CarSpeaker carSpeaker) {
        carSpeakers.put(at, carSpeaker);
    }

    public void addHomeSpeaker(Manufacture at, homeSpeaker homeSpeaker) {
        homeSpeakers.put(at, homeSpeaker);
    }

    public Set<Manufacture>getCarSpeakerMans() {
        return carSpeakers.keySet();
    }

    public Set<Manufacture>getHomeSpeakerMans() {
        return homeSpeakers.keySet();
    }

    public CarSpeaker getCarSpeaker(Manufacture at) {
        return carSpeakers.get(at);
    }

    public homeSpeaker getHomeSpeaker(Manufacture at) {
        return homeSpeakers.get(at);
    }

}
