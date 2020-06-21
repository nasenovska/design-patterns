package com.uni.patterns.stateObserverChain;

import com.uni.patterns.stateObserverChain.chain.CashierHandler;
import com.uni.patterns.stateObserverChain.chain.EmployeeHandler;
import com.uni.patterns.stateObserverChain.chain.ForwarderHandler;
import com.uni.patterns.stateObserverChain.observer.Cashier;
import com.uni.patterns.stateObserverChain.observer.Forwarder;
import com.uni.patterns.stateObserverChain.observer.Shipment;
import com.uni.patterns.stateObserverChain.observer.ShipmentType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cashier cashier1 = new Cashier("Cashier 1", ShipmentType.BULGARIA);
        Shipment shipment1 = new Shipment("id1");
        cashier1.subscribe(shipment1);
        Cashier cashier2 = new Cashier("Cashier 2", ShipmentType.FOREIGN);
        Shipment shipment2 = new Shipment("id2");
        cashier2.subscribe(shipment2);
        Cashier cashier3 = new Cashier("Cashier 3", ShipmentType.PLOVDIV);
        Shipment shipment3 = new Shipment("id3");
        cashier3.subscribe(shipment3);
        Forwarder forwarder = new Forwarder(ShipmentType.FORWARD);

        List<EmployeeHandler<?>> handlers = Arrays.asList(
                new CashierHandler(cashier1),
                new CashierHandler(cashier2),
                new CashierHandler(cashier3),
                new ForwarderHandler(forwarder));
    }
}
