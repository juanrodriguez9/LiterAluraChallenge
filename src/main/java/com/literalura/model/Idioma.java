package com.literalura.model;

public enum Idioma {
    ES("es"),
    EN("en"),
    FR("fr"),
    IT("it"),
    PT("pt");

    private String idioma;

    Idioma(String idioma) {
        this.idioma=idioma;
    }
    public static Idioma fromString (String abr){
        for (Idioma idioma : Idioma.values()){
            if (idioma.idioma.equalsIgnoreCase(abr)){
                return idioma;
            }
        }
        throw new IllegalArgumentException("idioma no encontrado");
    }
}
