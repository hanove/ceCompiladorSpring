package org.example.cecompilador.recovery;
import org.example.cecompilador.compilador.CeCompilador;

public class First {
	
	static public final RecoverySet main = new RecoverySet();
	static public final RecoverySet declaraVariavel = new RecoverySet();
	static public final RecoverySet tipo = new RecoverySet();
	static public final RecoverySet atribuicao = new RecoverySet();
	static public final RecoverySet estruturaRepeticao = new RecoverySet();
	static public final RecoverySet fator = new RecoverySet();
	static public final RecoverySet termo = new RecoverySet();
	static public final RecoverySet expressaoAritmetica = new RecoverySet();
	
	static {
		
		main.add(new Integer(CeCompilador.EOF));
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
		/*
		termo.add(new Integer(CeCompilador.ID));      
		termo.add(new Integer(CeCompilador.CONST_INT));
		termo.add(new Integer(CeCompilador.CONST_FLOAT));
		termo.add(new Integer(CeCompilador.ABREPAR));
		expressaoAritmetica.add(new Integer(CeCompilador.ID));
		expressaoAritmetica.add(new Integer(CeCompilador.CONST_INT));
		expressaoAritmetica.add(new Integer(CeCompilador.CONST_FLOAT));
		expressaoAritmetica.add(new Integer(CeCompilador.ABREPAR));*/
		tipo.add(new Integer(CeCompilador.ID));
	}

}
