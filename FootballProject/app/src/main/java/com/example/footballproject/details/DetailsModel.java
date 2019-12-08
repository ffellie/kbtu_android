package com.example.footballproject.details;

import com.example.footballproject.R;
import com.example.footballproject.data.Team;

import java.util.ArrayList;
import java.util.List;

public class DetailsModel implements Binder.Model {
    @Override
    public Team getTeam (int id){
        List<Team> teamList = new ArrayList<>();
        int[] logos = new int[]{
                R.drawable.mu,
                R.drawable.ars,
                R.drawable.av,
                R.drawable.bou,
                R.drawable.che,
                R.drawable.cp,
                R.drawable.eve,
                R.drawable.lei,
                R.drawable.mc,
                R.drawable.nor,
                R.drawable.pool,
                R.drawable.soton,
                R.drawable.stoke,
                R.drawable.spur,
                R.drawable.sun,
                R.drawable.swan,
                R.drawable.wat,
                R.drawable.wba,
                R.drawable.whu,
                R.drawable.castle
        };

        Team team = new Team("Манчестер Юнайтед", "красные дьяволы", "Old Trafford","1878", "Футбольный клуб «Манче́стер Юна́йтед» (англ. Manchester United Football Club; английское произношение: [ˈmæntʃɛstər ju:ˈnaɪtɪd]) — английский профессиональный футбольный клуб из Траффорда, Большой Манчестер. Был основан в 1878 году под названием «Ньютон Хит (Ланкашир энд Йоркшир Рейлуэй)», в 1902 году изменил название на «Манчестер Юнайтед». Один из самых популярных футбольных клубов в мире[5]. Один из основателей английской Премьер-лиги в 1992 году[6].\n" +
                "\n" +
                "Домашний стадион «Юнайтед», «Олд Траффорд», был открыт в 1910 году. Он является крупнейшим после «Уэмбли» футбольным стадионом в Англии и вмещает около 75 тысяч зрителей.\n" +
                "\n" +
                "«Манчестер Юнайтед» является одним из самых успешных английских клубов по количеству выигранных титулов за всю историю, а под руководством Алекса Фергюсона — самым успешным клубом в Англии, выиграв 38 трофеев с 1986 по 2013 год. В сезоне 2012/13 «Юнайтед» в рекордный 20-й раз выиграл чемпионский титул. В 1968 году «Манчестер Юнайтед» стал первым английским клубом, выигравшим Кубок европейских чемпионов, победив в финале португальскую «Бенфику» со счётом 4:1. В 1999 году клуб во второй раз выиграл главный европейский клубный трофей, одолев в финале мюнхенскую «Баварию» со счётом 2:1[10]. В 2008 году «Юнайтед» вновь выиграл Лигу чемпионов, обыграв в финале лондонский «Челси»[11].\n" +
                "\n" +
                "В 2019 году «Манчестер Юнайтед» занимал третье место по доходам среди всех футбольных клубов мира. В 2019 году Forbes оценивал клуб в 3,81 млрд долларов (3 млрд фунтов). Таким образом «Манчестер Юнайтед» занимает шестое место в списке самых дорогостоящих спортивных клубов в мире и третье место в списке самых дорогостоящих футбольных клубов[14].\n" +
                "\n" +
                "Главным тренером клуба является норвежский специалист Уле Гуннар Сульшер, назначенный на эту должность в декабре 2018 года после увольнения Жозе Моуринью. Капитаном команды в сезоне 2019/20 является Эшли Янг, сменивший ушедшего из клуба Антонио Валенсию.\n" +
                "\n",logos[0]);
        teamList.add(team);
        team = new Team("Арсенал", "канониры", "Emirates Stadium","2015", "Футбольный клуб «Арсена́л» (англ. Arsenal Football Club; английское произношение: [ˈɑrsənəl]) — английский профессиональный футбольный клуб из Северного Лондона, выступающий в Премьер-лиге. Основан в октябре 1886 года. Клуб 13 раз становился чемпионом Англии, 13 раз выигрывал Кубок Англии. Домашним стадионом клуба является «Эмирейтс», вмещающий более 60 тысяч зрителей[1].\n" +
                "\n" +
                "«Арсенал» провёл бо́льшую часть своей истории в высшем дивизионе английского футбола, в 1992 году стал одним из клубов-основателей английской Премьер-лиги[4]. Также клуб является рекордсменом по количеству сезонов подряд, проведённых в высшем дивизионе чемпионата Англии, начиная с 1919 года[5].\n" +
                "\n" +
                "По данным Forbes на 2018 год, «Арсенал» занимал шестое место в списке самых дорогих футбольных клубов мира и оценивался в сумму 2,238 млрд. долларов США[6]. По данным аудиторской компании Deloitte, по итогам сезона 2016/17 «Арсенал» занимал 6-ю строчку в рейтинге самых доходных футбольных клубов с доходом в размере 487,6 млн евро[7].\n" +
                "\n",logos[1]);
        teamList.add(team);
        team = new Team("Астон Вилла", "вилланы", "Villa Park","1874", "Футбольный клуб «А́стон Ви́лла» (англ. Aston Villa Football Club; английское произношение: /ˈæstən ˈvɪlə/) — английский профессиональный футбольный клуб из Бирмингема, графство Уэст-Мидлендс. Был основан в 1874 году. Является одним из 12 клубов-основателей Футбольной лиги Англии в 1888 году. С 1897 года выступает на стадионе «Вилла Парк», вмещающем более 42 тысяч зрителей[4] и входящем в десятку самых вместительных стадионов Англии. С 1992 года по 2016 год клуб выступал в Премьер-лиге, став одним из её 22 основателей[7]. В 2016 году клуб был продан американским предпринимателем Рэнди Лернером китайской компании Recon Group. По итогам сезона 2018/19 выиграл плей-офф Чемпионшипа и вернулся в Премьер-лигу, высший по значимости дивизион в системе футбольных лиг Англии.\n" +
                "\n" +
                "Один из старейших и самых титулованных клубов Англии: на счету «Астон Виллы» семь чемпионских титулов Первого дивизиона и семь побед в Кубке Англии[8]. «Астон Вилла» также является одним из пяти английских клубов, выигравших Кубок чемпионов[9]. Главным соперником «Астон Виллы» является «Бирмингем Сити», с которым разыгрывается бирмингемское дерби[10]. Традиционными цветами клуба являются бордовые футболки с лазурными рукавами, белыми шортами и лазурными гетрами. На эмблеме клуба изображён золотой лев, стоящий на задних лапах, на голубом фоне, с девизом «Prepared» («Готов»)[11].\n" +
                "\n",logos[2]);
        teamList.add(team);
        team = new Team("Борнмут", "вишни", "Vitality Stadium","1899", "Футбольный клуб «Бо́рнмут» (англ. A.F.C. Bournemouth; английское произношение: Слушатьi/ˈbɔːrnməθ/) — английский футбольный клуб из Борнмута, графство Дорсет. В настоящее время выступает в Премьер-лиге, высшем дивизионе в системе футбольных лиг Англии.\n" +
                "\n" +
                "Клуб был основан в 1899 году под названием «Боском» (Boscombe F.C.) на основе существовавшего с 1890 года клуба «Боском Сент-Джонс Инститьют» (Boscombe St. John’s Institute F.C.). В 1923 году клуб изменил название на «Борнмут энд Боском Атлетик» (Bournemouth and Boscombe Athletic F.C.), а с 1972 года клуб называется просто «Борнмут». Домашние матчи с 1910 года клуб проводит на стадионе «Дин Корт» (с 2015 года стадион называется «Виталити» в соответствии со спонсорским соглашением). Большую часть своей истории «Борнмут» провёл в третьем дивизионе английского футбола, но в сезоне 2015/16 впервые вышел в высший дивизион, где и выступает по сей день.\n" +
                "\n" +
                "Прозвище клуба — «вишни» (The Cherries). Цвета клуба — чёрно-красные.\n" +
                "\n" +
                "Главным тренером клуба с октября 2015 года является англичанин Эдди Хау. Капитан команды — Саймон Фрэнсис.\n" +
                "\n",logos[3]);
        teamList.add(team);
        team = new Team("Челси", "пенсионеры", "Stamford Bridge","1905", "Футбольный клуб «Че́лси» (англ. Chelsea Football Club; английское произношение: [ˈtʃɛlsiː]) — английский профессиональный футбольный клуб из западного Лондона. Выступает в английской Премьер-лиге. Основан в 1905 году. Провёл бо́льшую часть своей истории в высшем дивизионе английского футбола. Один из клубов-основателей английской Премьер-лиги в 1992 году[6]. «Челси» шесть раз становился чемпионом Англии, восемь раз выигрывал Кубок Англии и пять раз Кубок Футбольной лиги. Клуб добивался успеха на европейской арене, выиграв Лигу чемпионов УЕФА, дважды Кубок обладателей кубков УЕФА, дважды Лигу Европы УЕФА и Суперкубок УЕФА[7]. «Челси» является одним из пяти клубов, наряду с «Ювентусом», «Аяксом», «Баварией» и «Манчестер Юнайтед», который выиграл все три главных клубных турнира УЕФА, а также единственным клубом, владевшим двумя главными еврокубками одновременно[8][9].\n" +
                "\n" +
                "Несмотря на своё название, клуб располагается не в районе Челси, а в соседнем Фулеме. Домашний стадион «Челси», «Стэмфорд Бридж», на котором клуб играет с момента основания, был открыт в 1877 году[4]. Стадион занимает 9-е место по вместимости в Англии и вмещает более 40 тысяч болельщиков. Владельцем клуба со 2 июля 2003 года является российский бизнесмен Роман Абрамович[10][11].\n" +
                "\n" +
                "На данный момент «Челси» занимает 8-е место в списке клубов с самыми высокими доходами[12]. 8 июня 2017 года журнал Forbes оценил клуб в $1,845 млрд (£1,42 млрд)[13].\n" +
                "\n" +
                "Основная форма — синие футболки и трусы с белыми гетрами, подобная комбинация используется с 1960-х годов. Клубная эмблема несколько раз видоизменялась в попытках модернизации клубной символики; текущая эмблема, церемониальный синий лев, держащий посох, является модифицированной версией эмблемы, впервые принятой в 1953 году; данная версия эмблемы была принята в 2005 году[14]. Клуб занимает пятое место по посещаемости домашнего стадиона за всё время участия в английском футболе[15]. Средняя посещаемость домашних матчей в сезоне 2016/17 составила 41 528 человек, или 99,75 % от общего количества мест[16].\n" +
                "\n" +
                "Главный тренер — Фрэнк Лэмпард. Капитаном команды является Сесар Аспиликуэта.\n" +
                "\n",logos[4]);
        teamList.add(team);
        team = new Team("Кристал Пэлас", "орлы", "Selhurst Park","1905", "Футбольный клуб «Кри́стал Пэ́лас» (англ. Crystal Palace Football Club) — английский профессиональный футбольный клуб из Кройдона, южный Лондон. В настоящее время выступает в Премьер-лиге, высшем дивизионе в системе футбольных лиг Англии.\n" +
                "\n" +
                "Клуб был основан в 1905 году. С 1924 года выступает на стадионе «Селхерст Парк». Главным соперником клуба является «Брайтон энд Хоув Альбион», с которым разыгрывается дерби М23[en]. Команда дважды выходила в финал Кубка Англии — в 1990 и 2016 году — в обоих случаях проиграв «Манчестер Юнайтед». Наилучшим результатом в лиге является 3-е место в Первом дивизионе сезона 1990/91.\n" +
                "\n" +
                "Прозвище клуба — «орлы» (The Eagles). Орёл также находится на эмблеме команды с 1970-х годов.\n" +
                "\n",logos[5]);
        teamList.add(team);
        team = new Team("Эвертон", "Красные Дьяволы", "Goodison Park","1878", "«Э́вертон» (англ. Everton Football Club, английское произношение: /ˈɛvərtən/) — английский профессиональный футбольный клуб из Ливерпуля, Мерсисайд. Домашние матчи проводит на стадионе «Гудисон Парк». Выступает в Премьер-лиге.\n" +
                "\n" +
                "В настоящее время клуб проводит 117-й сезон в высшем дивизионе чемпионата Англии, что является рекордным показателем среди всех английских клубов. Клуб также 9 раз становился чемпионом Англии, что является четвёртым результатом среди английских клубов. «Эвертон» непрерывно играет в высшем дивизионе английского футбола с 1954 года и является одним из клубов-основателей Премьер-лиги в 1992 году.\n" +
                "\n" +
                "«Эвертон» был основан в 1878 году и является одним из клубов-основателей Футбольной лиги Англии в 1888 году. Свой первый чемпионский титул «ириски» выиграли в сезоне 1890/91. Последним на сегодня трофеем «Эвертона» является Кубок Англии 1995.\n" +
                "\n" +
                "Главный тренер команды — Марку Силва, занявший эту должность 31 мая 2018 года после отставки Сэма Эллардайса. Действующий капитан команды — Шеймус Коулман, сменивший в 2019 году покинувшего клуб Фила Ягелку.\n" +
                "\n",logos[6]);
        teamList.add(team);
        team = new Team("Лестер", "лисы", "King Power Stadium","1884", "Футбольный клуб «Ле́стер Си́ти» (англ. Leicester City Football Club) — английский профессиональный футбольный клуб из Лестера. Клуб выступает в высшем дивизионе английского футбола — Премьер-лиге.\n" +
                "\n" +
                "Клуб был основан в 1884 году под названием «Лестер Фосс». В 1919 году клуб изменил название на «Лестер Сити».\n" +
                "\n" +
                "Традиционное среди болельщиков прозвище клуба — «лисы». С этим связан и девиз клуба «Foxes never quit» («Лисы никогда не сдаются»).\n" +
                "\n" +
                "Долгие годы домашней ареной «Лестер Сити» был стадион «Филберт Стрит», на котором клуб выступал в течение 111 лет[3]. С 2002 года домашним стадионом «Лестер Сити» является стадион «Кинг Пауэр» (ранее известен как «Уокерс») вместимостью более 32 тыс. мест.\n" +
                "\n" +
                "Наивысшим достижением клуба является чемпионство в сезоне 2015/16. Команда также трижды выигрывала Кубок Футбольной лиги.\n" +
                "\n",logos[7]);
        teamList.add(team);
        team = new Team("Манчестер Сити", "голубые", "Etihad Stadium","1880", "Футбольный клуб «Манче́стер Си́ти» (англ. Manchester City Football Club; английское произношение: [ˈmæntʃɛstər ˈsɪtɪ]) — английский профессиональный футбольный клуб из Манчестера, выступающий в Премьер-лиге, высшем дивизионе в системе футбольных лиг Англии. Был основан в 1880 году под названием «Сент Маркс (Уэст-Гортон)» (англ. St. Mark's (West Gorton)). В 1887 году был переименован в «Ардуик» (англ. Ardwick A.F.C.). С 1894 года называется «Манчестер Сити».\n" +
                "\n" +
                "За свою историю клуб сменил три стадиона: с момента своего основания и до 1923 года играл на «Хайд Роуд», с 1923 по 2003 год — на «Мейн Роуд». В настоящее время выступает на построенном в 2002 году стадионе «Сити оф Манчестер» (спонсорское название — «Этихад») вместимостью около 55 тыс. зрителей.\n" +
                "\n" +
                "В XX веке «Манчестер Сити» дважды становился чемпионом Англии (в сезонах 1936/37 и 1967/68), четыре раза выигрывал Кубок Англии, пять раз — Кубок Футбольной лиги, трижды — Суперкубок Англии и один раз — международный трофей, европейский Кубок обладателей кубков УЕФА 1970 года. В 1990-е годы «Манчестер Сити» трижды опускался в нижние дивизионы, а также провёл сезон 1998/99 в третьем по значимости дивизионе английского футбола. В 2002 году клуб вернулся в высший дивизион, в котором выступает до сих пор. В 2008 году «Манчестер Сити» был приобретён компанией Abu Dhabi United Group, которая обеспечила значительный приток инвестиций, что позволило осуществить трансферы высокооплачиваемых футболистов. В 2011 году клуб выиграл Кубок Англии. Также по итогам сезона 2010/11 «Сити» напрямую квалифицировался в групповой этап Лиги чемпионов УЕФА и впервые с 1973 года завоевал право участвовать в Суперкубке Англии. Однако 7 августа 2011 года на «Уэмбли» проиграл чемпиону Англии «Манчестер Юнайтед» со счётом 3:2[7].\n" +
                "\n" +
                "В следующем сезоне «Манчестер Сити» спустя 44 года стал чемпионом Англии[8]. «Горожане» при этом обошли своего главного соперника, «Манчестер Юнайтед», лишь по лучшей разнице забитых и пропущенных мячей. 12 августа 2012 года в матче за Суперкубок Англии «Манчестер Сити» добился победы над «Челси» со счётом 3:2[9], и Манчестер Сити впервые за 40 лет завоевал данный трофей[10].\n" +
                "\n",logos[8]);
        teamList.add(team);


        for (int i = 0; i<100; i++){
            if (i%4==0)
                team = new Team("Эвертон", "Красные Дьяволы", "Goodison Park","1878", "«Э́вертон» (англ. Everton Football Club, английское произношение: /ˈɛvərtən/) — английский профессиональный футбольный клуб из Ливерпуля, Мерсисайд. Домашние матчи проводит на стадионе «Гудисон Парк». Выступает в Премьер-лиге.\n" +
                        "\n" +
                        "В настоящее время клуб проводит 117-й сезон в высшем дивизионе чемпионата Англии, что является рекордным показателем среди всех английских клубов. Клуб также 9 раз становился чемпионом Англии, что является четвёртым результатом среди английских клубов. «Эвертон» непрерывно играет в высшем дивизионе английского футбола с 1954 года и является одним из клубов-основателей Премьер-лиги в 1992 году.\n" +
                        "\n" +
                        "«Эвертон» был основан в 1878 году и является одним из клубов-основателей Футбольной лиги Англии в 1888 году. Свой первый чемпионский титул «ириски» выиграли в сезоне 1890/91. Последним на сегодня трофеем «Эвертона» является Кубок Англии 1995.\n" +
                        "\n" +
                        "Главный тренер команды — Марку Силва, занявший эту должность 31 мая 2018 года после отставки Сэма Эллардайса. Действующий капитан команды — Шеймус Коулман, сменивший в 2019 году покинувшего клуб Фила Ягелку.\n" +
                        "\n",logos[i%20]);
            else if (i%4==1)
                team = new Team("Лестер", "лисы", "King Power Stadium","1884", "Футбольный клуб «Ле́стер Си́ти» (англ. Leicester City Football Club) — английский профессиональный футбольный клуб из Лестера. Клуб выступает в высшем дивизионе английского футбола — Премьер-лиге.\n" +
                        "\n" +
                        "Клуб был основан в 1884 году под названием «Лестер Фосс». В 1919 году клуб изменил название на «Лестер Сити».\n" +
                        "\n" +
                        "Традиционное среди болельщиков прозвище клуба — «лисы». С этим связан и девиз клуба «Foxes never quit» («Лисы никогда не сдаются»).\n" +
                        "\n" +
                        "Долгие годы домашней ареной «Лестер Сити» был стадион «Филберт Стрит», на котором клуб выступал в течение 111 лет[3]. С 2002 года домашним стадионом «Лестер Сити» является стадион «Кинг Пауэр» (ранее известен как «Уокерс») вместимостью более 32 тыс. мест.\n" +
                        "\n" +
                        "Наивысшим достижением клуба является чемпионство в сезоне 2015/16. Команда также трижды выигрывала Кубок Футбольной лиги.\n" +
                        "\n",logos[i%20]);
            else if (i%4==2)
                team = new Team("Манчестер Сити", "голубые", "Etihad Stadium","1880", "Футбольный клуб «Манче́стер Си́ти» (англ. Manchester City Football Club; английское произношение: [ˈmæntʃɛstər ˈsɪtɪ]) — английский профессиональный футбольный клуб из Манчестера, выступающий в Премьер-лиге, высшем дивизионе в системе футбольных лиг Англии. Был основан в 1880 году под названием «Сент Маркс (Уэст-Гортон)» (англ. St. Mark's (West Gorton)). В 1887 году был переименован в «Ардуик» (англ. Ardwick A.F.C.). С 1894 года называется «Манчестер Сити».\n" +
                        "\n" +
                        "За свою историю клуб сменил три стадиона: с момента своего основания и до 1923 года играл на «Хайд Роуд», с 1923 по 2003 год — на «Мейн Роуд». В настоящее время выступает на построенном в 2002 году стадионе «Сити оф Манчестер» (спонсорское название — «Этихад») вместимостью около 55 тыс. зрителей.\n" +
                        "\n" +
                        "В XX веке «Манчестер Сити» дважды становился чемпионом Англии (в сезонах 1936/37 и 1967/68), четыре раза выигрывал Кубок Англии, пять раз — Кубок Футбольной лиги, трижды — Суперкубок Англии и один раз — международный трофей, европейский Кубок обладателей кубков УЕФА 1970 года. В 1990-е годы «Манчестер Сити» трижды опускался в нижние дивизионы, а также провёл сезон 1998/99 в третьем по значимости дивизионе английского футбола. В 2002 году клуб вернулся в высший дивизион, в котором выступает до сих пор. В 2008 году «Манчестер Сити» был приобретён компанией Abu Dhabi United Group, которая обеспечила значительный приток инвестиций, что позволило осуществить трансферы высокооплачиваемых футболистов. В 2011 году клуб выиграл Кубок Англии. Также по итогам сезона 2010/11 «Сити» напрямую квалифицировался в групповой этап Лиги чемпионов УЕФА и впервые с 1973 года завоевал право участвовать в Суперкубке Англии. Однако 7 августа 2011 года на «Уэмбли» проиграл чемпиону Англии «Манчестер Юнайтед» со счётом 3:2[7].\n" +
                        "\n" +
                        "В следующем сезоне «Манчестер Сити» спустя 44 года стал чемпионом Англии[8]. «Горожане» при этом обошли своего главного соперника, «Манчестер Юнайтед», лишь по лучшей разнице забитых и пропущенных мячей. 12 августа 2012 года в матче за Суперкубок Англии «Манчестер Сити» добился победы над «Челси» со счётом 3:2[9], и Манчестер Сити впервые за 40 лет завоевал данный трофей[10].\n" +
                        "\n",logos[i%20]);
            else
                team = new Team("Борнмут", "Красные Дьяволы", "Vitality Stadium","1899", "Футбольный клуб «Бо́рнмут» (англ. A.F.C. Bournemouth; английское произношение: Слушатьi/ˈbɔːrnməθ/) — английский футбольный клуб из Борнмута, графство Дорсет. В настоящее время выступает в Премьер-лиге, высшем дивизионе в системе футбольных лиг Англии.\n" +
                        "\n" +
                        "Клуб был основан в 1899 году под названием «Боском» (Boscombe F.C.) на основе существовавшего с 1890 года клуба «Боском Сент-Джонс Инститьют» (Boscombe St. John’s Institute F.C.). В 1923 году клуб изменил название на «Борнмут энд Боском Атлетик» (Bournemouth and Boscombe Athletic F.C.), а с 1972 года клуб называется просто «Борнмут». Домашние матчи с 1910 года клуб проводит на стадионе «Дин Корт» (с 2015 года стадион называется «Виталити» в соответствии со спонсорским соглашением). Большую часть своей истории «Борнмут» провёл в третьем дивизионе английского футбола, но в сезоне 2015/16 впервые вышел в высший дивизион, где и выступает по сей день.\n" +
                        "\n" +
                        "Прозвище клуба — «вишни» (The Cherries). Цвета клуба — чёрно-красные.\n" +
                        "\n" +
                        "Главным тренером клуба с октября 2015 года является англичанин Эдди Хау. Капитан команды — Саймон Фрэнсис.\n" +
                        "\n",logos[i%20]);
            teamList.add(team);
        }
        return teamList.get(id);
    }
}
