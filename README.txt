Задача №2.

Реализована с использованием:
    IntelliJ IDEA 2017.2.1
    jdk1.8.0_144
    gradle-4.1
    Spring 4.3.9

Запуск необходимо осуществлять следующим образом из cmd:
    cd %Project root%
    gradle build
    java -jar build\libs\Task2.jar

    Открыть в браузере страницы:

        - для добавления пользователя с ключами прописать:
          http://localhost:8080/add?name=<Имя>&sname=<Фамилия>&date=<Датарождения>&email=<e-mail>&pass=<Пароль>
          Пример: http://localhost:8080/add?name=Ilya&sname=Kon&date=01.05.1965&email=ilya@mail.ru&pass=P@ssw0rd123

        - для удаления пользователя с ключами прописать:
          http://localhost:8080/rm?email=<e-mail>
          Пример: http://localhost:8080/rm?email=ilya@mail.ru

        - для поиска пользователя с ключами прописать:
          http://localhost:8080/find?email=<e-mail>
          Пример: http://localhost:8080/find?email=ilya@mail.ru

Если пользователя нет, возаращается значение null.
Проверок на дурака нет, полагаем, что пользователь идеален.
Если нужно, то можно доделать.