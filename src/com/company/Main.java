package com.company;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();
        System.out.println("Введите сумму денег");
        double money = sc.nextDouble();

        System.out.println(" Конвертировать валюту в");
        Scanner scan = new Scanner(System.in);
        String currency = scan.nextLine();

        URL connector = new URL("http://www.nbrb.by/api/exrates/rates/" + currency + "?parammode=2");
        String out = new Scanner(connector.openStream(), "UTF-8").useDelimiter("\\A").nextLine();
        LinkedTreeMap answer = gson.fromJson(out, LinkedTreeMap.class);
        double currentcurrency = (double)answer.get("Cur_OfficialRate");
        System.out.println(money/currentcurrency);
    }
}
