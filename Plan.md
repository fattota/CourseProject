<h1>План автоматизации тестирования покупки тура</h1>

<h2>Сценарии</h2>

    Для сценариев будут использоваться следующие валидные значения:
    * "Номер карты" - "1111 2222 3333 4444";
    * "Месяц" - "08";
    * "Год" - "24"
    * "Владелец" - "Ivan Ivanov"8
    * "CVC" - "123"

<h3>1. Отправка заполненной карты. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. В поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>2. Отправка заполненной формы. В поле "Владелец" ввести имя без пробела на латинице. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 3-21 знаками на латинице без пробела (например "IvanIvanov").
    5. В поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>3. Отправка заполненной формы. В поле "Владелец" ввести имя через дефис на латинице. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" именем и фамилией 3-21 знаками на латинице через дефис (например "Ivan Mamin-Seberyak").
    5. В поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>4. Отправка заполненной формы. В поле "Владелец" ввести имя на латинице с точкой. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" именем 3-21 знаками на латинице с сокращением и точкой (например "I. Mamin-Seberyak").
    5. В поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>5. Отправка заполненной формы. В поле "Владелец" ввести имя на латинице, состоящее только из заглавных букв. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" именем 3-21 знаками на латинице заглавными буквами (например "IVAN IVANOV").
    5. В поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>6. Отправка заполненной формы. В поле "Владелец" ввести имя на латинице, состоящее только из строчных букв. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" именем 3-21 знаками на латинице строчными буквами (например "ivan ivanov").
    5. В поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется текст "Неверный формат заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>7. Отправка пустой формы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Все поля подчеркиваются красным. Под каждым полем появляется текст "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>8. Отправка заполенной формы с пустым полем "CVC". Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" оставить пустым.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "CVC" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>9. Отправка заполенной формы с пустым полем "Владелец". Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" оставить пустым.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>10. Отправка заполенной формы с пустым полем "Месяц". Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" оставить пустым.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Месяц" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>11. Отправка заполенной формы с пустым полем "Год". Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" оставить пустым.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>12. Отправка заполенной формы. В поле "Владелец" ввести имя на кириллице. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" именем 3-21 знаками на кириллице (например "Иван Иванов").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется сообщение "Неверный формат заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>13. Отправка заполенной формы. В поле "Владелец" ввести иероглифы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" иероглифами (например " 有便请来 ").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется сообщение "Неверный формат заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>14. Отправка заполенной формы. В поле "Владелец" ввести цифровые знаки. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 3-21 цифровыми знаками (например "123456789").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется сообщение "Неверный формат заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>15. Отправка заполенной формы. В поле "Владелец" ввести нецифровые и небуквенные знаки. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 3-21 нецифровыми и небуквенными знаками (например "!+;.,:%№").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется сообщение "Неверный формат заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>16. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице с пробелом в начале. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 3-21 знаками на латинице с пробелом в начале (например " Ivan Ivanov").
    Ожидаемый результат: пробел игнорируется, остальные знаки отображаются
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>17. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице, состоящее из 3-х букв. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 3-мя знаками на латинице (например "Yan").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>18. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице, состоящее из 2-х букв. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 2-мя знаками на латинице (например "In").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Владелец" подчеркивается красным цветом, под полем появляется сообщение "Неверный формат заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>19. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице, состоящее из 4-х букв. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 4-мя знаками на латинице (например "Yana").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>20. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице, состоящее из 21 символа. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 21 знаком на латинице (например "Vladislav Pozsharskiy").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>21. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице, состоящее из 22 символов. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 22-мя знаками на латинице (например "Vladisolav Pozsharskiy").
    Ожидаемый результат: последний знак не отображается.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>22. Отправка заполенной формы. В поле "Владелец" ввести ввести имя на латинице, состоящее из 20 символов. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. Заполнить поле "Владелец" 20-ю знаками на латинице (например "Vladislav Pozsharsky").
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>23. Отправка заполенной формы. В поле "Месяц" ввести ввести прошедший месяц. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести прошедший месяц.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Месяц" подчеркивается красным цветом, под полем появляется сообщение "Неверно указан срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>24. Отправка заполенной формы. В поле "Месяц" ввести ввести текущий месяц. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести текущий месяц.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>25. Отправка заполенной формы. В поле "Месяц" ввести несуществующий месяц. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести несуществующий месяц (например"24").
    3. В поле "Год" ввести текущий год.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Месяц" подчеркивается красным цветом, под полем появляется сообщение "Неверно указан срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>26. Отправка заполенной формы. В поле "Месяц" ввести значение "00". Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести значение "00".
    3. В поле "Год" ввести текущий год.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Месяц" подчеркивается красным цветом, под полем появляется сообщение "Неверно указан срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>27. Отправка заполенной формы. В поле "Месяц" ввести отрицательное значение. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести отрицательное значение (например "-01").
    Ожидаемый результат: знак "-" проигнорируется, в поле будет отображаться значение без минуса.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>28. Отправка заполенной формы. В поле "Месяц" ввести месяц с пробелом в начале. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести месяц с пробелом в начале.
    Ожидаемый результат: пробел проигнорируется, в поле будет отображаться только цифровые символы.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>29. Отправка заполенной формы. В поле "Месяц" ввести месяц с пробелом в середине. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести месяц с пробелом в середине.
    Ожидаемый результат: пробел проигнорируется, в поле будет отображаться только цифровые символы.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>30. Отправка заполенной формы. В поле "Месяц" ввести нецифровые и небуквенные символы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести нецифровые и небуквенные символы (например "@%").
    Ожидаемый результат: знаки не отобразятся, поле останется незаполненным.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Месяц" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>31. Отправка заполенной формы. В поле "Месяц" ввести буквенные символы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести буквенные символы (например "qw").
    Ожидаемый результат: знаки не отобразятся, поле останется незаполненным.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Месяц" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>32. Отправка заполенной формы. В поле "Год" ввести прошедший год. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести просшедший год.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Истек срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>33. Отправка заполенной формы. В поле "Год" ввести несуществующий год. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести год из будущего (например "50").
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Неверно указан срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>34. Отправка заполенной формы. В поле "Год" ввести значение "00". Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести "00".
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Истек срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>35. Отправка заполенной формы. В поле "Год" ввести отрицательное значение. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести отрицательное значение (например "-23").
    Ожидаемый результат: знак "-" проигнорируется, в поле будет отображаться год без минуса.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>36. Отправка заполенной формы. В поле "Год" ввести год, который наступит через 6 лет. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести год, который наступит через 6 лет (например "28").
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Неверно указан срок действия карты".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>37. Отправка заполенной формы. В поле "Год" ввести год, который наступит через 5 лет. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести год, который наступит через 5 лет (напимер "27").
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>38. Отправка заполенной формы. В поле "Год" ввести год, который наступит через 4 года. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести год, который наступит через 4 года (напимер "26").
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>39. Отправка заполенной формы. В поле "Год" ввести нецифровые и небуквенные символы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести нецифровые и небуквенные символы (напимер "$&").
    Ожидаемый результат: знаки не отобразятся, поле останется пустым.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>40. Отправка заполенной формы. В поле "Год" ввести буквенные символы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести буквенные символы (напимер "ab").
    Ожидаемый результат: знаки не отобразятся, поле останется пустым.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "Год" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>41. Отправка заполенной формы. В поле "CVC" ввести нецифровые и небуквенные символы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести 3 нецифровых и небуквенных символа (например "#$*").
    Ожидаемый результат: знаки не отобразятся, поле останется пустым.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "CVC" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>42. Отправка заполенной формы. В поле "CVC" ввести буквенные символы. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести 3 буквенных символа (например "abc").
    Ожидаемый результат: знаки не отобразятся, поле останется пустым.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "CVC" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>43. Отправка заполенной формы. В поле "CVC" ввести 2 цифровых знака. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести 2 цифровых зака.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Поле "CVC" подчеркивается красным цветом, под полем появляется сообщение "Поле обязательно для заполнения".
    2.Форма не отправляется, в базе данных записей о данной попытке не появляется.

<h3>44. Отправка заполенной формы. В поле "CVC" ввести 4 цифровых знака. Карта APPROVED</h3>

    Предусловие: для тестирования используется карта APPROVED - "1111 2222 3333 4444", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести валидное значение.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести 4 цифровых зака.
    Ожидаемый результат: последний знак не отображается.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Успешно! Операция одобрена банком."
    3.В базе данных сервиса появляется запись об успешной покупке тура со статусом APPROVED.

<h3>45. Отправка заполенной формы. Карта DECLINED</h3>

    Предусловие: для тестирования используется карта APPROVED - "5555 6666 7777 8888", форма открывается кнопкой "Купить".
    Шаги:
    1. В поле "Номер карты" ввести номер катры.
    2. В поле "Месяц" ввести валидное значение.
    3. В поле "Год" ввести валидное значение.
    4. В поле "Владелец" ввести валидное значение.
    5. Поле "CVC" ввести валидное значение.
    6. Нажать кнопку "Продолжить".
    Ожидаемый результат:
    1.Текст кнопки "Продолжить" изменится на "Отправляем запрос в банк".
    2.Через 30 секунд появляется всплывающее окно с сообщением "Ошибка! Банк отказал в проведении транзакции."
    3.В базе данных сервиса появляется запись об отклонении транзакции со статусом DECLINED.


<h2>Перечень используемых инструментов с обоснованием выбора</h2>

    1.Github - хранилище кода и автотестов;
    2.JUnit5 - платформа для написания автотестов и их запуска, широко используемая среда тестирования для приложений Java;
    3.Java - широко используемый язык;
    4.IntelliJ IDEA - одна из самых популярных сред разработки в мире;
    5.Gradle - универсальная система управления проектами. Система сама скачивает необходимые для тестов библиотеки и их зависимости;
    6.Selenide - фреймворк для автоматизированного тестирования вебприложений. Преимущества: поддержка Ajax, мощные селекторы, простая конфигурация;
    7.Docker -система контейнеризации для работы с базами данных;
    8.Docker Compose - инструмент для запуска мультиконтейнерных приложений;
    9.Allure - фреймворк для создания визуально понятной картины выполнения тестов;


<h2>Перечень и описание возможных рисков при автоматизации</h2>

    1.Утечка информации из базы данных;
    2.Изменение данных в базе в процессе тестирования;
    3.Автоматизация может занимать много времени;
    4.Увеличение стоимости тестирования;
    5.Возможны трудности с поиском локаторов на страницах сервиса;
    6.Если в процессе разработки измениться код (например изменят названия селекторов, используемых в коде), тесты работать не будут;
    7.Время на поддержку автотестов;
    8.Если есть баг с самом банковском сервисе, тесты упадут.


<h2>Интервальная оценка с учетом рисков (в часах)</h2>

    60 часов


<h2>План сдачи работ</h2>

    * Автотесты - 18.04.22;
    * Результаты прогона автотестов - 20.04.22;
    * Отчет об автоматизации - 22.04.22









