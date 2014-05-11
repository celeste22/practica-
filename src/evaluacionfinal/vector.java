/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;

/**
 *
 * @author chikuchis
 */
public class vector {
    private int dim;
    private int elem[];

    public vector(int n) {
        this.dim = n;
        this.elem=new int[dim];
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public int getElem(int pos) {
        return elem[pos];
    }

    public void setElem(int elem,int pos) {
        this.elem[pos] = elem;
    }
    
    
}
