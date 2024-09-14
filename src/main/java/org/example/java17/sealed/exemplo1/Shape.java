package org.example.java17.sealed.exemplo1;

public sealed abstract class Shape permits Circle, Rectangle, Square {
    public abstract double area();
}
