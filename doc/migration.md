# Migration
This is a list of things done to get the template converted to theme starting with the original source of the
template and no starter Orchid project. The work could serve to help with repeating this process on another template
conversion to theme.

New steps are added at the top of this list, meaning these steps are in descending order.

## Implement First Home Page
Given HTML from the template I just used AsciiDoc with HTML syntax block to simply add the raw HTML to the site. 
Accessing images from the theme did not work as I thought they would, which was simply adding th correct path for the
link thinking Orchid would look at the site or theme media directory to find the asset. However, that only worked when
the asset was in the site media directory. Casey hinted I should use the asset syntax to refer to the asset, this
caused the image to not only be included in the generated site but created a full link rather than a relative one.

I ran into problems with images embedded in CSS as part of the theme. The quick fix was to override the style of an
element to include the image from the CSS but I needed a better way. Surprisingly the solution, provided by Casey, was
very simple. Just add front matter to the CSS, even if empty, and now the file will be treated as a Pebble template
allowing use of variables in the CSS. I added a two properties to the theme class and set default to the images from 
the theme and used the variable reference in the CSS. Boom! Now when the site was rendered the images from the theme
were included in the generated site and correctly referenced in the CSS and ultimately the HTML. Very cool!

Now I need to make sure to keep theme related media in the theme and out of the site using this technique. 

## Multi-Module Project 
Discovered that I need separate theme project from site project, not able to embed theme in site project. Created a
theme based on BsDoc module and theme code and moved the Universal template files to the theme project. While the
build seems to resolve the dependencies between the project and create the appropriate artifacts, Orchid is not finding
the theme at runtime. Needs some more research to get working.

## Create Default Layout
Copied over css to css, js to js, img to media.
 
## Create Orchid project
Generate the basic Gradle artifacts and then edit build file to include Orchid dependencies.
```
gradle init --type java-library
```

## Add Template Source
Extracted template from file download and copied contents to `distribution` directory.

