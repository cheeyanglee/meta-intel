require recipes-core/zlib/zlib_1.2.11.bb

FILESEXTRAPATHS_append = ":${COREBASE}/meta/recipes-core/zlib/zlib"

SUMMARY = "Zlib Compression Library (Intel-tuned)"

PROVIDES = "zlib"

SRC_URI = "git://github.com/jtkukunas/zlib.git;protocol=git \
           file://ldflags-tests.patch \
           file://run-ptest \
           "

SRCREV = "a43a247bfa16ec5368747b5b64f11ea5ca033010"
S = "${WORKDIR}/git"

RPROVIDES_${PN} += "zlib"
RPROVIDES_${PN}-ptest += "zlib-ptest"

UPSTREAM_CHECK_GITTAGREGEX = "^v(?P<pver>(\d+(\.\d+)+)_jtkv(\d+(\.\d+)+))$"
