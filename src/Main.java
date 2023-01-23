
public class Main {
        public static void main(String[] args) {
            System.out.println("Products");
            Products products1 = new Products("botella", 1, 8.0, "botella de plástico");
            Products products2 = new Products("vaso",2,2.50,"vaso de cartón");
            Products products3 = new Products("tenedor",3,5.50,"tenedor de plata");
            Products products4 = new Products("cuchillo",4,6.0,"cuchillo de plata");
            Products products5 = new Products("cuchara",5, 5.50,"cuchara de plata");
        Products[] arrayproducts = new Products[]{products1,products2,products3,products4,products5};
        System.out.println(products1);
        System.out.println(products2);
        System.out.println(products3);
        System.out.println(products4);
        System.out.println(products5);
        Double totalCost = null;
        for (Products product :arrayproducts){
            totalCost = product.getCost();
    }
        System.out.println("Estadísticas:");
        System.out.println("Suma del precio total de los productos:"+totalCost);

        //Calcular la media de precio de los productos del array
        double averageCost = totalCost / arrayproducts.length;
        System.out.println("La media de precio de los productos: " + averageCost);

        //Calcular el precio máximo
        Double maxCost = arrayproducts[0].getCost();
        for (Products arrayproducts : arrayproducts) {
            if (arrayproducts.getCost() > maxCost) {
                maxCost = arrayproducts.getCost();
            }
        }
        System.out.println("El precio máximo: " + maxCost);
    }
}

