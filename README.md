# Software-design-pattern
## Шаблоны проектирования на Java
## Порождающий шаблон
### Название шаблона: Абстрактная фабрика (abstract factory)
Абстрактная фабрика – порождающий шаблон проектирования, обеспечивает создание семейств взаимосвязанных или зависящих от друг друга объектов без указания их конкретных классов.   
Пример: предметы в игре из разных локаций, например меч из подземелья, броня из замка   
### Диаграмма классов
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/0627f1cb-3d33-4e8f-87ea-3ac2f41fedf9)
Класс Narrator – хранит какой-то меч и какую-то броню, какую конкретно – зависит от фабрики, которую он использует, talk – пример метода, использует tell конкретных классов.    
Sword и Armor пример абстрактных классов, от них наследуются конкретные классы DungeonSword, CastleSword, DungeonArmor, CastleArmor, возможно здесь целесообразно использовать также шаблон мост. Эти классы используют метод tell для вывода текста.    
LocationFactory – абстрактный класс фабрики, имеет методы для создания абстрактных классов Sword и Armor. От LocationFactory наследуются DungeonFactory и CastleFactory – конкретные фабрики, они создают конкретные классы брони и мечей.    
### Диаграмма последовательностей
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/c5028bf4-2e19-4835-bd76-3a61ed7f6c77)
Пример только для брони   
### Результат работы программы
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/add14033-03de-42c0-b2f5-c2a794686b02)

