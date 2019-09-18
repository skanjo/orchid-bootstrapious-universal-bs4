package com.github.skanjo.universal;

import com.eden.orchid.api.OrchidContext;
import com.eden.orchid.api.options.annotations.Description;
import com.eden.orchid.api.options.annotations.Option;
import com.eden.orchid.api.options.annotations.StringDefault;
import com.eden.orchid.api.theme.Theme;

import javax.inject.Inject;

public class UniversalTheme extends Theme {

    @Option
    @StringDefault("assets/media/boxed-pattern.png")
    @Description("Textured pentagon background image.")
    private String boxedBackground;

    @Option
    @StringDefault("assets/media/texture-bw.png")
    @Description("Textured pentagon background image.")
    private String pentagonBackground;


    @Inject
    public UniversalTheme(OrchidContext context) {
        super(context, "Universal", 100);
    }

    public String getBoxedBackground() {
        return boxedBackground;
    }

    public void setBoxedBackground(String boxedBackground) {
        this.boxedBackground = boxedBackground;
    }

    public String getPentagonBackground() {
        return pentagonBackground;
    }

    public void setPentagonBackground(String pentagonBackground) {
        this.pentagonBackground = pentagonBackground;
    }

    @Override
    protected void loadAssets() {
        super.loadAssets();

        // You can keep the vendor assets in this repo, or you can use an HTTP url to a CDN. When serving locally,
        // Orchid will use the CDN URL to keep builds fast, but when publishing the site, Orchid will download those
        // assets automatically and reference the local file, to be sure your site still works even if that CDN
        // goes down.
        addJs("assets/js/vendor/jquery/jquery.min.js");
        addJs("assets/js/vendor/popper.js/umd/popper.min.js");
        addJs("assets/js/vendor/bootstrap/js/bootstrap.min.js");
        addJs("assets/js/vendor/jquery.cookie/jquery.cookie.js");
        addJs("assets/js/vendor/waypoints/lib/jquery.waypoints.min.js");
        addJs("assets/js/vendor/jquery.counterup/jquery.counterup.min.js");
        addJs("assets/js/vendor/owl.carousel/owl.carousel.min.js");
        addJs("assets/js/vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js");
        addJs("assets/js/jquery.parallax-1.1.3.js");
        addJs("assets/js/vendor/bootstrap-select/js/bootstrap-select.min.js");
        addJs("assets/js/vendor/jquery.scrollto/jquery.scrollTo.min.js");
        addJs("assets/js/front.js");

        addCss("assets/js/vendor/bootstrap/css/bootstrap.min.css");
        addCss("assets/js/vendor/bootstrap-select/css/bootstrap-select.min.css");
        addCss("assets/js/vendor/owl.carousel/assets/owl.carousel.css");
        addCss("assets/js/vendor/owl.carousel/assets/owl.theme.default.css");
        addCss("assets/css/style.default.css");
        addCss("assets/css/custom.css");
    }

}
