package com.example.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Store {
    private Map<Store, CarSpeaker> carSpeakers = new TreeMap<Store, CarSpeaker>();
    private Map<Store, homeSpeaker> homeSpeakers = new TreeMap<Store, homeSpeaker>();

    private List<String> storeOwners = new ArrayList<String>(100);
    private List<Byte> keySig = new ArrayList<Byte>(256);

}
