class Ponto2 {
    // Propriedades
    double x;
    double y;

    // Construtores
    Ponto2(double x, double y) {
        this.x=x;
        this.y=y;
    }
    Ponto2() {
        this.x=0;
        this.y=0;
    }

    // Métodos
    public double getX(){
        return this.x;
    }
    public void printP() {
        System.out.printf("ponto(%.1f,%.1f)\n",this.x,this.y);
    }
    public String toString() {
        return String.format("ponto(%.1f,%.1f)\n",this.x,this.y);
    }
    public double dist(double x1,double y1) {
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
    public double dist(Ponto2 p) {
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

}
