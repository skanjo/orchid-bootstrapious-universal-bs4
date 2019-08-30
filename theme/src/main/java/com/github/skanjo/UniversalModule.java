package com.github.skanjo;

import com.eden.orchid.api.registration.OrchidModule;
import com.eden.orchid.api.theme.Theme;

public class UniversalModule extends OrchidModule {

    @Override
    protected void configure() {
        addToSet(Theme.class, UniversalTheme.class);
    }

}
