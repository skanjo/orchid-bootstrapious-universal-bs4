package com.github.skanjo.universal;

import com.eden.orchid.api.OrchidContext;
import com.eden.orchid.api.theme.Theme;

import javax.inject.Inject;

public class UniversalTheme extends Theme {

    @Inject
    public UniversalTheme(OrchidContext context) {
        super(context, "Universal", 100);
    }

    @Override
    protected void loadAssets() {
        super.loadAssets();
    }

}
