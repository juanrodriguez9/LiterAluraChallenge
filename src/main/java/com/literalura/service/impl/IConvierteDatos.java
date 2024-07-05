package com.literalura.service.impl;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class<T> clase);
}
