package com.uni.patterns.stateObserverChain.chain;

import com.uni.patterns.stateObserverChain.observer.Employee;
import com.uni.patterns.stateObserverChain.observer.ShipmentType;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class EmployeeHandler<T extends Employee> {
    @NonNull
    private Object employee;
    private EmployeeHandler<T> handler;
    private ShipmentType shipmentType;

    public void setNextEmployee(EmployeeHandler<T> handler) {
        this.handler = handler;
    }
}
