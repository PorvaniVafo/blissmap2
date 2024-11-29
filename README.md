# BlissMap

BlissMap — это платформа для поиска медицинских услуг, предоставляющая пациентам информацию о врачах и клиниках в определенном городе. Она обеспечивает быстрый доступ к проверенным отзывам, повышая качество и скорость поиска медицинских услуг.

---

## Презентация
https://docs.google.com/presentation/d/14BGzbKirEfQI7w9JesW2-5zZpuCXhnxWs4gJecqdCm4/edit?usp=sharing

---

## Техническое задание:
https://docs.google.com/document/d/1cMndVLWrxO8_orxAKo67pc0FfCt2o7vPPEu2--sakVk/edit?usp=sharing

---

## Стек технологий

- **Backend**: Java 17, Spring Boot, Spring Data JPA, Spring Security
- **Database**: PostgreSQL
- **Frontend**: React (можно заменить или адаптировать)
- **Development Tools**: IntelliJ IDEA, Postman (для тестирования API), Git

---

## Основные возможности

- **Поиск и фильтрация** врачей и клиник по специальности и рейтингу.
- **Просмотр проверенных отзывов** с системой модерации для обеспечения их достоверности.
- **Управление пользователями** с использованием ролей и системы аутентификации.
- **Интерфейс для быстрого и удобного поиска** медицинских услуг в одном месте.

---

## Установка и запуск проекта

### Требования

- **Java 17**
- **PostgreSQL**
- **Node.js и npm** (для фронтенда)
- **IntelliJ IDEA** (рекомендуемая IDE)

---

### Шаги для установки

1. **Склонируйте репозиторий**:

    ```bash
    git clone https://github.com/PorvaniVafo/blissmap.git
    cd blissmap
    ```

2. **Настройте PostgreSQL**:
   - Создайте базу данных:
     ```sql
     CREATE DATABASE blissmap;
     ```
   - Убедитесь, что у вас есть пользователь с доступом к этой базе.

3. **Настройте файл `application.properties`**:
   В директории `src/main/resources/application.properties` укажите следующие настройки:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/blissmap
   spring.datasource.username=<ваш-пользователь>
   spring.datasource.password=<ваш-пароль>
   spring.jpa.hibernate.ddl-auto=update
   
## Соберите и запустите бэкенд:

bash
Копировать код
mvn clean install
mvn spring-boot:run
Перейдите в H2 Console (для разработки):

---

## Тестирование API
Используйте Postman для тестирования API. Настройте Basic Auth для защищенных маршрутов.

Username: admin

Password: password123

Разрешение ошибок

Ошибка 401 Unauthorized

Убедитесь, что вы используете правильные учетные данные.

Проверьте наличие пользователя в базе данных:

sql

Копировать код

SELECT * FROM app_user;

Ошибка подключения к базе данных

Проверьте настройки в application.properties.

Убедитесь, что PostgreSQL запущен и настроен.

