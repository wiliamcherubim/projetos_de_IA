let media = parseFloat(gets());

if (media < 5) {
    print('REP')
    // Executa se a primeira for verdadeira
} else if (media >= 5 && media < 7) {
    print('REC')
    // Executa se a primeira foi falsa, mas esta é verdadeira
} else {
    print('APR')
    // Executa se nenhuma das anteriores foi verdadeira
}