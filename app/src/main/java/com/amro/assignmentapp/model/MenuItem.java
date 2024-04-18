package com.amro.assignmentapp.model;

import androidx.annotation.NonNull;

public record MenuItem(String category, String name, String description) {

    @NonNull
    @Override
    public String toString() {
        return name();
    }
}

