#
# Copyright (c) Siemens AG, 2018
#
# SPDX-License-Identifier: MIT

require recipes-bsp/u-boot/u-boot-custom.inc

SRC_URI += " \
    ftp://ftp.denx.de/pub/u-boot/u-boot-${PV}.tar.bz2 \
    "
SRC_URI[sha256sum] = "839bf23cfe8ce613a77e583a60375179d0ad324e92c82fbdd07bebf0fd142268"

# Just for testing purposes, distro package would be recent enough
U_BOOT_TOOLS_PACKAGE = "1"
