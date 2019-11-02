package org.launchcode.java.studios.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        // add Menu items
        MenuItem crabCakes = new MenuItem("Lump Crab Cakes", "Lump crab meat. Avocado green tomato sala, Bern's blend mustard butter sauce.", 19.95, "Appetizers");
        MenuItem oystersRock = new MenuItem("Oysters Rockefeller", "Spinach, pancetta, fennel leeks, Bern's four cheese blend.", 19.95, "Appetizers");
        MenuItem shrimpCocktail = new MenuItem("Shrimp Cocktail", "Chilled shrimp served with a choice of Bern's sauces; classic cocktail, grainy mustard remoulade or fresh ginger cockail sauce.", 18.95, "Appetizers");
        MenuItem shrimpGrilled = new MenuItem("Charcoal-Grilled Shrimp", "Creamed corn, beurre blanc, herb oil.", 18.95, "Appetizers");
        MenuItem escargot = new MenuItem("Escargot", "Bern's original recipe. Served with house-made garlic toast.", 14.95, "Appetizers");

        MenuItem filetMignon = new MenuItem("Filet Mignon", "Filet Mignon is a boneless cut of beef that is also the most tender cut of steak. Ours is specifically selected for us from heavy U.S. tenderloins.", 47.95, "Entree");
        MenuItem porterhouse = new MenuItem("Porterhouse", "Porterhouse is sort of \"two steaks in one\": an aged-on-the-loin Filet (better because of longer dry aging) and a Strip. The Porterhouse is the most aged steak we have and should be ordered only if you like well aged steak. Remember also, that this popular steak may have one or two tougher bites because the true sirloin begins here and is connected with a seam that we do our best to remove.", 58.78, "Entree");
        MenuItem tBone = new MenuItem("T-Bone", "T-Bone is the same as Porterhouse, except with a smaller filet. This is the only steak not practical to serve fresh because it's in the center of the loin and would necessitate cutting a fresh loin in two. It is generally not quite as aged as the Porterhouse.", 54.16, "Entree");
        MenuItem duckConfit = new MenuItem("Duck Confit", "Caramelized fingerling potatoes, wild mushrooms, arugula, green peppercorn sauce.", 40.95, "Entree");
        MenuItem chickenBern = new MenuItem("Chicken Bern", "Marinated, breast of chicken, dusted in ten spiced flour, almond flour & sesame seeds, arugula, stir-fry vegetables, crispy shiitake mushrooms Brian, and soy Armagnac sauce.", 33.95, "Entree");
        MenuItem lambRack = new MenuItem("Rack of Lamb", "6 bones.", 64.95, "Entree");

        // add Menu
        Menu bernsMenu = new Menu();

        // add menu items to Menu
        bernsMenu.addItem(crabCakes);
        bernsMenu.addItem(oystersRock);
        bernsMenu.addItem(shrimpCocktail);
        bernsMenu.addItem(shrimpGrilled);
        bernsMenu.addItem(escargot);
        bernsMenu.addItem(duckConfit);
        bernsMenu.addItem(chickenBern);
        bernsMenu.addItem(lambRack);
        bernsMenu.addItem(porterhouse);
        bernsMenu.addItem(filetMignon);
        bernsMenu.addItem(tBone);

        // remove menu items from Menu
        bernsMenu.removeItem(shrimpGrilled);
        bernsMenu.removeItem(escargot);

        // print menu items
        System.out.println(crabCakes);
        System.out.println(tBone);

        // print menu
        System.out.println(bernsMenu);
    }
}
