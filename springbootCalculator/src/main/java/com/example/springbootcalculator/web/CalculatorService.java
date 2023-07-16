package com.example.springbootcalculator.web;

import com.example.springbootcalculator.entities.Operation;
import com.example.springbootcalculator.repository.OperationRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CalculatorService {
    private final OperationRepository operationRepository;
    public Integer makeOperation(Data data, String operator){
        if (operator.equals("add"))
            return  this.add(data);
        else if (operator.equals("multiply"))
            return this.multiply(data);
        else if (operator.equals("division"))
            return this.division(data);
        else
            return this.subtract(data);
    }
    private Integer add(Data data){
        Integer result = data.getNum1() + data.getNum2();
        operationRepository.save(new Operation(data.getNum1(), data.getNum2(), "ADD"));
        return result;
    }

    private Integer multiply(Data data){
        Integer result = data.getNum1() * data.getNum2();
        operationRepository.save(new Operation(data.getNum1(), data.getNum2(), "MULTIPLY"));
        return result;
    }
    private Integer subtract(Data data){
        Integer result = data.getNum1() - data.getNum2();
        operationRepository.save(new Operation(data.getNum1(), data.getNum2(), "SUBTRACT"));
        return result;
    }
    private Integer division(Data data){
        Integer result = data.getNum1() / data.getNum2();
        operationRepository.save(new Operation(data.getNum1(), data.getNum2(), "DIVISION"));
        return result;
    }

    public List<Operation> getOperations(){
        return operationRepository.findAll();
    }

}
