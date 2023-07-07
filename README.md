# Software-design-pattern
## Шаблоны проектирования на Java
## Структурный шаблон
### Название шаблона: Компоновщик (Composite)
Компоновщик – структурный шаблон, который позволяет создавать иерархические древовидные структуры произвольной сложности, элементы которых могут свободно взаимодействовать с единым интерфейсом. Позволяет работать с несколькими классами через один объект.   
### Диаграмма классов    
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/c56e2ffe-f5f6-4dec-a877-3eb76c0386d5)    
Класс Mob – общий класс как для составного объекта, так и для конечного. Метод для примера – вывод текста.    
Классы Boss и Minion – наследники класса Mob, Minion – «лист» в древовидной структуре. Boss – класс, который может хранить в себе ещё другие объекты.    
### Диаграмма последовательности
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/a271a29c-6d35-4b91-9ed7-4e1c8cfc63a9)    
На диаграмме последовательности пример с двумя приспешниками и одним боссом.
### Результат работы программы
![image](https://github.com/GarlicRoll/Software-design-pattern/assets/75137969/35337f64-016a-4b5b-8fea-2f4fee4fead7)    

