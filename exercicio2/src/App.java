public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 10 de SQL");

        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita"); 

        Visualizacao vi = new Visualizacao(g[0], v[1]);

        System.out.println(vi);



    }
}
