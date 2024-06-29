Git es un sistema de control de versiones distribuido utilizado para rastrear cambios en el código fuente durante el desarrollo de software. A continuación se presenta un resumen de los comandos de Git más utilizados:

## Configuración

-   **`git config --global user.name "Tu Nombre"`**: Establece el nombre de usuario global.
-   **`git config --global user.email "tuemail@dominio.com"`**: Establece el correo electrónico global.
-   **`git config --list`**: Muestra la configuración actual.

## Inicio de Repositorio

-   **`git init`**: Inicializa un nuevo repositorio Git.
-   **`git clone <url>`**: Clona un repositorio remoto.

## Control de Cambios

-   **`git status`**: Muestra el estado actual del repositorio.
-   **`git add <archivo>`**: Añade un archivo al área de preparación.
-   **`git add .`**: Añade todos los archivos modificados al área de preparación.
-   **`git commit -m "Mensaje del commit"`**: Realiza un commit con un mensaje descriptivo.
-   **`git commit -a -m "Mensaje del commit"`**: Añade y hace commit de todos los archivos rastreados que han cambiado.

## Historial

-   **`git log`**: Muestra el historial de commits.
-   **`git log --oneline`**: Muestra el historial de commits en una línea por commit.
-   **`git log --graph`**: Muestra el historial de commits con un gráfico de ramas.

## Ramas

-   **`git branch`**: Lista las ramas locales.
-   **`git branch <nombre_rama>`**: Crea una nueva rama.
-   **`git checkout <nombre_rama>`**: Cambia a una rama existente.
-   **`git checkout -b <nombre_rama>`**: Crea y cambia a una nueva rama.
-   **`git merge <nombre_rama>`**: Fusiona una rama con la rama actual.
-   **`git branch -d <nombre_rama>`**: Elimina una rama.

## Sincronización

-   **`git remote`**: Lista los remotos configurados.
-   **`git remote add <nombre> <url>`**: Añade un repositorio remoto.
-   **`git fetch`**: Descarga los objetos y referencias de otro repositorio.
-   **`git pull`**: Descarga y fusiona cambios desde un repositorio remoto.
-   **`git push`**: Sube los cambios al repositorio remoto.

## Revertir Cambios

-   **`git reset <archivo>`**: Saca un archivo del área de preparación.
-   **`git reset --hard`**: Resetea el índice y el directorio de trabajo al último commit.
-   **`git revert <hash_commit>`**: Crea un nuevo commit que revierte los cambios de un commit específico.
-   **`git checkout -- <archivo>`**: Deshace los cambios en el archivo especificado y lo devuelve a su estado del último commit.

## Etiquetas

-   **`git tag`**: Lista las etiquetas en el repositorio.
-   **`git tag -a <nombre_etiqueta> -m "Mensaje"`**: Crea una etiqueta anotada.
-   **`git tag <nombre_etiqueta>`**: Crea una etiqueta ligera.
-   **`git push origin <nombre_etiqueta>`**: Sube una etiqueta específica al repositorio remoto.
-   **`git push --tags`**: Sube todas las etiquetas al repositorio remoto.

## Otros Comandos Útiles

-   **`git stash`**: Guarda temporalmente los cambios sin hacer commit.
-   **`git stash pop`**: Recupera los cambios guardados en el stash.
-   **`git stash list`**: Lista los stashes guardados.
-   **`git diff`**: Muestra las diferencias entre archivos no preparados y el último commit.
-   **`git diff --staged`**: Muestra las diferencias entre archivos preparados y el último commit.

Este resumen cubre los comandos básicos y más utilizados en Git, pero Git ofrece muchas más funcionalidades avanzadas. Para obtener más detalles, se recomienda consultar la [documentación oficial de Git](https://git-scm.com/doc).