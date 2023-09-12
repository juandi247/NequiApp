package com.juandiegodiaz.mywalletappjuandi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {


    private ArrayList<Account>listAccountRV=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account2);
loadFakeData();
    }

    private void loadFakeData(){


        Account myAccount1=new Account("Bancolombia","cuenta corriente",1000000.2);
        Account myAccount2=new Account("Davivienda","cuenta ahorros",1000000.2);
        Account myAccount3=new Account("Banco de bogota","tarjeta credito",1000000.2);

listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }
}