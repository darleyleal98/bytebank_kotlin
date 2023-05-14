fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.deposita(100.0)
    contaPoupanca.deposita(100.0)

    println("Saldo após saque corrente ${contaCorrente.saldo}")
    println("Saldo após saque poupanca ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo após saque corrente ${contaCorrente.saldo}")
    println("Saldo após saque poupanca ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("Saldo após saque corrente ${contaCorrente.saldo}")
    println("Saldo após saque poupanca ${contaPoupanca.saldo}")
}
