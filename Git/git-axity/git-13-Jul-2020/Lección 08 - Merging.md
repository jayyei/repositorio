# Merging

En esta lección veremos:

 - ¿Qué es merge?

 - Cómo realizar un Merge entre Branches

 - Los dos principales tipos de **Merge**:
	 - Fast-forward merge

	 - Regular merge

## ¿Qué es merge?

Recordemos que el propósito de un branch (por ejemplo `sidebar`) es que nos permite realizar cambios que no afectan al branch `master`. Una vez que realizamos cambios en el branch `sidebar` podemos decidir que esos cambios no aplicarán, eliminarlos o mantenerlos y posteriormente combinarlos con otra rama.

**A la acción de combinar dos branches se le denomina `merge`.**

Para entender cómo funciona el comando merge, podemos ver el siguiente video:

**Video >>> (dar clic)**

[![Git merge](http://img.youtube.com/vi/gQiWicrreJg/0.jpg)](http://www.youtube.com/watch?v=gQiWicrreJg "Git merge")

## Fast-forward merge

Este es el más simple de los merge, ya que como se puede observar en el video, el apuntador `HEAD` del branch `master` es movido al commit más `adelantado`.

> Recordemos en la práctica anterior creamos un branch llamado `footer` basado en el branch `master`. Sobre `footer` (el cual en ese momento es una copia de `master`) se agregaron los enlaces de redes sociales. Por lo que footer tiene el commit más `adelantado`.

Tomando como base el resultado de la práctica anterior, para realizar un fast-forward merge ejecutamos el siguiente comando:

```bash
$ git merge footer
```

![img_08_git_merge_01](images/img_08_git_merge_01.png)

## Regular merge

Este tipo de merge es el más común ya que implica combinar dos branches cuyas rutas son diferentes.

> Recordemos en la práctica anterior creamos un branch llamado `sidebar` basado en el branch `master`. Tanto en master como en sidebar realizamos cambios por lo que ambos branches tomaron rutas diferentes.

Para realizar un regular merge ejecutamos el siguiente comando:

```bash
$ git merge sidebar
```

![img_08_git_merge_02](images/img_08_git_merge_02.png)

> Esta acción implica realizar un `commit`, ya que la propia acción de este tipo de merge implica cambios sobre los archivos.
> Podemos cambiar el mensaje del commit, sin embargo, es una práctica común usar el mensaje de commit del merge por defecto.

![img_08_git_merge_03](images/img_08_git_merge_03.png)

Veamos el log de commits después de los merge:

```bash
$ git log --oneline --decorate --graph --all
```

![img_08_git_merge_04](images/img_08_git_merge_04.png)


### Información adicional

-   [Basic Merging](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging#Basic-Merging) en Git Book
-   [git-merge](https://git-scm.com/docs/git-merge) en Git Docs
-   [git merge](https://www.atlassian.com/git/tutorials/git-merge) en Atlassian blog
