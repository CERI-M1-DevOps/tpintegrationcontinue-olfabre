### Intégration Continue



Sur gitHub, 

créer un dossier:
`.github`

créer un sous dossier:

`workflows`

créer un fichier salut.yml

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



