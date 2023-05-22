package com.example.brico;

import androidx.annotation.NonNull;

public class Interv {
    public int iId;
    public String nomClient,mobileClient,titreInt,dateInt,description;
    public boolean ExeInt;
     public Interv(int iId, String nomClient, String mobileClient, String titreInt, String dateInt, String description,boolean ExeInt){
         this.iId=iId;
         this.nomClient=nomClient;
         this.mobileClient=mobileClient;
         this.titreInt=titreInt;
         this.dateInt=dateInt;
         this.description=description;
         this.ExeInt=ExeInt;
     }

    @NonNull
    @Override
    public String toString() {
        return "id" +iId;
    }

}
