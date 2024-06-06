public class DesvioPadrao {
    public static void main(String[] args) {
        // Definindo as classes como intervalos e suas frequências
        double[][] intervalosClasses = {{2, 6}, {6, 10}, {10, 14}, {14, 18}, {18, 22}};
        int[] frequencias = {5, 12, 21, 15, 7}; // Frequências das classes
        
        double[] pontosMedios = calcularPontosMedios(intervalosClasses);
        
        double media = calcularMedia(pontosMedios, frequencias);
        double variancia = calcularVariancia(pontosMedios, frequencias, media);
        double desvioPadrao = Math.sqrt(variancia);
        
        System.out.printf("Média Ponderada: %.2f%n", media);
        System.out.printf("Variância: %.2f%n", variancia);
        System.out.printf("Desvio Padrão: %.2f%n", desvioPadrao);
    }
    
    public static double[] calcularPontosMedios(double[][] intervalosClasses) {
        double[] pontosMedios = new double[intervalosClasses.length];
        
        for (int i = 0; i < intervalosClasses.length; i++) {
            pontosMedios[i] = (intervalosClasses[i][0] + intervalosClasses[i][1]) / 2;
        }
        
        return pontosMedios;
    }
    
    public static double calcularMedia(double[] classes, int[] frequencias) {
        double somaProduto = 0;
        int somaFrequencias = 0;
        
        for (int i = 0; i < classes.length; i++) {
            somaProduto += classes[i] * frequencias[i];
            somaFrequencias += frequencias[i];
        }
        
        return somaProduto / somaFrequencias;
    }
    
    public static double calcularVariancia(double[] classes, int[] frequencias, double media) {
        double somaQuadrados = 0;
        int somaFrequencias = 0;
        
        for (int i = 0; i < classes.length; i++) {
            somaQuadrados += frequencias[i] * Math.pow(classes[i] - media, 2);
            somaFrequencias += frequencias[i];
        }
        
        return somaQuadrados / somaFrequencias;
    }
}

