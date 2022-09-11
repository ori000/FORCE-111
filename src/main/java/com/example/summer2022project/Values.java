package com.example.summer2022project;

public interface Values {

    //int valMoney = 100, valNukes = 0, valAtomic = 10, valPersonnel = 3000, valArmored = 60, valLight = 170, valAircraft = 30, valArtillary = 5, valSubmarine = 2, valDestroyer= 0, valFrigate = 2, valCorvette  = 3, valCarrier = 1;
    void increaseMon();
    void increasePersonnel();
    void increaseNuke();
    void increaseAtomic();
    void increaseLight();
    void increaseArmored();
    void increaseArtillary();
    void increaseAircraft();
    void increaseSub();
    void increaseFrig();
    void increaseCorvette();
    void increaseDestroyer();
    void increaseCarrier();
    
    void reDeploy();
    void decreaseMonPersonnel();
    void decreaseMonLight_Artillary();
    void decreaseMonHeavy();
    void decreaseMonAir();
    void decreaseMonNuke();
    void decreaseMonAtomic();

    void decreasePersonnel();
    void decreaseNuke();
    void decreaseAtomic();
    void decreaseLight();
    void decreaseArmored();
    void decreaseArtillary();
    void decreaseAircraft();
    void decreaseSub();
    void decreaseFrig();
    void decreaseCorvette();
    void decreaseDestroyer();
    void decreaseCarrier();
    
    int IncreasePersonnel();
    int IncreaseLight();
    int IncreaseArmored();
    int IncreaseArtillary();
    int IncreaseAircraft();
    int IncreaseSub();
    int IncreaseFrig();
    int IncreaseCorvette();
    int IncreaseDestroyer();
    int IncreaseCarrier();
}
