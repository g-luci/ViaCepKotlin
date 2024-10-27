package org.example

import org.example.ui.MainActivity

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val mainActivity = MainActivity()
    val cep = "30640410" // Exemplo de CEP

    mainActivity.obterEndereco(cep) { endereco ->
        if (endereco != null) {
            // Imprime os detalhes do endereço
            println("Logradouro: ${endereco.logradouro}")
            println("Bairro: ${endereco.bairro}")
            println("Cidade: ${endereco.localidade}")
            println("UF: ${endereco.uf}")
        } else {
            println("Endereço não encontrado ou ocorreu um erro.")
        }
    }

    // Mantém o programa em execução até que as requisições sejam concluídas
    println("Buscando endereço... (pressione Enter para sair)")
    readLine()
}