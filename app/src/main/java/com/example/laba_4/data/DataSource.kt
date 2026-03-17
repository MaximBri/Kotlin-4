package com.example.laba_4.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.ChildCare
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Forest
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.LocalMall
import androidx.compose.material.icons.filled.NaturePeople
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Store
import com.example.laba_4.R
import com.example.laba_4.data.model.Category
import com.example.laba_4.data.model.Recommendation

object DataSource {

    val categories = listOf(
        Category(id = "coffee", nameResId = R.string.category_coffee, icon = Icons.Filled.Coffee),
        Category(id = "restaurants", nameResId = R.string.category_restaurants, icon = Icons.Filled.Restaurant),
        Category(id = "parks", nameResId = R.string.category_parks, icon = Icons.Filled.Park),
        Category(id = "shopping", nameResId = R.string.category_shopping, icon = Icons.Filled.ShoppingBag),
        Category(id = "kids", nameResId = R.string.category_kids, icon = Icons.Filled.ChildCare)
    )

    val recommendations = listOf(
        // кофейни
        Recommendation(
            id = "coffee_1",
            categoryId = "coffee",
            name = "Coffee Like",
            shortDescription = "Популярная сеть кофе с собой",
            fullDescription = "Одна из самых популярных кофеен Ижевска с широкой сетью точек по всему городу. Отличается доступными ценами, стабильным качеством и большим выбором авторских напитков. Идеальный вариант для тех, кто ценит хороший кофе в дороге.",
            address = "ул. Пушкинская, 268",
            rating = 4.5f,
            icon = Icons.Filled.Coffee
        ),
        Recommendation(
            id = "coffee_2",
            categoryId = "coffee",
            name = "Surf Coffee",
            shortDescription = "Сёрф-атмосфера и specialty-кофе",
            fullDescription = "Кофейня с морской атмосферой и качественным specialty-кофе. Уютный интерьер с деревянными деталями, мягкий свет и расслабляющая музыка создают идеальную обстановку для отдыха. Большой выбор альтернативных методов заваривания и авторских напитков.",
            address = "ул. Карла Маркса, 246",
            rating = 4.7f,
            icon = Icons.Filled.LocalCafe
        ),
        Recommendation(
            id = "coffee_3",
            categoryId = "coffee",
            name = "Traveler's Coffee",
            shortDescription = "Кофейня для путешественников",
            fullDescription = "Уютная кофейня с атмосферой путешествий и приключений. На стенах — карты мира и фотографии далёких стран. Богатое меню авторских кофейных напитков, большой выбор чаёв и вкусная выпечка. Отличное место для встреч с друзьями.",
            address = "ул. Советская, 16",
            rating = 4.6f,
            icon = Icons.Filled.Coffee
        ),
        Recommendation(
            id = "coffee_4",
            categoryId = "coffee",
            name = "Кофейня «Смородина»",
            shortDescription = "Локальная кофейня с домашней выпечкой",
            fullDescription = "Уютная местная кофейня, ставшая любимым местом многих ижевчан. Отличается домашней атмосферой, авторской выпечкой и качественным кофе. Регулярно проводятся творческие мероприятия и мастер-классы. Здесь чувствуешь себя как дома.",
            address = "ул. Ленина, 30",
            rating = 4.8f,
            icon = Icons.Filled.LocalCafe
        ),
        Recommendation(
            id = "coffee_5",
            categoryId = "coffee",
            name = "Double B Coffee",
            shortDescription = "Specialty-кофе высокого уровня",
            fullDescription = "Кофейня федеральной specialty-сети с фокусом на качестве зерна и точности приготовления. Работают с моносортами из разных уголков мира, предлагают фильтр-кофе, эспрессо-напитки и холодные альтернативы. Минималистичный интерьер подчёркивает внимание к продукту.",
            address = "ул. Максима Горького, 79",
            rating = 4.7f,
            icon = Icons.Filled.Coffee
        ),

        // рестораны
        Recommendation(
            id = "rest_1",
            categoryId = "restaurants",
            name = "Ресторан «Чум»",
            shortDescription = "Удмуртская национальная кухня",
            fullDescription = "Единственный в городе ресторан с аутентичной удмуртской кухней. Здесь можно попробовать перепечи с разными начинками, табани (удмуртские блины), зырет и другие блюда, которые готовили ещё наши предки. Интерьер выполнен в духе удмуртской избы с народными орнаментами.",
            address = "ул. Милиционная, 43",
            rating = 4.8f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_2",
            categoryId = "restaurants",
            name = "Ресторан «Мельница»",
            shortDescription = "Европейская кухня в историческом здании",
            fullDescription = "Ресторан в историческом здании с элегантным интерьером и богатым меню европейской кухни. Шеф-повар ежесезонно обновляет меню, используя местные продукты. Уютные залы с живой музыкой по вечерам создают особую атмосферу для романтических ужинов.",
            address = "ул. Горького, 73",
            rating = 4.7f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_3",
            categoryId = "restaurants",
            name = "«Штаб-квартира»",
            shortDescription = "Гастропаб с крафтовым пивом",
            fullDescription = "Популярный гастропаб с широким выбором крафтового пива и авторской кухней. Большое меню закусок, бургеров и горячих блюд. Регулярно проводятся спортивные трансляции, тематические вечеринки и живые концерты. Тёплая дружеская атмосфера.",
            address = "ул. Пушкинская, 154",
            rating = 4.5f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_4",
            categoryId = "restaurants",
            name = "Пиццерия «Пьяцца»",
            shortDescription = "Настоящая итальянская пицца",
            fullDescription = "Итальянская пиццерия с дровяной печью и аутентичными рецептами. Тесто готовится по традиционным итальянским технологиям с длительной ферментацией. В меню — классические и авторские пиццы, пасты и итальянские десерты. Уютный интерьер в средиземноморском стиле.",
            address = "ул. Ленина, 16",
            rating = 4.6f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_5",
            categoryId = "restaurants",
            name = "Кафе «На набережной»",
            shortDescription = "Летнее кафе с видом на Ижевский пруд",
            fullDescription = "Уютное кафе с открытой террасой и живописным видом на Ижевский пруд. Разнообразное меню завтраков, обедов и ужинов. Особенно популярно летом — столики на открытом воздухе позволяют наслаждаться едой под звуки волн. Фирменные блюда из рыбы Ижевского пруда.",
            address = "Набережная Ижевского пруда, 1",
            rating = 4.6f,
            icon = Icons.Filled.Restaurant
        ),

        // парки
        Recommendation(
            id = "park_1",
            categoryId = "parks",
            name = "Парк имени Кирова",
            shortDescription = "Главный парк культуры и отдыха Ижевска",
            fullDescription = "Центральный парк Ижевска, основанный в 1934 году. Раскинулся на берегу Ижевского пруда и предлагает богатую инфраструктуру: аттракционы, кафе, спортивные площадки, лодочная станция. Главная аллея украшена фонтанами. Здесь проходят городские праздники и фестивали.",
            address = "ул. Пушкинская, 222",
            rating = 4.7f,
            icon = Icons.Filled.Park
        ),
        Recommendation(
            id = "park_2",
            categoryId = "parks",
            name = "Набережная Ижевского пруда",
            shortDescription = "Живописная набережная крупнейшего пруда Европы",
            fullDescription = "Ижевский пруд — один из крупнейших искусственных прудов Европы. Благоустроенная набережная протяжённостью несколько километров — любимое место прогулок горожан. Здесь можно покататься на велосипеде, взять лодку напрокат или просто насладиться закатом над водой.",
            address = "Набережная Ижевского пруда",
            rating = 4.8f,
            icon = Icons.Filled.NaturePeople
        ),
        Recommendation(
            id = "park_3",
            categoryId = "parks",
            name = "Летний сад",
            shortDescription = "Исторический парк в центре города",
            fullDescription = "Один из старейших парков Ижевска, основанный в XIX веке. Тенистые аллеи с вековыми деревьями, уютные скамейки, небольшой фонтан. Летом здесь проводятся концерты и выставки под открытым небом. Отличное место для тихой прогулки в самом центре города.",
            address = "ул. Советская, 16",
            rating = 4.5f,
            icon = Icons.Filled.LocalFlorist
        ),
        Recommendation(
            id = "park_4",
            categoryId = "parks",
            name = "Берёзовая роща",
            shortDescription = "Природный лесопарк для тихого отдыха",
            fullDescription = "Живописный лесопарк с многовековыми берёзами в черте города. Протяжённые пешеходные и велосипедные тропы, площадки для отдыха, чистый воздух. Зимой — лыжные трассы. Идеальное место для уединения с природой, не покидая город.",
            address = "Берёзовая роща, Ижевск",
            rating = 4.6f,
            icon = Icons.Filled.Forest
        ),
        Recommendation(
            id = "park_5",
            categoryId = "parks",
            name = "Сквер Калашникова",
            shortDescription = "Современный сквер с памятником оружейнику",
            fullDescription = "Благоустроенный сквер в центре города с памятником Михаилу Тимофеевичу Калашникову — самому известному жителю Ижевска. Ухоженные газоны, современные скамейки и фонари. Отличное место для прогулки и знакомства с историей города.",
            address = "ул. Дерябина, 3",
            rating = 4.5f,
            icon = Icons.Filled.Park
        ),

        // тц
        Recommendation(
            id = "shop_1",
            categoryId = "shopping",
            name = "ТРЦ «Петровский»",
            shortDescription = "Крупнейший торговый центр Ижевска",
            fullDescription = "Один из крупнейших торговых центров Ижевска с более чем 200 магазинами, ресторанами и развлекательными зонами. Многозальный кинотеатр, большой фудкорт, детская игровая зона. Удобное расположение в центре города и большая парковка.",
            address = "ул. Холмогорова, 31",
            rating = 4.5f,
            icon = Icons.Filled.LocalMall
        ),
        Recommendation(
            id = "shop_2",
            categoryId = "shopping",
            name = "ТЦ «Талисман»",
            shortDescription = "Торговый центр в центре города",
            fullDescription = "Популярный торговый центр в самом центре Ижевска с широким ассортиментом магазинов одежды, обуви, электроники и товаров для дома. Уютные кафе и фудкорт, удобная парковка. Особенно популярен среди молодёжи.",
            address = "ул. Пушкинская, 154",
            rating = 4.3f,
            icon = Icons.Filled.ShoppingCart
        ),
        Recommendation(
            id = "shop_3",
            categoryId = "shopping",
            name = "ТРЦ «Аксион»",
            shortDescription = "Семейный торгово-развлекательный центр",
            fullDescription = "Семейный торгово-развлекательный центр с богатой инфраструктурой для отдыха всей семьи. Магазины всех ценовых категорий, детский развлекательный центр, боулинг, кинотеатр и большой фудкорт с разнообразной кухней.",
            address = "ул. Автозаводская, 4",
            rating = 4.4f,
            icon = Icons.Filled.ShoppingBag
        ),
        Recommendation(
            id = "shop_4",
            categoryId = "shopping",
            name = "ТЦ «Европа»",
            shortDescription = "Европейские бренды в центре Ижевска",
            fullDescription = "Торговый центр с акцентом на европейские и международные бренды одежды и аксессуаров. Несколько этажей с магазинами различных ценовых сегментов, кофейни и рестораны. Стильный интерьер и комфортная атмосфера для шопинга.",
            address = "ул. Карла Маркса, 178",
            rating = 4.3f,
            icon = Icons.Filled.Store
        ),
        Recommendation(
            id = "shop_5",
            categoryId = "shopping",
            name = "ТЦ «Флагман»",
            shortDescription = "Современный торговый центр с якорными арендаторами",
            fullDescription = "Современный торговый центр с крупными якорными арендаторами — супермаркетом, магазинами электроники и спорттоваров. Удобная планировка, широкие проходы, большой фудкорт. Регулярно проводятся акции и распродажи. Есть подземная парковка.",
            address = "ул. 10 лет Октября, 63",
            rating = 4.2f,
            icon = Icons.Filled.Store
        ),

        // дети
        Recommendation(
            id = "kids_1",
            categoryId = "kids",
            name = "Зоопарк «Восточный»",
            shortDescription = "Зоопарк с животными из разных континентов",
            fullDescription = "Ижевский зоопарк с коллекцией более 300 видов животных из Азии, Африки и Америки. Просторные вольеры, регулярные кормления с участием посетителей, контактная зона с домашними животными. Отличное место для семейного выходного дня.",
            address = "ул. Кирова, 8",
            rating = 4.5f,
            icon = Icons.Filled.NaturePeople
        ),
        Recommendation(
            id = "kids_2",
            categoryId = "kids",
            name = "Музей Калашникова",
            shortDescription = "Интерактивный музей об оружейнике и городе",
            fullDescription = "Современный музейно-выставочный комплекс, посвящённый жизни и творчеству Михаила Калашникова и оружейной истории Ижевска. Интерактивные экспозиции, мультимедийные инсталляции и детские мастер-классы. Дети с удовольствием погружаются в историю родного города.",
            address = "ул. Дерябина, 3",
            rating = 4.8f,
            icon = Icons.Filled.AccountBalance
        ),
        Recommendation(
            id = "kids_3",
            categoryId = "kids",
            name = "Детский парк аттракционов",
            shortDescription = "Аттракционы для детей в парке Кирова",
            fullDescription = "Детская зона в парке имени Кирова с каруселями, горками, батутами и другими аттракционами для детей разного возраста. Площадки для малышей и для ребят постарше. Летом работает мини-поезд, курсирующий по парку. Рядом — кафе с мороженым и сладкой ватой.",
            address = "ул. Пушкинская, 222 (парк Кирова)",
            rating = 4.4f,
            icon = Icons.Filled.SportsEsports
        ),
        Recommendation(
            id = "kids_4",
            categoryId = "kids",
            name = "Планетарий",
            shortDescription = "Звёздное небо Удмуртии",
            fullDescription = "Ижевский планетарий — одно из любимых мест школьников и их родителей. Захватывающие шоу о звёздном небе, планетах и космических миссиях. Образовательные программы по астрономии, адаптированные для разных возрастов. Телескопы для ночных наблюдений.",
            address = "ул. Красногеройская, 131",
            rating = 4.6f,
            icon = Icons.Filled.Star
        ),
        Recommendation(
            id = "kids_5",
            categoryId = "kids",
            name = "Театр кукол «Тол Бабай»",
            shortDescription = "Кукольный театр с удмуртскими сказками",
            fullDescription = "Государственный театр кукол «Тол Бабай» — один из лучших детских театров республики. Репертуар включает классические сказки и постановки на основе удмуртского фольклора. Яркие красочные декорации, живая музыка и профессиональная игра актёров делают каждый спектакль незабываемым.",
            address = "ул. Коммунаров, 212",
            rating = 4.7f,
            icon = Icons.Filled.ChildCare
        )
    )

    fun getCategory(id: String): Category? = categories.find { it.id == id }

    fun getRecommendationsByCategory(categoryId: String): List<Recommendation> =
        recommendations.filter { it.categoryId == categoryId }

    fun getRecommendation(id: String): Recommendation? = recommendations.find { it.id == id }
}
