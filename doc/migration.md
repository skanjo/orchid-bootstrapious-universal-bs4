# Migration
This is a list of things done to get the template converted to theme starting with the original source of the
template and no starter Orchid project. The work could serve to help with repeating this process on another template
conversion to theme.

New steps are added at the top of this list, meaning these steps are in descending order.

## Create Orchid project
Generate the basic Gradle artifacts and then edit build file to include Orchid dependencies.
```
gradle init --type java-library
```

## Add Template Source
Extracted template from file download and copied contents to `distribution` directory.

