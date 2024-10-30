### Intégration Continue



Sur gitHub,   

- créer un dossier `.github`

- créer un sous dossier `workflows`

- créer un fichier salut.yml

Voici le contenu du fichier:

```yaml
name: Bonjour

on: [push] # Ce workflow se déclenche sur un push dans le dépôt

jobs:
 Salutations: # Nom du job : Salutations
  name: Salutations
  runs-on: ubuntu-latest # OS où s'exécute le job
  steps:
   - name: Hello #une tâche pour saluer
     env:
      personneASaluer: 'Mon voisin Totoro'
     run: echo "Bonjour ${personneASaluer}"
   - name: L'heure de salutation # affiche l'heure de la précédente tâche
     run: echo "L'heure était $(date)."

```

Respecter bien les indentations!

Explications:

```yaml
name: Bonjour
```

Cette ligne donne un nom au workflow dans GitHub Actions. Ici, le workflow s'appelle **"Bonjour"**.

```yaml
on: [push] # Ce workflow se déclenche sur un push dans le dépôt
```

La clé `on` spécifie les événements qui déclenchent l'exécution du workflow. Ici, le workflow se lance à chaque **push** dans le dépôt.

```yaml
jobs:
```

Cette clé contient tous les jobs (ou étapes) du workflow. Un workflow peut avoir plusieurs jobs, exécutés en parallèle ou en série selon les besoins.

```yaml
Salutations: # Nom du job : Salutations
```

Ce nom (`Salutations`) est un identifiant du job au sein du fichier YAML. Le nom peut être choisi librement, tant qu'il respecte les conventions YAML.

```yaml
 name: Salutations
```

Cette ligne donne un nom plus lisible au job, ici **"Salutations"**.

```yaml
runs-on: ubuntu-latest # OS où s'exécute le job
```

La clé `runs-on` spécifie l’environnement d'exécution du job. Ici, il s’exécute sur **`ubuntu-latest`**, qui est la dernière version d’Ubuntu disponible sur GitHub Actions.

```yaml
steps:
```

La clé `steps` définit les différentes étapes (ou tâches) que le job va exécuter. Chaque étape est exécutée dans l’ordre où elle est listée.

```yaml
 - name: Hello #une tâche pour saluer

```

Cette étape s’appelle **"Hello"** et son but est d’afficher un message de salutation.

```yaml
env:
personneASaluer: 'Mon voisin Totoro'
```

Cette sous-clé `env` définit des variables d'environnement pour l'étape en cours. Ici, une variable **`personneASaluer`** est définie avec la valeur **"Mon voisin Totoro"**.

```yaml
 run: echo "Bonjour ${personneASaluer}"
```

La commande `run` exécute une commande shell. Ici, elle affiche un message de salutation utilisant la variable `personneASaluer`, qui affiche : **"Bonjour Mon voisin Totoro"**.

```yaml
 - name: L'heure de salutation # affiche heure précédente tâche

```

Cette étape s’appelle **"L'heure de salutation"** et affiche l'heure actuelle.

```yaml
 run: echo "L'heure était $(date)."
```

Cette commande affiche l'heure au moment de l'exécution, utilisant `$(date)` pour obtenir l’heure actuelle (template literal)



Le fichier `salut.yml` est un workflow simple qui s'exécute après un `push` et affiche une salutation, suivie de l'heure exacte de l’exécution !

On peut désactiver le worflow dans Actions, cliquez sur le nom du workflow et sélectionner `Disable workflow`

![1](1.jpg)