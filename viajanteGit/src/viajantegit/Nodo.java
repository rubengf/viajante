/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajantegit;


public class Nodo 
{
	private double x;
	private double y;
        private int pos;
        
        private int valor;
	
	
	public Nodo(int pos, double x, double y) 
	{
		super();
                this.pos = pos;
		this.x = x;
		this.y = y;
	}


        public Nodo(Nodo nodo)
        {
            this.pos = nodo.pos;
            this.x = nodo.x;
            this.y = nodo.y;
        }
        
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
        public int getPos() {
        return pos;
        }

        public void setPos(int pos) {
        this.pos = pos;
        }
	
        public boolean equals(Nodo a)
        {
            return a.getX() == this.getX() && a.getY() == this.getY();
        }

    public int getValor() 
    {
        return valor;
    }

    public void setValor(int valor) 
    {
        this.valor = valor;
    }
        
	
	
}
