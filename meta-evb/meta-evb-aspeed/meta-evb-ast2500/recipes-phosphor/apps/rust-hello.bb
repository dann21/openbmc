inherit cargo

SUMMARY = "Hello World"
DESCRIPTION = "Hello World in Rust for Itami"
LICENSE = "CLOSED"
PR = "r1"

FILESEXTRAPATHS_append := "${THISDIR}:"

S = "${WORKDIR}"
SRC_URI += "file://rust-hello.rs \
            file://Cargo.toml \
           "
