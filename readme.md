# Sistema gerenciador de Transações

O SGT tem a função de gerenciar as transações de usuários cadastrados no sistema.

# WIP - O que precisa ser feito?

* CreateAccountUseCase
  * Só permitir usuários maiores de idade(18 anos) a se cadastrarem no sistema;
  * O usuário não pode ter o cpf negativado para se cadastrar no sistema;
  * Sempre que um usuário for cadastrado, uma carteira deve ser criada e associada a ele.
* ChangeStatusUseCase
  * Usuário pode bloquear e desbloquear sua conta. 
* GetAccountStatementUseCase
  * Melhorar os filtros para obter melhores resultados no extrato do usuário;
* GetAccountBalanceUseCase
  * Corrigir arquitetura de pastas do caso de uso
* MakeTransactionUseCase
  * Usário que está transferindo e que está recebendo a trasanção devem estar ativos no sistema;
  * Deve haver saldo suficiente na carteira do usuário que está transferindo;
  * Sistema deve debitar e creditar corretamente das contas(ambas as operações devem ocorrer com sucesso);