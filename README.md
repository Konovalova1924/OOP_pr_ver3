# will game with OOP 

## Урок 1.
Принципы ООП: Инкапсуляция, наследование, полиморфизм
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так, чтобы в основной программе небыло видно их полей. В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя. Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
## Урок 2.
Создать две команды по 10 человек. Первая команда: крестьянин, волшебник, арбалетчик, копейщик. Вторая: крестьянин, снайпер, монах и вор. Каждому задать случайное имя и вывести в консоль. Добавить в проект класс, предназначенный для хранения координат. Добавить в абстрактный класс поле, экземпляр класс координат. Пробросить координаты через конструкторы наследников так, чтобы создавая объекты вы передавали в параметрах имя и аоординаты. Скорректировать алгоритм заполнения комманд. Кроме имён каждый персонаж должен иметь координаты. Одна комманда находится с левой стороны другая с правой(у=0 и у=9). В класс лучников добавить метод поиск ближайшего противника. Алгоритм расчёта расстояний реализовать в классе координат.
## Урок 3. 
Некоторые стандартные интерфейсы Java и примеры их использования
Добавить в файл интерфейса метод void step() это будет основной метод взаимодействыия с объектами. Добавить интерфейс в базовый абстрактный класс. Реализовать этот метод во всех классах наследниках. Для начала просто заглушкой.
Доработать классы лучников. Лучник должен во первых проверить жив ли он и есть ли у него стрелы, если нет то завершить метод. Есль всё да, то найти ближайшего противника и выстрелить по немы и, соответственно потратить одну стрелу. Реализовать весь функционал лучников в методе step().
Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле. Крестьянин = 0, маги=1, пехота=2, лучники=3. В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих комманд а с наименьшей в конце.
## Урок 4. 
ООП: Обобщения. ч1
Реализовать метод step() пехоты. Первое проверяем живы ли мы, потом ищем ближайшего противника. Если противник в соседней клетке, наносим повреждение. Иначе двигаемся в сторну противника. Алгоритм движения, если dX>dY двигаемся по x иначе по y. dX и dY (разница наших координат и ближайшего противника) знаковые, от знака зависит направление.