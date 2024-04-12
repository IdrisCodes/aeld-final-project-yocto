# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://build/RPI3-Debug/.qtc/package-manager/LICENSE.conan;md5=71aee2551f0ef50993e0a5f6ae12ee58"

# No information for SRC_URI yet (only an external source tree was specified)
SRC_URI = ""

# NOTE: unable to map the following CMake package dependencies: Qt QT
inherit cmake
inherit qt6-cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

DEPENDS = "libgpiod qtbase"

