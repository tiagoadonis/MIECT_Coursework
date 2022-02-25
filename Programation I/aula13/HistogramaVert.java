
class HistogramaVert{
    public static void main(String[] args) {

        int[] h = {4,3,5,0,1,2};    // array com histograma da ocurrencia dos valores 0 a 5.
        int vmax = h[0];
        for (int v : h)if (v > vmax)vmax=v;
        for (int l=vmax; l>0; l--) { // nº linhas = valor máximo do hist
            for (int c=0; c<h.length; c++) {
                if (h[c] >= l) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
