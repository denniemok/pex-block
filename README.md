<br>
<h3 align="center">PermissionsEx Safeguard</h3>
<p align="center">
    <img src="https://img.shields.io/badge/Version-1.0.0-green"> <img src="https://img.shields.io/badge/Spigot-1.8+-lightgrey"> <img src="https://img.shields.io/badge/License-MIT-blue"> <img src="https://img.shields.io/badge/Language-Java-yellow">
</p>

<p align="center">
    <a href="https://github.com/denniemok/pex-block/releases">Latest Release</a> •
    <a href="https://github.com/denniemok/pex-block/wiki">User Guide</a> •
    <a href="https://github.com/denniemok/pex-block/issues">Issue Tracker</a>
</p>
<br>

<hr>

### Introduction
This is a minimalist plugin with exactly one function: makes any PermissionsEx command console-only and blocks the usage of PermissionsEx-related exploits. Nothing fancy or complicated is involved. It only does the simplest task you ask for, and hence the performance.

Originally being part of [BattleAsya Utility](https://github.com/denniemok/battleasya-utility), this component is now made available separately with enhanced configurability.

<hr>

### Features
- Blocks all PEX commands in-game, including `/pex`, `/permissionsex`, `/permissions:ex`.
- Fixes bypasses that mix uppercase and lowercase letters in PEX commands (e.g., `/PeX promotE`).
- Made PEX commands available only for those with the correct permission in-game.
- Made PEX commands mostly console-only to uphold permission security.
- Fixes the notorious crash exploit with `/pex promote a a`.

<hr>

### Runtime Requirements
- Java 8 or above
- Spigot 1.8 or above, or equivalent forks

<hr>

### Build Dependencies
- Java 8
- Spigot-API 1.8.8 R0.1

<hr>

This project is released under the [MIT License](https://opensource.org/license/mit/).
