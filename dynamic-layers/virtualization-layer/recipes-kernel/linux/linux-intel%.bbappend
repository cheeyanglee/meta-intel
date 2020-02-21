require ${@bb.utils.contains('DISTRO_FEATURES', 'virtualization', 'linux-intel_virtualization.inc', '', d)}
