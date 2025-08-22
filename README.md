# Taller-de-nivelacion-1
## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es un sistema que registra el historial de cambios de un conjunto de archivos. A diferencia de un proyecto tradicional, permite controlar versiones, colaborar en equipo y recuperar versiones anteriores de forma sencilla.

---

## 2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

- *Working directory*: es el espacio donde trabajas directamente con los archivos.
- *Staging area (index)*: es el área intermedia donde decides qué cambios serán incluidos en el próximo commit.
- *Repository (repositorio local)*: almacena todos los commits realizados, es decir, el historial del proyecto.

---

## 3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag)

Git usa una estructura basada en objetos:
- *Blob*: representa el contenido de un archivo.
- *Tree*: organiza blobs y subdirectorios como una estructura de carpetas.
- *Commit*: guarda un snapshot del proyecto junto con información de autor y mensaje.
- *Tag*: señala versiones específicas del proyecto, como lanzamientos.

---

## 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Un commit se crea con git commit -m "mensaje". Cada objeto commit guarda:
- Referencia al estado de los archivos (tree).
- Autor y fecha.
- Mensaje descriptivo.
- Referencia al commit anterior (padre), si lo hay.

---

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

- *git fetch* descarga actualizaciones del repositorio remoto, pero no modifica tu copia local.
- *git pull* hace lo mismo que fetch pero además fusiona los cambios automáticamente en tu rama activa.

---

## 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Una rama es un puntero móvil a un commit. Git las utiliza para aislar diferentes líneas de desarrollo. A medida que agregas commits, la rama avanza automáticamente al último commit realizado.

---

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Se hace un merge con git merge nombre_rama. Pueden surgir conflictos si los mismos archivos fueron modificados en ramas distintas. Se resuelven editando los archivos manualmente y luego confirmando con git add y git commit.

---

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

El staging permite seleccionar los archivos que quieres incluir en el próximo commit. Si lo omites, Git no incluirá esos cambios en el commit, aunque estén modificados localmente.

---

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

El .gitignore indica a Git qué archivos o carpetas debe ignorar. Es útil para evitar subir archivos temporales, de configuración personal o de sistema que no deben ir al repositorio.

---

## 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

- --amend modifica el último commit, útil para corregir errores sin generar otro historial.
- Un nuevo commit agrega otro punto en la historia del repositorio, sin cambiar lo anterior.

---

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

git stash guarda temporalmente los cambios no confirmados. Es útil cuando necesitas cambiar de rama o actualizar sin perder tu trabajo en curso. Luego puedes recuperarlo con git stash pop.

---

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios?

- *git reset*: elimina commits o cambia el estado del staging.
- *git revert*: crea un commit nuevo que revierte uno anterior.
- *git checkout*: permite volver a versiones anteriores de archivos o ramas.

---

## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

- origin es el repositorio original que clonaste.
- upstream se refiere al repositorio fuente si hiciste un fork.  
Usa git remote add, git fetch upstream, git merge upstream/main para mantener tu fork actualizado.

---

## 14. ¿Cómo puedo inspeccionar el historial de commits?

- *git log* muestra el historial completo de commits.
- *git diff* permite ver las diferencias entre versiones.
- *git show* da detalles sobre un commit específico.

 ## Programación en Java

### 15. ¿Cuáles son los tipos de datos primitivos en Java?

Java tiene 8 tipos de datos primitivos:
- byte: Entero de 8 bits.
- short: Entero de 16 bits.
- int: Entero de 32 bits.
- long: Entero de 64 bits.
- float: Decimal de 32 bits.
- double: Decimal de 64 bits.
- char: Carácter Unicode de 16 bits.
- boolean: Valor lógico (true o false).

---

### 16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

- if / else: Ejecutan bloques de código dependiendo de una condición booleana.
- switch: Evalúa una variable y ejecuta el caso correspondiente.
- Bucles:
  - for: Itera un número determinado de veces.
  - while: Repite mientras la condición sea verdadera.
  - do-while: Similar al while, pero se ejecuta al menos una vez.

### 17. ¿Por qué es importante usar nombres significativos para variables y métodos?

Usar nombres claros y descriptivos:
- Mejora la legibilidad del código.
- Facilita el mantenimiento por otros programadores (o por uno mismo en el futuro).
- Evita errores por malentendidos.

### 18. ¿Qué es la Programación Orientada a Objetos (POO)?

La POO es un paradigma de programación que organiza el código en *objetos* que combinan datos (atributos) y comportamientos (métodos). Permite crear software modular, reutilizable y escalable.

### 19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

1. *Abstracción*: Ocultar detalles complejos y mostrar solo lo necesario.
2. *Encapsulamiento*: Proteger los datos internos del objeto.
3. *Herencia*: Reutilizar código mediante clases base y derivadas.
4. *Polimorfismo*: Permitir que una acción tenga diferentes comportamientos según el objeto.

### 20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

La *herencia* permite que una clase (subclase) herede atributos y métodos de otra clase (superclase).  
En Java se usa con la palabra clave extends.

java
class Animal {
    void hablar() {
        System.out.println("Hace un sonido");
    }
}

class Perro extends Animal {
    void hablar() {
        System.out.println("Ladra");
    }
}
