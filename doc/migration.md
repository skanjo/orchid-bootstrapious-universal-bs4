# Migration
This is a list of things done to get the template converted to theme starting with the original source of the
template and no starter Orchid project. The work could serve to help with repeating this process on another template
conversion to theme.

New steps are added at the top of this list, meaning these steps are in descending order.

## Multi-Module Project 
Discovered that I need separate theme project from site project, not able to embed theme in site project. Created a
theme based on BsDoc module and theme code and moved the Universal template files to the theme project. While the
build seems to resolve the dependencies ebtween the project and create the appropriate artifacts, Orchid is not finding
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

