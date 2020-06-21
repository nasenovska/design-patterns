package com.uni.patterns.stateObserverChain.chain;

import com.uni.patterns.stateObserverChain.observer.Cashier;

public class CashierHandler extends EmployeeHandler<Cashier> {

    public CashierHandler(Cashier cashier) {
        super(cashier);
    }

    @Override
    public void setNextEmployee(EmployeeHandler<Cashier> handler) {
        super.setNextEmployee(handler);
    }
}
