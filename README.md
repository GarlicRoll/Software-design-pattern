# Software-design-pattern
## Шаблоны проектирования на Java   
## Структурный шаблон   
### Название шаблона: Мост (Bridge)   
Мост – структурный шаблон проектирования, который позволяет разделять программу на абстракцию и реализацию так, чтобы они изменяться независимо. По сути, присутствует две группы классов, в каждую из которых независимо от другой группы можно добавлять новые классы путём наследования. Тем не менее все классы из одной группы всё равно смогут взаимодействовать со второй. Тем самым образуется так называемый мост.
Пример: противники в броне в компьютерной игре и виды брони, для любого противника можно назначить любую броню. При добавлении классов одной группы не потребуется трогать классы другой.
### Диаграмма классов   
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/f2d3eea3-ff51-4e04-9092-b98d0e503e73)
Класс Armor – абстрактный класс брони, от которого наследуется SilverArmor – серебряная броня, метод useArmor необходим для совершения действия с бронёй определенного типа.    
Класс Enemy – абстрактный класс противника, от которого наследуется Snail и Snake – улитка и змея – противники. Есть геттеры и сеттеры, конструкторы, которые устанавливают броню, а также метод performWithArmor, который позволяет совершить действие с бронёй (надеть её)   
### Диаграмма последовательностей   
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/53bff489-709a-402a-b7f0-aaa54ceff20a)
Пример для брони (для противников всё аналогично)   
### Результат работы программы
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/fc4990b4-b0cd-4343-b991-d09b9170b6a4)