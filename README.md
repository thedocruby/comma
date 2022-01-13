# COMMA
#### *the Configurable Options Menu Modding API*

---

### NOTICE: COMMA is currently in EARLY ALPHA and should NOT yet be used for mod development.
#### The API should soon be in a state where it is complete enough to be used in the development of bleeding-edge experimental mods.
#### Feel free to submit a pull request if you have something you wish to contribute.

---

## Description

COMMA is a mod configuration API (config API) that aims to use modern libraries and programming techniques to create a config generation experience that is both intuitive and flexible for the mod developers of tomorrow. Using SpongePowered's flexible [Configurate](https://github.com/SpongePowered/Configurate) library, COMMA is able to add JSON serializers for all of Minecraft's commonly used data types, through an internal library called MCereal (not yet available separately). On top of this, our modern use of flexible metaprogramming techniques allows COMMA to integrate with your mod, without any hassle.

## License

This API library is available under the LGPLv3 license. see the bundled `LICENSE` file for details.
