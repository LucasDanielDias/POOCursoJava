package POOJAVA.composição;

public class Carro {
    Motor motor = new Motor();
    void acelerar(){
        motor.fatorInjeção += 0.4;
    }
    void frear(){
        if(motor.fatorInjeção >= 0.5) {
            motor.fatorInjeção -= 0.4;
        }
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estaligado(){
        return motor.ligado;
    }
}
