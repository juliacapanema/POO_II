-- UML da classe Ganho
```bash
------------------
|     Ganho      |
------------------
| - tipoGanho    |
| - mes           |
| - ano           |
| - valorGanho    |
------------------
| + getMes()     |
| + setMes(int)  |
| + getAno()     |
| + setAno(int)  |
| + getTipoGanho()|
| + setTipoGanho(String) |
| + getValorGanho()|
| + setValorGanho(double)|
------------------

-- UML da classe Gasto
+----------------+
|    Gasto       |
+----------------+
| - tipoGasto: String        |
| - mes: int                 |
| - ano: int                 |
| - valorGasto: double       |
| - formaPagamento: String   |
+----------------+
| +getTipoGasto(): String    |
| +setTipoGasto(tipoGasto: String): void|
| +getMes(): int             |
| +setMes(mes: int): void    |
| +getAno(): int             |
| +setAno(ano: int): void    |
| +getValorGasto(): double   |
| +setValorGasto(valorGasto: double): void|
| +getFormaPagamento(): String|
| +setFormaPagamento(formaPagamento: String): void|
+----------------+


-- UML da classe RelatorioFinanceiro
-----------------------------
|   RelatorioFinanceiro     |
-----------------------------
| - listaGanho: ArrayList<Ganho> |
| - listaGasto: ArrayList<Gasto> | |
-----------------------------
| + RelatorioFinanceiro() |
| + adicionaGanho(Ganho) |
| + adicionaGasto(Gasto) |
| + relatorioGasto()     |
| + relatorioGanho()     |
| + relatorioMensal(int, int) |
-----------------------------
```
