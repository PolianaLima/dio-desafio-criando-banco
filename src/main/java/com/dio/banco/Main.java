package com.dio.banco;

public class Main {
    public static void main(String[] args) {


        Cliente poliana  = new Cliente();
        poliana.setNome("Poliana Lima");

       Conta cc = new ContaCorrente(poliana);
       cc.depositar(100);

       Conta poupanca = new ContaPoupanca(poliana);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

