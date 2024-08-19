## Architecture

Implemented an MVVM architecture as it fits quite nicely with Jetpack Compose especially when you apply a unidirectional flow of your state/data.

For modularization, set it up as a multi-module file/module structure.

## Challenges

- Images are in PDF
- URLs of icons lack a uri/url scheme (e.g. https, http, etc.)

## Suggestions

- PNGs for images instead of PDF
- Best to add a scheme for the icon URLs

## Key Notes

- Used WorkManager to prepopulate the database via a pseudo-remote call using the sample response JSON file
- Exposed only the data module as main form of accessing data as UI layers doesn't need to know whether the data came from local or network
- Showcased how to setup a custom theme (EmotionTheme) in Jetpack Compose that extends the Material3 Jetpack Compose library
