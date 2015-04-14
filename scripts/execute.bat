@echo off

set BASE_DIR=%~dp0

java -cp "%BASE_DIR%../lib/*" sample.jenkins.Main %*
