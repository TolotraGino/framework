@echo off
REM === Nettoyer les anciens fichiers ===
if exist build rmdir /s /q build
mkdir build

REM === Compiler le servlet ===
echo Compilation de Frontservelet.java ...
javac -cp lib/servlet-api.jar -d build src/Frontservelet.java

if errorlevel 1 (
    echo Erreur de compilation !
    pause
    exit /b
)

REM === Créer le fichier MANIFEST ===
echo Manifest-Version: 1.0 > manifest.txt
echo Main-Class: Frontservelet >> manifest.txt

REM === Générer le JAR ===
echo Creation du fichier Frontservelet.jar ...
jar cfm Frontservelet.jar manifest.txt -C build .

REM === Nettoyage ===
del manifest.txt

echo ====================================
echo Frontservelet.jar a été généré avec succès !
echo ====================================
pause
