-- xie.chapter definition

CREATE TABLE `chapter` (
  `id` bigint(20) unsigned DEFAULT NULL,
  `chapter_id` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `q_bank_id` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- xie.question definition

CREATE TABLE `question` (
  `id` bigint(20) unsigned DEFAULT NULL,
  `question_id` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `stem` varchar(100) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `analysis` varchar(100) DEFAULT NULL,
  `options` varchar(100) DEFAULT NULL,
  `difficulty` varchar(100) DEFAULT NULL,
  `q_bank_id` varchar(100) DEFAULT NULL,
  `chapter_id` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- xie.volume definition

CREATE TABLE `volume` (
  `id` bigint(20) unsigned DEFAULT NULL,
  `volume_id` varchar(100) DEFAULT NULL,
  `volume_title` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- xie.data_source definition

CREATE TABLE `data_source` (
  `id` bigint(20) unsigned DEFAULT NULL,
  `url` varchar(1000) DEFAULT NULL,
  `data` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;