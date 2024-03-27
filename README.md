# meta-intel

OpenEmbedded/Yocto BSP layer for Intel platforms.

## Dependencies

This layer primarily depends on OpenEmbedded-Core (OE-Core). However, certain
recipes may require additional layers to support optional features or
programming languages not supported by OE-Core. Such recipes are located within
the `dynamic-layers` directory.

Base dependencies:
- [Bitbake](https://git.openembedded.org/bitbake)
- [Oe-Core](https://git.openembedded.org/openembedded-core)

Dynamic additional dependencies:

- [Meta-Openembedded](https://git.openembedded.org/meta-openembedded/tree/meta-oe)
- [Meta-Python](https://git.openembedded.org/meta-openembedded/tree/meta-python)
- [Meta-Clang](https://github.com/kraj/meta-clang.git)


## Contents

- [Building and booting meta-intel BSP layers](documentation/building_and_booting.md)
- [Intel oneAPI DPC++/C++ Compiler](documentation/dpcpp-compiler.md)
- [Secure Boot](documentation/secureboot/README)
- [Tested Hardware](documentation/tested_hardware.md)
- [Guidelines for submitting patches](documentation/submitting_patches.md)
- [Reporting bugs](documentation/reporting_bugs.md)
- [Maintainers](documentation/MAINTAINERS.md)


