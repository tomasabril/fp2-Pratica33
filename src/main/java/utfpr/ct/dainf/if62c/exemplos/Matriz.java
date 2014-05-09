/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.exemplos;

/**
 * Representa uma matriz de valores double.
 * Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 * Tomas Abril
 */
public class Matriz {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     */
    public Matriz(int m, int n) {
        mat = new double[m][n];
    }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
     */
    public Matriz getTransposta() {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param mat A matriz a ser somada
     * @return A soma das matrizes
     */
    public Matriz soma(Matriz matB) {
        //throw new UnsupportedOperationException("Soma de matrizes não implementada.");
	Matriz s = new Matriz(mat.length, mat[0].length);
	double[][] sm = s.getMatriz();
	for( int i=0; i < mat.length; i++) {
		for( int j=0; j < mat[0].length; j++) {
			sm[i][j] = mat[i][j] + matB.getMatriz()[i][j];
		}
	}
	    
	return s;
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param mat A matriz a ser multiplicada
     * @return O produto das matrizes
     */
    public Matriz prod(Matriz mat2) {
        //throw new UnsupportedOperationException("Produto de matrizes não implementado.");
	Matriz p = new Matriz(mat.length, mat2.getMatriz()[0].length);
	for(int i=0; i<mat2.getMatriz()[0].length; i++) {
		for(int j=0; j<mat.length; j++) {
			for(int k=0; k<mat[0].length; k++) {
				p.getMatriz()[i][j] += mat[i][k] * mat2.getMatriz()[k][j];
			}
		}
	}
	    
	return p;
    }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" | ");
            }
            s.append("]\n");
        }
        return s.toString();
    }
    
}
