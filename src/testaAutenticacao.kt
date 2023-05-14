fun testaAutenticacao(){

    val gerente = Gerente (
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor (
        nome = "Darley",
        cpf = "888.888.888-88",
        salario = 2000.0,
        senha = 2103,
        plr = 200.0
    )

    val cliente = Cliente (
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2103)
    sistema.entra(cliente, 1234)


}