# Trabalho 1
**Nome**: Arthur A. Galdino

**Turma**: 34 2024/1

## Atividade 1 - Partida de Tênis

O código é composto pela classe pública, o *entry* point ``main``, alguns métodos e uma classe privada ``DiscountPolicy`` que controla a politica de desconto.

O controle de horario é feito no corpo da função ponto de entrada, que também considera a possibilidade de uma partida começar em um dia e terminar em outro como medida preventiva através da "constante" ``START_TIME_CHECK_TRIGGER``. Existe também o limitador de quanto tempo uma partida pode se sobrepor sobre o dia seguinte através da variável estática ``END_TIME_PANIC_TRIGGER``. Estas duas medidas servem para aumentar o contraste entre uma inserção errada e uma sobreposição possível. *Embora tenha se mostrado eficiente, não inibe o problema, a aplicação continua suscetível*.

A existência de um *overload* no método ``calculateFinalPrice()`` é intencional e se refere ao cenário de reusabilidade do código onde o estabelecimento _não possui politica de desconto_. Uma aproximação parecida (porém extremamente [Go Horse](https://gist.github.com/banaslee/4147370)) seria criar uma instância de politica de desconto com desconto zero. Não foi testado no contexto da avaliação porque o enunciado não traz a possibilidade da inexistência de política de desconto.

## Atividade 2

O código é composto somente pela classe pública, o *entry point* e um método  para classificar dadas as informações inseridas utilizando condicionais aninhadas.