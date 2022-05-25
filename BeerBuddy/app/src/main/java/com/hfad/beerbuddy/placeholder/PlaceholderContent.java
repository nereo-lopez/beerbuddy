package com.hfad.beerbuddy.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

    static {
        // Add some sample items.
        addItem(new PlaceholderItem("1", "Persephone Resse's Cup", "Cervecera: \nMadueno Brewing Co.\n\nTipo de Cerveza: \nStout - Milk / Sweet." +
                "\n\nABV : \n6%."));
        addItem(new PlaceholderItem("2", "Milky Brothers", "Cervecera: \nMadueno Brewing Co.\n\n Tipo de Cerveza:\nStout - Milk / Sweet." +
                "\n\nABV : \n6%."));
        addItem(new PlaceholderItem("3", "Xocoveza", "Cervecera: \nInsurgente Brewing Co.\n\nTipo de Cerveza:\nImperial Stout.\n\nABV: \n8.1%."));
        addItem(new PlaceholderItem("4", "Brutal Imperial Stout", "Cervecera:\nBorder Psycho Brewing.\n\nTipo de Cerveza: \nImperial Stout." +
                "\n\nABV: \n10.5%."));

    }
    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    //Item position//
    private static PlaceholderItem createPlaceholderItem(int position) {
        return new PlaceholderItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Detalles de la cerveza: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nDatos Adicionales");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String id;
        public final String nombre;
        public final String data;


        public PlaceholderItem(String id, String nombre, String data) {
            this.id = id;
            this.nombre = nombre;
            this.data = data;
        }

        @Override
        public String toString() {
            return data;
        }
    }
}