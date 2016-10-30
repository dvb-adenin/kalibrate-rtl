SUMMARY = "calibration tool for use with rtl-sdr devices"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=0eae42b21c81e0e7c8c3e8a545e156c9"

inherit autotools pkgconfig

SRC_URI = "git://github.com/dvb-adenin/kalibrate-rtl.git \
          "
SRC_URI[md5sum] = "541e68b28601abcad14c912c8d8d1c3d"
SRC_URI[sha256sum] = "b70f3b5d171dfff89beb6dc275f408b22f4cd65a96db17891de15b1f59f21037"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
DEPENDS = "librtlsdr fftw"