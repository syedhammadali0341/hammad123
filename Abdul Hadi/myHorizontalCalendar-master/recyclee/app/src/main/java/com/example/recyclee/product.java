package com.example.recyclee;

public class product {
    private int id;
    private String title, short_desc;
    private double rating;
    private double price;
    private int image;

    public product(int id, String title, String short_desc, double rating, double price, int image) {
        this.id = id;
        this.title = title;
        this.short_desc = short_desc;
        this.rating = rating;
        this.price = price;
        this.image = image;

    }
        public int getId () {
            return id;
        }

        public String getTitle () {
            return title;
        }

        public String getShort_desc () {
            return short_desc;
        }

        public double getRating () {
            return rating;
        }

        public double getPrice () {
            return price;
        }

        public int getImage () {
            return image;
        }
    }
