# Instalando Git

Para habilitar un ambiente de Git es necesario realizar los siguientes pasos:

 - Instalar Editor por Defecto

 - Instalar Git

 - Configuración Inicial de Git

 - Configurar Editor por defecto

## Instalar Editor por Defecto

Para este curso usaremos [Visual Studio Code](https://code.visualstudio.com/download). Descargar e instalar.

Adicional, podemos usar la extensión **GitLens** para **Visual Studio Code**.

## Instalar Git

### En Linux Ubuntu:

 1. Abrir una Terminal
 1. Para instalar Git ejecutar:

        $ sudo add-apt-repository ppa:git-core/ppa
        $ sudo apt update
        $ sudo apt install git

> También podemos usar `apt-get` para instalar Git.

### En Windows:

 1. Descaragar [Git](https://git-scm.com/downloads)
 1. Instalar con las opciones por defecto (al seleccionar el editor por defecto podemos usar Visual Studio Code)

## Configuración Inicial de Git

> Por defecto, en Windows esta configuración se realiza durante la instalación de **Git**.

Ejecutar las siguientes líneas para realizar la configuración inicial de Git:

Configurar Git con tu nombre

    $ git config --global user.name "<Tu nombre completo>"

Configurar Git con tu e-mail

    $ git config --global user.email "<Tu e-mail>"

Configurar la configuración de colores del texto de salida

    $ git config --global color.ui auto

Configurar la forma en que se despliegan los estatus en conflicto

    $ git config --global merge.conflictstyle diff3
    $ git config --list

## Configurar Editor por defecto

Para configurar el editor por defecto (**Visual Studio Code**) de Git ejecutar el siguiente comando:

    $ git config --global core.editor "code --wait"
