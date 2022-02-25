// classe Ponto3D herda da classe Ponto2 (classe mãe) - extends
class Ponto3D extends Ponto2 {
    // Propriedades
    // privadas, são só do conhecimento do objeto
    private double z;

   // as propriedades são lidas e atualizadas através de métodos
   public double getZ(){
    return this.z;
   }
   public void setZ(double v){
      this.z = v;
   }

}
