# Google Simple App

Petite application Android qui affiche Google dans une WebView.

## Créer l'APK avec GitHub
1. Crée un dépôt GitHub (par exemple `GoogleSimpleApp`).
2. Envoie tous les fichiers de ce projet dans le dépôt.
3. Ouvre l'onglet **Actions** et lance **Build APK** (ou attends le build après le push).
4. Dans le workflow terminé, télécharge l'artifact **GoogleSimpleApp-debug**.
5. Décompresse l'archive pour récupérer `app-debug.apk`, puis installe-le sur ton téléphone Android 16.

## Construire localement
Ouvre le projet dans Android Studio (JDK 17), puis lance **Build > Build APK(s)**.

L'application nécessite Internet et affiche `https://www.google.com`.
