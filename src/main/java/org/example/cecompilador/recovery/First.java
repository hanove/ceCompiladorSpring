package org.example.cecompilador.recovery;
import org.example.cecompilador.compilador.CeCompilador;

public class First {

	static public final RecoverySet main = new RecoverySet();
	static public final RecoverySet declaraVariavel = new RecoverySet();
	static public final RecoverySet declaraTipo = new RecoverySet();
	static public final RecoverySet atribuicao = new RecoverySet();
	static public final RecoverySet estruturaRepeticao = new RecoverySet();
	static public final RecoverySet estruturaWhile = new RecoverySet();
	static public final RecoverySet estruturaDoWhile = new RecoverySet();
	static public final RecoverySet fator = new RecoverySet();
	static public final RecoverySet termo = new RecoverySet();
	static public final RecoverySet expressao = new RecoverySet();
	static public final RecoverySet expressaoRelacional = new RecoverySet();
	static public final RecoverySet expressaoAritmetica = new RecoverySet();

	static public final RecoverySet instrucao = new RecoverySet();
	static public final RecoverySet blocoInstrucao = new RecoverySet();
	static public final RecoverySet estruturaCondicional = new RecoverySet();

	static {

		main.add(new Integer(CeCompilador.EOF));
		/*
		declaraVariavel.add(new Integer(CeCompilador.FIMINSTRUCAO));
		declaraVariavel.add(new Integer(CeCompilador.TIPOINT));
		declaraVariavel.add(new Integer(CeCompilador.TIPOFLOAT));
		declaraVariavel.add(new Integer(CeCompilador.TIPOBOL));
		atribuicao.add(new Integer(CeCompilador.ID));
		estruturaRepeticao.add(new Integer(CeCompilador.DO));
		estruturaRepeticao.add(new Integer(CeCompilador.DOWHILE));
		fator.add(new Integer(CeCompilador.ID));
		fator.add(new Integer(CeCompilador.CONST_INT));
		fator.add(new Integer(CeCompilador.CONST_FLOAT));
		fator.add(new Integer(CeCompilador.ABREPAR));
		*/

		/////////////////////////////////////////////////

		instrucao.add(new Integer(CeCompilador.TIPOINT));
		instrucao.add(new Integer(CeCompilador.TIPOFLOAT));
		instrucao.add(new Integer(CeCompilador.TIPOBOL));
		instrucao.add(new Integer(CeCompilador.ID));
		instrucao.add(new Integer(CeCompilador.CONST_INT));
		instrucao.add(new Integer(CeCompilador.CONST_FLOAT));
		instrucao.add(new Integer(CeCompilador.ABREPAR));
		instrucao.add(new Integer(CeCompilador.ABREBLOCO));
		instrucao.add(new Integer(CeCompilador.IF));
		instrucao.add(new Integer(CeCompilador.WHILE));
		instrucao.add(new Integer(CeCompilador.DO));
		instrucao.add(new Integer(CeCompilador.FECHABLOCO));

		blocoInstrucao.add(new Integer(CeCompilador.TIPOINT));
		blocoInstrucao.add(new Integer(CeCompilador.TIPOFLOAT));
		blocoInstrucao.add(new Integer(CeCompilador.TIPOBOL));
		blocoInstrucao.add(new Integer(CeCompilador.ID));
		blocoInstrucao.add(new Integer(CeCompilador.CONST_INT));
		blocoInstrucao.add(new Integer(CeCompilador.CONST_FLOAT));
		blocoInstrucao.add(new Integer(CeCompilador.ABREPAR));
		blocoInstrucao.add(new Integer(CeCompilador.ABREBLOCO));
		blocoInstrucao.add(new Integer(CeCompilador.IF));
		blocoInstrucao.add(new Integer(CeCompilador.WHILE));
		blocoInstrucao.add(new Integer(CeCompilador.DO));
		blocoInstrucao.add(new Integer(CeCompilador.FECHABLOCO));
		blocoInstrucao.add(new Integer(CeCompilador.DOWHILE));

		declaraVariavel.add(new Integer(CeCompilador.TIPOINT));
		declaraVariavel.add(new Integer(CeCompilador.TIPOFLOAT));
		declaraVariavel.add(new Integer(CeCompilador.TIPOBOL));
		declaraVariavel.add(new Integer(CeCompilador.ID));
		declaraVariavel.add(new Integer(CeCompilador.CONST_INT));
		declaraVariavel.add(new Integer(CeCompilador.CONST_FLOAT));
		declaraVariavel.add(new Integer(CeCompilador.ABREPAR));
		declaraVariavel.add(new Integer(CeCompilador.ABREBLOCO));
		declaraVariavel.add(new Integer(CeCompilador.IF));
		declaraVariavel.add(new Integer(CeCompilador.WHILE));
		declaraVariavel.add(new Integer(CeCompilador.DO));
		declaraVariavel.add(new Integer(CeCompilador.FECHABLOCO));

		//declaraTipo.add(new Integer(CeCompilador.ID));

		atribuicao.add(new Integer(CeCompilador.TIPOINT));
		atribuicao.add(new Integer(CeCompilador.TIPOFLOAT));
		atribuicao.add(new Integer(CeCompilador.TIPOBOL));
		atribuicao.add(new Integer(CeCompilador.ID));
		atribuicao.add(new Integer(CeCompilador.CONST_INT));
		atribuicao.add(new Integer(CeCompilador.CONST_FLOAT));
		atribuicao.add(new Integer(CeCompilador.ABREPAR));
		atribuicao.add(new Integer(CeCompilador.ABREBLOCO));
		atribuicao.add(new Integer(CeCompilador.IF));
		atribuicao.add(new Integer(CeCompilador.WHILE));
		atribuicao.add(new Integer(CeCompilador.DO));
		atribuicao.add(new Integer(CeCompilador.FECHABLOCO));

		declaraTipo.add(new Integer(CeCompilador.ID));

		estruturaCondicional.add(new Integer(CeCompilador.TIPOINT));
		estruturaCondicional.add(new Integer(CeCompilador.TIPOFLOAT));
		estruturaCondicional.add(new Integer(CeCompilador.TIPOBOL));
		estruturaCondicional.add(new Integer(CeCompilador.ID));
		estruturaCondicional.add(new Integer(CeCompilador.CONST_INT));
		estruturaCondicional.add(new Integer(CeCompilador.CONST_FLOAT));
		estruturaCondicional.add(new Integer(CeCompilador.ABREPAR));
		estruturaCondicional.add(new Integer(CeCompilador.ABREBLOCO));
		estruturaCondicional.add(new Integer(CeCompilador.IF));
		estruturaCondicional.add(new Integer(CeCompilador.WHILE));
		estruturaCondicional.add(new Integer(CeCompilador.DO));
		estruturaCondicional.add(new Integer(CeCompilador.FECHABLOCO));

		estruturaRepeticao.add(new Integer(CeCompilador.TIPOINT));
		estruturaRepeticao.add(new Integer(CeCompilador.TIPOFLOAT));
		estruturaRepeticao.add(new Integer(CeCompilador.TIPOBOL));
		estruturaRepeticao.add(new Integer(CeCompilador.ID));
		estruturaRepeticao.add(new Integer(CeCompilador.CONST_INT));
		estruturaRepeticao.add(new Integer(CeCompilador.CONST_FLOAT));
		estruturaRepeticao.add(new Integer(CeCompilador.ABREPAR));
		estruturaRepeticao.add(new Integer(CeCompilador.ABREBLOCO));
		estruturaRepeticao.add(new Integer(CeCompilador.IF));
		estruturaRepeticao.add(new Integer(CeCompilador.WHILE));
		estruturaRepeticao.add(new Integer(CeCompilador.DO));
		estruturaRepeticao.add(new Integer(CeCompilador.FECHABLOCO));

		estruturaWhile.add(new Integer(CeCompilador.TIPOINT));
		estruturaWhile.add(new Integer(CeCompilador.TIPOFLOAT));
		estruturaWhile.add(new Integer(CeCompilador.TIPOBOL));
		estruturaWhile.add(new Integer(CeCompilador.ID));
		estruturaWhile.add(new Integer(CeCompilador.CONST_INT));
		estruturaWhile.add(new Integer(CeCompilador.CONST_FLOAT));
		estruturaWhile.add(new Integer(CeCompilador.ABREPAR));
		estruturaWhile.add(new Integer(CeCompilador.ABREBLOCO));
		estruturaWhile.add(new Integer(CeCompilador.IF));
		estruturaWhile.add(new Integer(CeCompilador.WHILE));
		estruturaWhile.add(new Integer(CeCompilador.DO));
		estruturaWhile.add(new Integer(CeCompilador.FECHABLOCO));

		estruturaDoWhile.add(new Integer(CeCompilador.TIPOINT));
		estruturaDoWhile.add(new Integer(CeCompilador.TIPOFLOAT));
		estruturaDoWhile.add(new Integer(CeCompilador.TIPOBOL));
		estruturaDoWhile.add(new Integer(CeCompilador.ID));
		estruturaDoWhile.add(new Integer(CeCompilador.CONST_INT));
		estruturaDoWhile.add(new Integer(CeCompilador.CONST_FLOAT));
		estruturaDoWhile.add(new Integer(CeCompilador.ABREPAR));
		estruturaDoWhile.add(new Integer(CeCompilador.ABREBLOCO));
		estruturaDoWhile.add(new Integer(CeCompilador.IF));
		estruturaDoWhile.add(new Integer(CeCompilador.WHILE));
		estruturaDoWhile.add(new Integer(CeCompilador.DO));
		estruturaDoWhile.add(new Integer(CeCompilador.FECHABLOCO));

		expressao.add(new Integer(CeCompilador.FIMINSTRUCAO));
		expressao.add(new Integer(CeCompilador.FECHAPAR));

		expressaoRelacional.add(new Integer(CeCompilador.FIMINSTRUCAO));
		expressaoRelacional.add(new Integer(CeCompilador.FECHAPAR));
		expressaoRelacional.add(new Integer(CeCompilador.OPBOOL));

		expressaoAritmetica.add(new Integer(CeCompilador.FIMINSTRUCAO));
		expressaoAritmetica.add(new Integer(CeCompilador.FECHAPAR));
		expressaoAritmetica.add(new Integer(CeCompilador.OPBOOL));
		expressaoAritmetica.add(new Integer(CeCompilador.OPREL));

		termo.add(new Integer(CeCompilador.FIMINSTRUCAO));
		termo.add(new Integer(CeCompilador.FECHAPAR));
		termo.add(new Integer(CeCompilador.OPBOOL));
		termo.add(new Integer(CeCompilador.OPREL));
		termo.add(new Integer(CeCompilador.OPAD));

		fator.add(new Integer(CeCompilador.FIMINSTRUCAO));
		fator.add(new Integer(CeCompilador.FECHAPAR));
		fator.add(new Integer(CeCompilador.OPBOOL));
		fator.add(new Integer(CeCompilador.OPREL));
		fator.add(new Integer(CeCompilador.OPAD));
		fator.add(new Integer(CeCompilador.OPMULT));

		/*
		termo.add(new Integer(CeCompilador.ID));
		termo.add(new Integer(CeCompilador.CONST_INT));
		termo.add(new Integer(CeCompilador.CONST_FLOAT));
		termo.add(new Integer(CeCompilador.ABREPAR));
		expressaoAritmetica.add(new Integer(CeCompilador.ID));
		expressaoAritmetica.add(new Integer(CeCompilador.CONST_INT));
		expressaoAritmetica.add(new Integer(CeCompilador.CONST_FLOAT));
		expressaoAritmetica.add(new Integer(CeCompilador.ABREPAR));*/
		//tipo.add(new Integer(CeCompilador.ID));
	}

}
