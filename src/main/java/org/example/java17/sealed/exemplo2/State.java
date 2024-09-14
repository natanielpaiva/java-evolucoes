package org.example.java17.sealed.exemplo2;

public sealed interface State permits Start, Processing, Finished {}
