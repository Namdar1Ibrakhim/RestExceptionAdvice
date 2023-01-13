package com.example.restexceptionsovet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//Это класс совет Rest контроллера
public class ExceptionControllerAdvice {


    //Метод обработчик исключений в котором реализована логика,
    //связанная с исключением NotEnoughMoneyException

    //Взамен мы создали отдельный класс ExceptionControllerAdvice, в котором
    //выполняется все, что нужно в случае, если действие контроллера выдает исключение NotEnoughMoneyException.
    //Класс ExceptionControllerAdvice — это совет REST-контроллера. Чтобы отметить его как совет, мы воспользовались
    //аннотацией @RestControlelerAdvice. Метод, определенный в данном классе, называют также обработчиком исключения.
    //Чтобы обозначить, какие именно исключения активируют выполнение этого метода, перед ним ставится аннотация @ExceptionHandler


    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to make the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
